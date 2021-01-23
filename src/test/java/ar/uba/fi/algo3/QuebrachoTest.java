package ar.uba.fi.algo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class QuebrachoTest {

	@Test
	public void testCalculaPrecioCorrectamente() {
		Quebracho quebracho = new Quebracho(10);
		assertEquals(80, quebracho.getPrecio());
	}

}
