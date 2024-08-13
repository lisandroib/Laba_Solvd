
public class Auto extends Vehiculo {

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
}
