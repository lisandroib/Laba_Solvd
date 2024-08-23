import java.util.Objects;

public class Auto extends Vehiculo implements Conducible, Maniobrable, Transportable {

	private  int puertas;
	

	public Auto(String marca, String modelo, int añoFabricacion, int puertas) {
		super(marca, modelo, añoFabricacion);
		this.puertas = puertas;

	}
	
	

	public int getPuertas() {
		return puertas;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	@Override
	public void acelerar() {
		System.out.println("El auto está acelerando");
	}
	
	public void acelerar(int velocidad){
		System.out.println("El auto acelera con una velocidad de " + velocidad);
	}

	@Override
	public String toString() {
		return "Auto [puertas=" + puertas + ", getPuertas()=" + getPuertas() + ", getMarca()=" + getMarca()
				+ ", getModelo()=" + getModelo() + ", getAñoFabricacion()=" + getAñoFabricacion() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(puertas);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		return puertas == other.puertas;
	}
	
	@Override
	public void conducir(){
		System.out.println("Conduciendo el auto");
	}
	

    @Override
    public void maniobrar() {
        System.out.println("Maniobrando el auto");
    }
    
    @Override
    public void transportar() {
    	System.out.println("El auto er transportado");
    }
}
