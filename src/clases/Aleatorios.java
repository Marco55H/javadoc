package clases;

import java.util.Random;

/**
 * @author mholguin
 */
public class Aleatorios {
/*
 * @param cantidad Es la cantidad de numeros
 * * @param aleatorio Es donde se guarda el numero aleatoria
 */
	public static void numerosAletorios(int cantidad) {
		 
		double aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = Math.random();
			System.out.println(aleatorio);
		}
	}
/**
 * 
 * @param cantidad es la Cantidad de numeros aleatorios
 * @param max Es el número maximo al que llegara el random
 * @param aleatorio Es donde se guarda el numero aleatoria
 */
	public static void numerosAleatorios(int cantidad, int max) {
		int aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = (int) Math.random() * max;
			System.out.println(aleatorio);
		}
	}
/**
 * 
 * @param cantidad es la Cantidad de numeros aleatorios
 * @param minimo es la minima del numero random
 * @param maximo es la maxima del numero random
 */
	public static void numerosAleatorios(int cantidad, int minimo, int maximo) {
		int aleatorio;
		Random rand = new Random();
		for(int i=1; i<=cantidad; i++) {
			aleatorio = rand.nextInt(minimo, maximo+1);
			System.out.println(aleatorio);
		}
	}
}
