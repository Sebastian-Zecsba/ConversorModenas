import java.util.HashMap;
import java.util.Map;

public class TasaDeConversion {
    private static final Map<Integer, String> opcionesMenu = new HashMap<>();
    static {
        opcionesMenu.put(1, "ARS"); // Argentina
        opcionesMenu.put(2, "BOB"); // Bolivia
        opcionesMenu.put(3, "BRL"); // Brasil
        opcionesMenu.put(4, "CLP"); // Chile
        opcionesMenu.put(5, "COP"); // Colombia
        opcionesMenu.put(6, "USD"); // Dólar
    }

    public static String getOpcion(int codigo) {
        return opcionesMenu.get(codigo);
    }
}
