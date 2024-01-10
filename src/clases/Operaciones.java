package clases;

/**
 * Esta clase tiene distintas funciones que se encargarán de operar los dos
 * números dados del main
 * 
 * @author marco
 */

public class Operaciones {
	/**
	 * Parámetro que representa uno de los dos números dados
	 */
	double num1;
	/**
	 * parámetro que repesenta el otro número dado
	 */
	double num2;

	/**
	 * Constructor sin parámetros
	 */
	public Operaciones() {

	}

	/**
	 * Constructor con parámetros
	 * @param num1 Este parámetro es el primer número dado
	 * @param num2 Este parámetro es el segundo número dado
	 */
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	/**
	 * Esta función hace la suma de los dos números
	 * @return devuelve el resultado de num1 + num2
	 */
	public double suma() {
		return num1 + num2;
	}

	/**
	 * Esta función hace la resta de los dos números
	 * @return devuelve el resultado de num1 - num2
	 */
	public double resta() {
		return num1 - num2;
	}

	/**
	 * Esta función hace la multiplicación de los dos números
	 * @return devuelve el resultado de num1 * num2
	 */

	public double multiplicacion() {
		return num1 * num2;
	}

	/**
	 * Esta función hace la división de los dos números
	 * @return devuelve el resultado de num1 / num2
	 */
	public double division() {
		double res = 0;

		if (num2 != 0) {
			res = num1 / num2;
		}
		return res;
	}

	/**
	 *  Esta función devuelve el máximo de los dos números introducidos
	 * @return devolverá el número más grande
	 */
	public double max() {
		return num1 > num2 ? num1 : num2;
	}

	/**
	 * Esta función devuelve el mínimo de los dos números introducidos
	 * @return devolverá el número más pequeño
	 */
	public double min() {
		return num1 < num2 ? num1 : num2;
	}
}
