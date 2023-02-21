package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		// creo objeto calc para llamar a funcion suma y le paso valores a los atributos
		// de la clase porque esta funcion hara uso de ellos ya que no tiene parametros
		// de entrada
		Calculadora calc = new Calculadora(20, 10);
		// guardo en resultado el return de la funcion suma ejecutada con los atributos,
		// el objeto calc le dira a la funcion que atibutos usar y que valor tienen
		// estos
		int resultado = calc.suma();
		// compruebo que el resultado esperado es igual al resultado obtenido
		assertEquals(30, resultado);
	}

	@Test
	void testResta() {
		Calculadora calc = new Calculadora(20, 10);
		int resultado = calc.resta();
		assertEquals(10, resultado);
	}

	@Test
	void testMultiplica() {
		Calculadora calc = new Calculadora(20, 10);
		int resultado = calc.multiplica();
		assertEquals(200, resultado);
	}

	@Test
	void testDivide() {

		Calculadora calc = new Calculadora(20, 10);
		int resultado = calc.divide();
		assertEquals(2, resultado);
	}

}
