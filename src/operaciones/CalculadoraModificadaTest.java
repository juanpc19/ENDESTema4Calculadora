package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//no me da errores al ejecutar
class CalculadoraModificadaTest {

	@Test
	void testResta() {
		Calculadora calc = new Calculadora(20, 10);
		//guardo el return en int
		int resultado = calc.resta();
		//compruebo que me devuelve 10
		assertEquals(10, resultado);
	}

	@Test
	void testResta2() {
		CalculadoraModificada calc = new CalculadoraModificada(20, 10);
		//guardo el return en booleano
		boolean resultado = calc.resta2();
		//compruebo que me devuelve true
		assertTrue(resultado);
	}
	
	@Test
	void test2Resta2() {
		CalculadoraModificada calc = new CalculadoraModificada(10, 20);
		//guardo el return en booleano
		boolean resultado = calc.resta2();
		//compruebo que me devuelve false
		assertFalse(resultado);
	}

	@Test
	void testDivide2() {
		CalculadoraModificada calc = new CalculadoraModificada(20, 0);
		//guardo el return en integer (null o not null)
		Integer resultado = calc.divide2();
		//compruebo que me devuelve Null
		assertNull(resultado);
	}
	
	@Test
	void test2Divide2() {
		CalculadoraModificada calc = new CalculadoraModificada(20, 10);
		//guardo el return en integer (null o not null)
		Integer resultado = calc.divide2();
		//compruebo que me devuelve NotNull
		assertNotNull(resultado);
	}

}
