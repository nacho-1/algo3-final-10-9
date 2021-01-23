package ar.uba.fi.algo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PinoTest {

	@Test
	public void testCalculaPrecioCorrectamente() {
		Pino pino = new Pino(15);
		assertEquals(10, pino.getPrecio());
	}

}
