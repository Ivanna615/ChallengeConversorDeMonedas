package com.conversor;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Crear solicitud HTTP
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("TU_URL_AQUI")) // Reemplaza TU_URL_AQUI con tu URL real
                    .GET()
                    .build();

            // Crear cliente HTTP
            HttpClient client = HttpClient.newHttpClient();

            // Enviar solicitud y obtener respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Convertir JSON a un objeto ApiResponse
            Gson gson = new Gson();
            ApiResponse apiResponse = gson.fromJson(response.body(), ApiResponse.class);

            // Filtrar y mostrar solo las monedas de interés
            System.out.println("Base Code: " + apiResponse.getBase_code());
            System.out.println("Tasas de Conversión Seleccionadas:");
            String[] monedasInteres = {"USD", "ARS", "BOB", "BRL", "CLP", "COP"};

            for (String moneda : monedasInteres) {
                Double tasa = apiResponse.getConversion_rates().get(moneda);
                if (tasa != null) {
                    System.out.println(moneda + ": " + tasa);
                } else {
                    System.out.println(moneda + ": No disponible en la respuesta de la API.");
                }
            }

            // Realizar conversiones entre monedas
            Scanner scanner = new Scanner(System.in);

            // Pedir al usuario el monto
            System.out.println("\nIngrese el monto que desea convertir:");
            double monto = scanner.nextDouble();

            // Pedir moneda de origen
            System.out.println("Ingrese la moneda de origen (por ejemplo, USD):");
            String monedaOrigen = scanner.next().toUpperCase();

            // Pedir moneda de destino
            System.out.println("Ingrese la moneda de destino (por ejemplo, ARS):");
            String monedaDestino = scanner.next().toUpperCase();

            // Obtener las tasas de cambio
            Double tasaOrigen = apiResponse.getConversion_rates().get(monedaOrigen);
            Double tasaDestino = apiResponse.getConversion_rates().get(monedaDestino);

            // Verificar que las tasas existan
            if (tasaOrigen != null && tasaDestino != null) {
                // Realizar la conversión
                double montoConvertido = (monto / tasaOrigen) * tasaDestino;
                System.out.printf("El monto %.2f %s equivale a %.2f %s.%n",
                        monto, monedaOrigen, montoConvertido, monedaDestino);
            } else {
                System.out.println("Una o ambas monedas ingresadas no están disponibles.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

