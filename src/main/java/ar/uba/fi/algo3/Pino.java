package ar.uba.fi.algo3;

public class Pino implements Madera {
	
	private int precioXkg;
	private int coeficienteCalorico;
	private int kilos;
	
	public Pino(int kilos) {
		this.precioXkg = 2;
		this.coeficienteCalorico = 3;
		this.kilos = kilos;
	}

	@Override
	public int getPrecio() {
		return ( (int) (this.precioXkg * this.kilos) / this.coeficienteCalorico);
	}

	@Override
	public int getPeso() {
		return this.kilos;
	}

}
