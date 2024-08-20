
class Camion extends Vehiculo {
    private int capacidadCarga;

    public Camion(String marca, String modelo, int añoFabricacion, int capacidadCarga) {
        super(marca, modelo, añoFabricacion);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void acelerar() {
        System.out.println("El camión está acelerando con una carga de " + capacidadCarga + " kg.");
    }
    
    public void acelerar(int velocidad){
		System.out.println("El camion acelera con una velocidad de " + velocidad);
	}
    
     
}
