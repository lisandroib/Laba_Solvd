class Avion extends Vehiculo {
    private int numeroMotores;

    public Avion(String marca, String modelo, int añoFabricacion, int numeroMotores) {
        super(marca, modelo, añoFabricacion);
        this.numeroMotores = numeroMotores;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    @Override
    public void acelerar() {
        System.out.println("El avión está despegando con " + numeroMotores + " motores.");
    }
    public void acelerar(int velocidad) {
    	System.out.println("El avión está despegando con una velocidad de " + velocidad);
    }
    
    
}

