
class Colectivo extends Vehiculo {
    private int capacidadPasajeros;

    public Colectivo(String marca, String modelo, int añoFabricacion, int capacidadPasajeros) {
        super(marca, modelo, añoFabricacion);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public void acelerar() {
        System.out.println("El autobús está acelerando con " + capacidadPasajeros + " pasajeros.");
    }
    
    public void acelerar(int velocidad){
		System.out.println("Colectivo acelera con una velocidad de " + velocidad);
	}
    
}
