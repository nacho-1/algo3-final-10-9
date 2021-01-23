package ar.uba.fi.algo3;

import java.util.LinkedList;
import java.util.Iterator;

public class Casa {

    private LinkedList<ComponenteHogar> componentes;
    
    public Casa() {
    	this.componentes = new LinkedList<>();
    }

    public int getGastoTotal() {

        int gasto = 0;

        Iterator<ComponenteHogar> iterador = this.componentes.iterator();

        while(iterador.hasNext()) {
        	ComponenteHogar componente = iterador.next();
        	gasto += componente.getConsumo();
        }

        return gasto;
    }
    
    public void agregarComponente(ComponenteHogar componente) {
    	this.componentes.add(componente);
    }

}

