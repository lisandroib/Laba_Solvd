import java.util.Objects;

class Helicoptero extends Vehiculo {
	private int numeroHelices;

    public Helicoptero(String marca, String modelo, int añoFabricacion, int numeroHelices) {
        super(marca, modelo, añoFabricacion);
        this.numeroHelices = numeroHelices;
    }

    public int getNumeroHelices() {
        return numeroHelices;
    }

    public void setNumeroHelices(int numeroHelices) {
        this.numeroHelices = numeroHelices;
    }

    @Override
    public void acelerar() {
        System.out.println("El helicóptero está despegando con " + numeroHelices + " hélices.");
    }
    public void acelerar(int velocidad) {
    	System.out.println("El helicóptero está despegando con una velocidad de " + velocidad);
    }

	@Override
	public String toString() {
		return "Helicoptero [getNumeroHelices()=" + getNumeroHelices() + ", getMarca()=" + getMarca() + ", getModelo()="
				+ getModelo() + ", getAñoFabricacion()=" + getAñoFabricacion() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numeroHelices);
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
		Helicoptero other = (Helicoptero) obj;
		return numeroHelices == other.numeroHelices;
	}

    

	
    
    
    
}
