package br.com.felixgilioli.exercicios.facil;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe com métodos para trabalhar com listas do tipo {@link java.util.ArrayList}.
 */
public class ArrayLists {

    private ArrayLists() {}
    
    /**
     * Deve filtrar os elementos de {@param numeros} e retornar apenas os números que são impares.
     * @param numeros lista de inteiros.
     * @return lista de inteiros apenas com números impares.
     */
    public static List<Integer> getImpares(List<Integer> numeros) {
        List<Integer> impares = new ArrayList<>();
    	for (Integer i: numeros) {
        	if(i%2 != 0) {
        		impares.add(i);
        	}
		}		
    	return impares;
    }

    /**
     * Deve retornar a quantidade de pessoas que começam com a letra {@param letra}
     * @param pessoas lista contendo o nome das pessoas, ex: ["Felix", "Daiane"].
     * @param letra letra na qual deve você retornar a quantidade dos nomes que começam com ela, ex: "F"
     * @return quantidade de pessoas.
     */
    public static long getQuantidadeDePessoasQueComecamComALetra(List<String> pessoas, String letra) {
        int quant = 0;
    	for (String string : pessoas) {
        	if(string.startsWith(letra)) {
        		quant++;
        	}
		}
    	return quant;
    }
}
