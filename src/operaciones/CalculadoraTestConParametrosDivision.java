package operaciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class CalculadoraTestConParametrosDivision {

	// renombro etiqueta a @ParameterizedTest pa indicar a Junit que es un test con
	// varios parametros de entrada, importar @ParameterizedTest
	@ParameterizedTest
	// importar @MethodSource y darle nombre de objeto que contiene los valores para
	// los parametros de entrada a usar
	@MethodSource("division")
	// añado 3 parametros de entrada a la funcion divide
	void testDivide(int num1, int num2, int expected) {

		// creo objeto calc en clase Calculadora para llamar a funcion no estatica
		// (divide) e indico que parametros de entrada usara el objeto cuando sea
		// llamado (num1,num2)
		Calculadora calc = new Calculadora(num1, num2);
		// doy a resultado valor igual a return de funcion divide con objeto calc, el
		// cual pasara a funcion num1 y num2
		int resultado = calc.divide();

		// compruebo que resultado esperado es igual a resultado obtenido con
		// assertEquals (expected seria el tercer parametro de entrada que contendra el
		// valor esperado)
		assertEquals(expected, resultado);

	}

	// importar stream y luego importar arguments
	// nombre del onjeto es division
	// este onjeto devolvera diferentes parametros de entrada cuando sea llamado a
	// un test con @MethodSource
	private static Stream<Arguments> division() {
		return Stream.of(Arguments.of(20, 10, 2), Arguments.of(30, -2, -15), Arguments.of(5, 2, 2));

	}
}
