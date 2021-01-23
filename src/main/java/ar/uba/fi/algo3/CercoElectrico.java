package ar.uba.fi.algo3;

public class CercoElectrico implements ComponenteHogar {
	
	private int precioXm;
	private int metros;
	
	public CercoElectrico(int precioXm, int metros) {
		this.precioXm = precioXm;
		this.metros = metros;
	}

	@Override
	public int getConsumo() {
		return (this.precioXm * this.metros);
	}

}
