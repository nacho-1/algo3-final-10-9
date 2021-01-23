package ar.uba.fi.algo3;

import java.util.Iterator;
import java.util.LinkedList;

public class Salamandra implements ComponenteHogar {
	
	private int metrosCuadrados;
	private LinkedList<Madera> maderas;
	private int capacidad;
	
	public Salamandra(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
		this.maderas = new LinkedList<>();
		this.capacidad = 15;
	}
	
	public void ponerMadera(Madera madera) {
		if(this.pesoActual() + madera.getPeso() > this.capacidad) {
			throw new ExcesoDeMaderaException();
		}
		this.maderas.add(madera);
	}

	@Override
	public int getConsumo() {
		int precioMadera = 0;
		Iterator<Madera> iterador = this.maderas.iterator();
		while(iterador.hasNext()) {
			Madera madera = iterador.next();
			precioMadera += madera.getPrecio();
		}
		return (precioMadera * this.metrosCuadrados);
	}
	
	private int pesoActual() {
		int pesoActual = 0;
		Iterator<Madera> iterador = this.maderas.iterator();
		while(iterador.hasNext()) {
			Madera madera = iterador.next();
			pesoActual += madera.getPeso();
		}
		return pesoActual;
	}

}
