class Bicicleta extends Vehiculo {
    private boolean esElectrica;

    public Bicicleta(String marca, String modelo, int añoFabricacion, boolean esElectrica) {
        super(marca, modelo, añoFabricacion);
        this.esElectrica = esElectrica;
    }

    public boolean isEsElectrica() {
        return esElectrica;
    }

    public void setEsElectrica(boolean esElectrica) {
        this.esElectrica = esElectrica;
    }

    @Override
    public void acelerar() {
        if (esElectrica) {
            System.out.println("La bicicleta eléctrica está acelerando.");
        } else {
            System.out.println("La bicicleta está acelerando.");
        }
    }
    
    public void acelerar(int velocidad) {
        if (esElectrica) {
            System.out.println("La bicicleta eléctrica está acelerando con una velocidad de "+ velocidad);
        } else {
            System.out.println("La bicicleta está acelerando con una velocidad de " + velocidad);
        }
    }
}
