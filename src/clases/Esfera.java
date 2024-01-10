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
 * @param radio
 */
	public Esfera(double radio) {
		super();
		this.radio = radio;
	}
	/**
	 * constructor sin parametros
	 * @return superficie
	 */

	public double superficie() {
		double superficie = 4*Math.PI*Math.pow(radio, 2);		
		return superficie;
	}
	/**
	 * 
	 * @return volumen 
	 */
	
	public double volumen() {
		double volumen = (4*Math.PI/3) * Math.pow(radio, 3);
		return volumen;
	}
}
