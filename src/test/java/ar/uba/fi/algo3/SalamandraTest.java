package ar.uba.fi.algo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SalamandraTest {

	@Test
	public void testNoSePuedenSobrepasarLos15kgDeMaderaQuebracho() {
		Salamandra salamandra = new Salamandra(20);
		assertThrows(ExcesoDeMaderaException.class, () -> {
			salamandra.ponerMadera(new Quebracho(16));
		});
	}
	
	@Test
	public void testNoSePuedenSobrepasarLos15kgDeMaderaPino() {
		Salamandra salamandra = new Salamandra(20);
		assertThrows(ExcesoDeMaderaException.class, () -> {
			salamandra.ponerMadera(new Pino(16));
		});
	}
	
	@Test
	public void testCalculaPrecioCorrectamente() {
		Salamandra salamandra = new Salamandra(10);
		salamandra.ponerMadera(new Quebracho(10)); /* precio = 80 */
		salamandra.ponerMadera(new Pino(3)); /* precio = 2 */
		assertEquals(820, salamandra.getConsumo());
	}

}
