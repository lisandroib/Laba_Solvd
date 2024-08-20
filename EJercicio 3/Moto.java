
class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String marca, String modelo, int añoFabricacion, boolean tieneSidecar) {
        super(marca, modelo, añoFabricacion);
        this.tieneSidecar = tieneSidecar;
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void acelerar() {
        System.out.println("La moto está acelerando.");
    }
    
    public void acelerar(int velocidad){
		System.out.println("La moto acelera con una velocidad de " + velocidad);
	}
}
