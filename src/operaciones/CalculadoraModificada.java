package operaciones;

public class CalculadoraModificada {
	private int num1;
	private int num2;

	// funcion calculadora sin parametros de entrada
	public CalculadoraModificada() {
	}

	// funcion calculadora con parametros de entrada para cambiar valor de atributos
	public CalculadoraModificada(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int suma() {
		int resul = num1 + num2;
		return resul;
	}

	// resta cambiado
	public int resta() {
		int resul;
		if (resta2())
			resul = num1 - num2;
		else
			resul = num2 - num1;
		return resul;
	}

	public int multiplica() {
		int resul = num1 * num2;
		return resul;
	}

	public int divide() {
		int resul = num1 / num2;
		return resul;
	}

	// resta2
	public boolean resta2() {
		if (num1 >= num2)
			return true;
		else
			return false;
	}

	// divide2
	public Integer divide2() {
		Integer resul;
		if (num2 == 0)
			resul = null;
		else
			resul = num1 / num2;
		return resul;
	}

}
