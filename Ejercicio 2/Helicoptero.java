
class Helicoptero extends Vehiculo {
    private int numeroHelices;

    public Helicoptero(String marca, String modelo, int añoFabricacion, int numeroHelices) {
        super(marca, modelo, añoFabricacion);
        this.numeroHelices = numeroHelices;
    }

    public int getNumeroHelices() {
        return numeroHelices;
    }

    public void setNumeroHelices(int numeroHelices) {
        this.numeroHelices = numeroHelices;
    }

    @Override
    public void acelerar() {
        System.out.println("El helicóptero está despegando con " + numeroHelices + " hélices.");
    }
    public void acelerar(int velocidad) {
    	System.out.println("El helicóptero está despegando con una velocidad de " + velocidad);
    }
}
