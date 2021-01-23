package ar.uba.fi.algo3;

public class LosaRadiante implements ComponenteHogar {
	
	private int precioXm2;
	private int metrosCuadrados;

	public LosaRadiante(int precioXm2, int metrosCuadrados) {
		this.precioXm2 = precioXm2;
		this.metrosCuadrados = metrosCuadrados;
	}
	
	@Override
	public int getConsumo() {
		return (this.precioXm2 * this.metrosCuadrados);
	}

}
