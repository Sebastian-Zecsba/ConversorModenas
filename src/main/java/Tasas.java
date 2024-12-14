import com.google.gson.annotations.SerializedName;
import java.util.Map;

public record Tasas(
        @SerializedName("result") String result,
        @SerializedName("time_last_update_utc") String fecha,
        @SerializedName("base_code") String base,
        @SerializedName("conversion_rates") Map<String, Float> rates) {

    public boolean operacionExitosa() {
        return result.equalsIgnoreCase("success");
    }

    public void getTasa() {
        System.out.println("El resultado de la operación fue: " + result);
        System.out.println("Moneda de origen: " + base);
        System.out.println("Fecha de operación: " + fecha);
    }

    public void getRates() {
        rates.forEach((clave, valor) -> System.out.println(clave + ": " + valor));
    }

    public Float findRate(String pais) {
        return rates.getOrDefault(pais, null);
    }
}
