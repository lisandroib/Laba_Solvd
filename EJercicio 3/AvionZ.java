import java.util.Objects;

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

	@Override
	public String toString() {
		return "Avion [getNumeroMotores()=" + getNumeroMotores() + ", getMarca()=" + getMarca() + ", getModelo()="
				+ getModelo() + ", getAñoFabricacion()=" + getAñoFabricacion() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numeroMotores);
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
		Avion other = (Avion) obj;
		return numeroMotores == other.numeroMotores;
	}
    
    
}

