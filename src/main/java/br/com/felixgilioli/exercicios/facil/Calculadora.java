package br.com.felixgilioli.exercicios.facil;

/**
 * Classe com métodos para calculos matemáticos.
 */
public class Calculadora {

    private Calculadora() {}

    /**
     * Deve calcular a média do array de números inteiros e retorna-la.
     * @param ints array de números inteiros.
     * @return média dos inteiros.
     */
    public static double getMedia(int[] ints) {
        double result = 0;
    	for (int i : ints) {
        	result += i;
		}
    	return result / ints.length;
    }

    /**
     * Deve retornar qual o maior número dentre {@param a} e {@param b}.
     * @param a primeiro número.
     * @param b segundo número.
     * @return o maior número.
     */
    public static int getMaior(int a, int b) {
        if(a > b) {
        	return a;
        }else {
        	return b;
        }
    }

    /**
     * Deve retornar a raíz quadrada do inteiro recebido.
     * @param n número inteiro.
     * @return raíz quadrada do {@param n}.
     */
    public static double getRaizQuadrada(int n) {
        return Math.sqrt(n);
    }

    /**
     * Deve retornar o valor absoluto do inteiro {@param n}, ou seja,
     * se ele for um número negativo deve tranforma-lo para positivo.
     * @param n número inteiro.
     * @return valor absoluto.
     */
    public static int getAbsoluto(int n) {
        return Math.abs(n);
    }

    
}
