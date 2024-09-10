package org.example;

class Tren extends Vehiculo {
    private int numeroVagones;

    public Tren(String marca, String modelo, int anoFabricacion, int numeroVagones) {
        super(marca, modelo, anoFabricacion);
        this.numeroVagones = numeroVagones;
    }

    public int getNumeroVagones() {
        return numeroVagones;
    }

    public void setNumeroVagones(int numeroVagones) {
        this.numeroVagones = numeroVagones;
    }

    @Override
    public void acelerar() {
        System.out.println("El tren está acelerando con " + numeroVagones + " vagones.");
    }
    public void acelerar(int velocidad) {
        System.out.println("El tren está acelerando con una velocidad de " + velocidad);
    }
}
