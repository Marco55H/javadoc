package clases;

import java.util.Random;

/**
 * En esta clase se encuestran las funciones que nos ayudarán a representar el
 * famoso juego del tesoro
 * 
 * @author marco
 */
public class Tesoro {
	/**
	 * Este parámetro es una constante que marcará el tamaño del tablero
	 */
	public static final int TAM_TABLERO = 5;
	/**
	 * Este parámetro representa la posición x en la que se encuentra el tesoro
	 */
	static int xTesoro;
	/**
	 * Este parámetro representa la posición y en la que se encuentra el tesoro
	 */
	static int yTesoro;
	/**
	 * Este parámetro representa la posición x en la que se encuentra el jugador
	 */
	int xJugador = 1;
	/**
	 * Este parámetro representa la posición y en la que se encuentra el jugador
	 */
	int yJugador = 1;

	/**
	 * En esta función se genera la posición del tesoro con números aleatorios entre
	 * 1 y tamaño del tablero
	 */
	static void generaPosicionTesoro() {
		Random rand = new Random();
		xTesoro = rand.nextInt(1, TAM_TABLERO + 1);
		yTesoro = rand.nextInt(1, TAM_TABLERO + 1);
	}

	/**
	 * En esta función representamos el tablero con varios for ayudados por la
	 * variable que marca el tamaño del tablero
	 */
	void pintaTablero() {
		// Imprimimos la primera línea de números
		for (int i = 1; i <= TAM_TABLERO; i++) {
			System.out.print("\t" + i);
		}

		// Salto de línea para comenzar con los números de la izquierda
		System.out.println();

		// Bucle para imprimir las líneas
		for (int i = 1; i <= TAM_TABLERO; i++) {
			// Imprimimos el número de línea
			System.out.print(i);
			// Si la línea coincide con la posición X del jugador
			if (xJugador == i) {
				/// Imprimimos tantos tabuladores como posición Y del jugador
				for (int j = 1; j <= yJugador; j++) {
					System.out.print("\t");
				}
				// Imprimimos la ficha del jugador
				System.out.print("J");
			}
			// Salto de línea para pasar a la siguiente línea
			System.out.println();
		}
	}

	/**
	 * Con esta función vamos representando el movimiento del jugador en el tablero
	 * que hemos representado anteriormente
	 * 
	 * @param movimiento parámetro que representa el movimiento del jugador
	 * @return devolvemos el resultado puede ser -1 o -2 depeende de si el
	 *         movimiento es válido o no
	 */
	int mueveJugador(String movimiento) {
		int res = 0;
		String movMinuscula = movimiento.toLowerCase();

		switch (movMinuscula) {
		case "arriba":
			if (xJugador - 1 < 1) {
				res = -1;
			} else {
				xJugador--;
			}
			break;
		case "abajo":
			if (xJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				xJugador++;
			}
			break;
		case "izquierda":
			if (yJugador - 1 < 1) {
				res = -1;
			} else {
				yJugador--;
			}
			break;
		case "derecha":
			if (yJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				yJugador++;
			}
			break;
		default:
			res = -2;
			break;
		}

		return res;
	}

	/**
	 *  La funcion que va a comparar si el jugador y el tesoro están en la misma posición 
	 * @return devulverá el resultado, si están en la misma posición o no
	 */
	boolean buscaTesoro() {
		boolean res = false;
		if (xTesoro == xJugador && yTesoro == yJugador) {
			res = true;
		}
		return res;
	}
}
