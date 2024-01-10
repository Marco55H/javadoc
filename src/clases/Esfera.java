package clases;
/**
 * Clase donde guardamos la informacion de la esfera radio, superficie y volumen
 * @author mholguin
 */
public class Esfera {
	/**
	 * Radio de una esfera
	 */
	double radio = 1.0;
	
	/**
	 * Constructor sin parametros
	 */
	public Esfera() {
		super();
	}

/**
 * Constructor con parametros
 * @param radio el radio de la esfera
 */
	public Esfera(double radio) {
		super();
		this.radio = radio;
	}
	/**
	 * Esta función devuelve la superficie de la esfera usando su fórmula
	 * @return superficie la superficie de la esfera
	 */

	public double superficie() {
		double superficie = 4*Math.PI*Math.pow(radio, 2);		
		return superficie;
	}
	/**
	 * Esta función devuelve el volumen de la esfera usando su fórmula
	 * @return volumen el volumen de la esfera
	 */
	
	public double volumen() {
		double volumen = (4*Math.PI/3) * Math.pow(radio, 3);
		return volumen;
	}
}
