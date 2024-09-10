package org.example;

public final class VehiculoFinal {
    private final String tipoVehiculo;

    public VehiculoFinal(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public void mostrarTipo() {
        System.out.println("Tipo de Vehículo: " + tipoVehiculo);
    }
}
