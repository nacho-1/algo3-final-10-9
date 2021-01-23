package ar.uba.fi.algo3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LosaRadianteTest {

	@Test
	public void testConsumoCorrecto() {
		LosaRadiante losa = new LosaRadiante(20, 100);
		int consumo = losa.getConsumo();
		assertEquals(2000, consumo);
	}

}
