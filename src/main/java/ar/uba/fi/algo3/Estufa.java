package ar.uba.fi.algo3;

public class Estufa implements ComponenteHogar {
	
	private int precioXcaloria;
	private int calorias;
	private int ambientes;
	
	public Estufa(int precioXcaloria, int calorias, int ambientes) {
		this.precioXcaloria = precioXcaloria;
		this.calorias = calorias;
		this.ambientes = ambientes;
	}

	@Override
	public int getConsumo() {
		return (this.precioXcaloria * this.calorias * this.ambientes);
	}

}
