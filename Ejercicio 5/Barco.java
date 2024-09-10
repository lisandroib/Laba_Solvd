package org.example;

class Barco extends Vehiculo implements Navegable{
    private double eslora;

    public Barco(String marca, String modelo, int anoFabricacion, double eslora) {
        super(marca, modelo, anoFabricacion);
        this.eslora = eslora;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    @Override
    public void acelerar() {
        System.out.println("El barco está navegando a toda velocidad.");
    }
    public void acelerar(int velocidad) {
        System.out.println("El barco está navegando a una velocidad de "+ velocidad);
    }

    public void navegar() {
        System.out.println("Se esta navegando el barco");
    }
}

