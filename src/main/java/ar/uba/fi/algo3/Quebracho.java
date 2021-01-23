package ar.uba.fi.algo3;

public class Quebracho implements Madera {
	
	private int precioXkg;
	private int pureza;
	private int kilos;
	
	public Quebracho(int kilos) {
		this.precioXkg = 4;
		this.pureza = 2;
		this.kilos = kilos;
	}

	@Override
	public int getPrecio() {
		return (this.precioXkg * this.kilos * this.pureza);
	}

	@Override
	public int getPeso() {
		return this.kilos;
	}

}
