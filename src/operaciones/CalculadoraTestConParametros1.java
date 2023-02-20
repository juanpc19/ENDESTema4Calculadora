package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CalculadoraTestConParametros1 {

	// importar @ParameterizedTest
	@ParameterizedTest
	// importar @MethodSource
	@MethodSource("division")
	void testDivide(int num1, int num2, int expected) {

		// creo objeto calc en clase Calculadora para llamar a funcion no estatica
		// (testDivide) e indico que parametros usara el objeto cuando sea llamado
		Calculadora calc = new Calculadora(num1, num2);
		// doy a resultado valor igual a funcion divide con objeto calc
		// que esara parametros de entrada de testDivide
		int resultado = calc.divide();

		// compruebo que resultado esperado es igual a resultado con assertEquals
		assertEquals(expected, resultado);

	}

	// importar stream y luego importar arguments
	// nombre del importe es division
	// este metodo devolvera diferentes parametros cuando sea llamado a un test
	private static Stream<Arguments> division() {
		return Stream.of(Arguments.of(20, 10, 2), Arguments.of(30, -2, -15), Arguments.of(5, 2, 2));

	}
}
