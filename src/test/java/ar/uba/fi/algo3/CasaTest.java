package ar.uba.fi.algo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CasaTest {

    @Test
    public void testConsumoDeTresComponentes() {
        Casa casa =  new Casa();

        ComponenteHogar estufaDelBanio = new Estufa(10, 1000, 1); /* consumo = 10000 */
       
        casa.agregarComponente(estufaDelBanio);

        ComponenteHogar losaComedor = new LosaRadiante(10, 100); /* consumo = 1000 */

        casa.agregarComponente(losaComedor);

        ComponenteHogar cercoFondo = new CercoElectrico(10, 10); /* consumo = 100 */

        casa.agregarComponente(cercoFondo);

        assertEquals(11100, casa.getGastoTotal());
    }
    
    @Test
    public void testConsumoDeSalamandras() {
    	Casa casa = new Casa();
    	Salamandra salamandra1 = new Salamandra(100);
    	salamandra1.ponerMadera(new Quebracho(10)); /* consumo = 8000 */
    	casa.agregarComponente(salamandra1);
    	Salamandra salamandra2 = new Salamandra(100);
    	salamandra2.ponerMadera(new Pino(15)); /* consumo = 1000 */
    	casa.agregarComponente(salamandra2);
    	assertEquals(9000, casa.getGastoTotal());
    }

}
