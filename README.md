# Conversor de Divisas en Java

Este es un proyecto de conversor de divisas desarrollado en Java, como parte del programa [ONE de Oracle](https://www.oracle.com/ar/education/oracle-next-education/) y el desafío propuesto por [Alura Latam](https://www.aluracursos.com/). El objetivo de este proyecto es convertir una cantidad de dinero de una moneda a otra usando la API de ExchangeRate.

## 🚀 Introducción

Este proyecto permite convertir montos de diferentes monedas utilizando tasas de cambio proporcionadas por la API [ExchangeRate API](https://www.exchangerate-api.com/). El programa toma como entrada la moneda de origen, el monto y la moneda de destino, y luego realiza la conversión automáticamente.

### Funcionalidades

- **Conversión de Divisas:** El programa toma un monto en la moneda de origen y lo convierte a la moneda de destino seleccionada por el usuario.
- **Manejo de Excepciones:** Se asegura de manejar excepciones si el usuario ingresa datos incorrectos o si hay problemas con el servidor.
- **Operaciones Múltiples:** El programa permite realizar múltiples conversiones de divisas.

## ⭐ Requisitos

Para ejecutar este proyecto, necesitarás instalar los siguientes programas y bibliotecas:

### Software

- [Intellij IDEA](https://www.jetbrains.com/idea/download/?section=windows) (Versión gratuita)
- [Postman](https://www.postman.com/) para probar las peticiones HTTP.
- [Git bash](https://git-scm.com/downloads) para manejar el control de versiones.

### Librerías

- **Gson:** Esta librería es utilizada para manipular la respuesta en formato JSON desde la API. [Documentación de Gson](https://github.com/google/gson)
- **Jackson:** Alternativa a Gson para manipular JSON (se recomienda usar Gson).

Puedes agregar estas librerías a tu proyecto descargándolas e incorporándolas manualmente o utilizando Maven para gestionarlas automáticamente.
