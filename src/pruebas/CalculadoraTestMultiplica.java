package pruebas;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import operaciones.Calculadora;

@RunWith(Parameterized.class)
public class CalculadoraTestMultiplica {

	private int num1;
	private int num2;
	private int resul;
		
	public CalculadoraTestMultiplica(int num1, int num2, int resul) {
		this.num1 = num1;
		this.num2 = num2;
		this.resul = resul;
	}

	@Parameters
	public static Collection<Object[]> numeros(){
		final List<Object[]> result = new ArrayList<Object[]>();

	    result.add( new Object[] {20, 10, 200} );
	    result.add( new Object[] {30, -2, -60});
	    result.add( new Object[] {5, 2, 10});
	    return result;
		
	}
	
	@Test
	public void testSuma() {
		Calculadora calc=new Calculadora(num1,num2);
		int res=calc.multiplica();
		assertEquals(resul,res);
	}

}
