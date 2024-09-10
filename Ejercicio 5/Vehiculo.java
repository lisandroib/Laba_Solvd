package org.example;

import java.util.Objects;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private int anoFabricacion;

    protected Vehiculo(String marca, String modelo, int anoFabricacion) {
        this.marca= marca;
        this.modelo=modelo;
        this.anoFabricacion=anoFabricacion;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getanoFabricacion() {
        return anoFabricacion;
    }

    public void setanoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    protected abstract void acelerar();

    protected void frenar() {
        System.out.println("El vehículo está frenando");
    }

    protected void encender() {
        System.out.println("El vehículo está encendido");
    }

    protected void apagar() {
        System.out.println("El vehículo está apagado");
    }

    @Override
    public int hashCode() {
        return Objects.hash(anoFabricacion, marca, modelo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehiculo other = (Vehiculo) obj;
        return anoFabricacion == other.anoFabricacion && Objects.equals(marca, other.marca)
                && Objects.equals(modelo, other.modelo);
    }



}
