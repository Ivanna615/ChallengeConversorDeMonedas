# Conversor de Monedas

## Descripción
Este proyecto es un **Conversor de Monedas** desarrollado en Java como parte de un desafío de programación. Su objetivo es permitir la conversión entre diferentes monedas utilizando datos actualizados obtenidos de una API de tasas de cambio. El proyecto incluye funcionalidades clave como la conexión a una API, análisis de datos JSON, filtrado de monedas, cálculos de conversión y una interfaz textual para la interacción con el usuario.

## Tecnologías Utilizadas
- **Java JDK**: Versión 11 en adelante
- **Gson**: Biblioteca para manipulación de JSON (versión 2.10.1 o superior)
- **IntelliJ IDEA**: IDE principal para el desarrollo
- **Postman**: Herramienta para probar solicitudes HTTP
- **Exchange Rate API**: Fuente de tasas de cambio actualizadas

## Características del Proyecto
- Configuración del entorno de desarrollo en Java.
- Consumo de una API para obtener datos de tasas de cambio.
- Análisis y manipulación de respuestas JSON utilizando Gson.
- Filtrado de monedas según códigos como ARS, BRL, USD, entre otros.
- Lógica para calcular conversiones entre monedas.
- Interfaz textual en la consola para interacción con el usuario.

## Instalación y Configuración
1. **Clona el repositorio**:
   ```bash
   git clone https://github.com/Ivanna615/ChallengeConversorDeMonedas.git
   ```

2. **Configura las dependencias**:
    - Asegúrate de tener Java JDK 11 o superior instalado.
    - Incluye la biblioteca Gson en tu proyecto (puedes usar Maven):
      ```xml
      <dependency>
          <groupId>com.google.code.gson</groupId>
          <artifactId>gson</artifactId>
          <version>2.10.1</version>
      </dependency>
      ```

3. **Obtén tu clave de la API**:
    - Regístrate en [Exchange Rate API](https://www.exchangerate-api.com/) para obtener tu clave de API.

4. **Configura el entorno**:
    - Usa IntelliJ IDEA para abrir el proyecto y configurarlo con las dependencias necesarias.

## Uso
1. **Ejecuta el programa** desde tu IDE o línea de comandos.
2. **Selecciona una opción** en el menú para convertir entre monedas disponibles.
3. **Ingresa los datos** solicitados, como la moneda de origen, la moneda de destino y el monto.
4. **Recibe el resultado** de la conversión en la consola.

### Ejemplo de salida:
```
Bienvenido al Conversor de Monedas
1. Convertir USD a BRL
2. Convertir USD a ARS
3. Convertir BRL a COP
4. Salir
Selecciona una opción: 1
Ingresa el monto en USD: 100
Resultado: 100 USD es igual a 530 BRL.
```

## Recursos de Referencia
- [Documentación de Exchange Rate API](https://www.exchangerate-api.com/docs/java-currency-api)
- [Biblioteca Gson en Maven Central](https://mvnrepository.com/artifact/com.google.code.gson/gson)
- [Guía para usar HttpClient en Java](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html)

## Pruebas
Se realizaron pruebas exhaustivas para garantizar:
- La exactitud de los cálculos de conversión.
- El manejo adecuado de errores, como entradas no válidas o monedas inexistentes.
- La correcta interacción en el menú textual.

## Autor
- **Ivana Mota**  
  Desarrollador Java - Programa ONE

---

¡Gracias por explorar este proyecto! ¡Espero que disfrutes interactuando con el Conversor de Monedas! 🚀

