package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTestErrorFalloExcepcion {

	// En el contexto de JUnit un FALLO es una comprobación que no se cumple y un
	// ERROR es una excepción durante la ejecución del código.

	@Test
	public void testMultiplica() {
		// provoco FALLO en vez de dar a atributos valor 20 y 10, le doy 20 y 50 lo cual
		// hara que el resultado esperado y el obtenido sean distintos, esto provocara
		// un FALLO
		Calculadora calc = new Calculadora(20, 50);
		int resultado = calc.multiplica();
		// añado mensaje con string para cuando se produzca el FALLO
		assertEquals(200, resultado, "Fallo en la multiplicacion");
		// no sale el mensaje en pantalla?
	}

	@Test
	public void testDivide() {
		// provoco ERROR al cambiar parametro divisor de 10 a 0, esto provocara un ERROR
		// porque no se puede dividir entre 0
		Calculadora calc = new Calculadora(20, 0);
		int resultado = calc.divide();
		assertEquals(2, resultado);
	}

	@Test
	public void testDivideTryCatch() {

		// supongo que el try es para indicar que podria haber un error y el catch
		// captura uno o todos ellos si se le especifica el tipo haciendo que el error
		// no se de y la prueba sea asatisfactoria, util para ignorar casos que pueden
		// dar error y evitar cambiar el codigo para que estos no se den en las pruebas
		try {
			Calculadora calc = new Calculadora(20, 0);
			int resultado = calc.divide();
			assertEquals(2, resultado);
			
			// la e equivale a excepcion y ArithmeticException equivale tipo de excepcion,
			// en este caso excepcion aritmetica, lo que quiere decir que el catch pillara
			// los errores de excepcion aritmetica evitando que la prueba de error
		} catch (ArithmeticException e) {
			// PRUEBA Satisfactoria
		}
	}

}
