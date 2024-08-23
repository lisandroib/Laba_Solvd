
public class BloqueStatic {
	static int contadorVehiculos;

    static {
        contadorVehiculos = 0;
        System.out.println("Bloque estático ejecutado. Contador inicializado.");
    }

    public static void incrementarContador() {
        contadorVehiculos++;
        System.out.println("Contador de vehículos: " + contadorVehiculos);
    }
}
