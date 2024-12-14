import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Moneda {
    private int entrada;
    private int salida;
    private float cantidad;

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    // Método que realiza la conversión llamando a la API
    public void calculoTransformado() {
        try {
            String apiKey = "b7f5e5ee91a51dfc00f2124b"; // Coloca aquí tu clave API de ExchangeRate-API
            String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/";

            // Moneda de origen (entrada)
            String monedaEntrada = TasaDeConversion.getOpcion(entrada);
            // Moneda de destino (salida)
            String monedaSalida = TasaDeConversion.getOpcion(salida);

            // Realizamos la solicitud a la API
            HttpURLConnection connection = (HttpURLConnection) new URL(url + monedaEntrada).openConnection();
            connection.setRequestMethod("GET");

            InputStreamReader reader = new InputStreamReader(connection.getInputStream());

            // Usamos Gson para convertir la respuesta de la API a un objeto JsonObject
            Gson gson = new Gson();
            JsonObject jsonResponse = gson.fromJson(reader, JsonObject.class);

            // Obtenemos la tasa de cambio para la moneda de salida
            JsonObject conversionRates = jsonResponse.getAsJsonObject("conversion_rates");
            double rate = conversionRates.get(monedaSalida).getAsDouble();

            // Realizamos la conversión
            float cantidadConvertida = cantidad * (float) rate;
            System.out.println("La conversión de " + cantidad + " " + monedaEntrada + " a " + monedaSalida + " es: " + cantidadConvertida);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Hubo un error al realizar la conversión.");
        }
    }
}
