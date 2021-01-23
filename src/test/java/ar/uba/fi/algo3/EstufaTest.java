package ar.uba.fi.algo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EstufaTest {

	@Test
	public void testConsumoCorrecto() {
		Estufa estufa = new Estufa(2, 2000, 2);
		int consumo = estufa.getConsumo();
		assertEquals(8000, consumo);
	}

}
