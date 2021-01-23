package ar.uba.fi.algo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CercoElectricoTest {

	@Test
	public void testConsumoCorrecto() {
		CercoElectrico cerco = new CercoElectrico(10, 1000);
		int consumo = cerco.getConsumo();
		assertEquals(10000, consumo);
	}

}
