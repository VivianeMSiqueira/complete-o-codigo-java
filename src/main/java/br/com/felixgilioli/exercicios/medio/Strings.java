package br.com.felixgilioli.exercicios.medio;

/**
 * Classe com métodos para trabalhar com Strings.
 */
public class Strings {

    private Strings() {}

    /**
     * Deve retornar a quantidade de letras maiúsculas que a string {@param str} contém.
     * @param str string.
     * @return inteiro informando a quantidade de letras maiúsculas.
     */
    public static int getQuantidadeLetrasMaiusculas(String str) {
        int quant = 0;
    	StringBuilder maiusculas = new StringBuilder(); 
    	if(str != null) {
    		for (Character c : str.toCharArray()) {
    			if(Character.isUpperCase(c)) {
    				maiusculas.append(c);
    			}
    			quant = maiusculas.length();
    		}
    	}
    	return quant;
    }

    /**
     * Deve retornar a quantidade de letras minúsculas que a string {@param str} contém.
     * @param str string.
     * @return inteiro informando a quantidade de letras minúsculas.
     */
    public static int getQuantidadeLetrasMinusculas(String str) {
    	int quant = 0;
    	StringBuilder minúsculas = new StringBuilder(); 
    	if(str != null) {
    		for (Character c : str.toCharArray()) {
    			if(Character.isLowerCase(c)) {
    				minúsculas.append(c);
    			}
    			quant = minúsculas.length();
    		}
    	}
    	return quant;
    }

    /**
     * Deve retornar a quantidade de caracteres especiais(*, #, @, !, etc) que a string {@param str} contém.
     * @param str string.
     * @return inteiro informando a quantidade de caracteres especiais.
     */
    public static int getQuantidadeCaracteresEspeciais(String str) {
    	int quant = 0;
    	StringBuilder caracteres = new StringBuilder(); 
    	if(str != null) {
    		for (Character c : str.toCharArray()) {
    			if(!Character.isLetterOrDigit(c)) {
    				caracteres.append(c);
    			}
    			quant = caracteres.length();
    		}
    	}
    	return quant;
    }

}
