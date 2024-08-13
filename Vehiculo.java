
public class Vehiculo {
	private String marca;
	private String modelo;
	private int añoFabricacion;
	
	public Vehiculo(String marca, String modelo, int añoFabricacion) {
		this.marca= marca;
		this.modelo=modelo;
		this.setAñoFabricacion(añoFabricacion);
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

	public int getAñoFabricacion() {
		return añoFabricacion;
	}

	public void setAñoFabricacion(int añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}
	
	public void acelerar() {
		System.out.print("El vehículo esta acelerando");
	}

}
