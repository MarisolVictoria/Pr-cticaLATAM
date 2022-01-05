/*Elimina los espacios en blanco de ambos lados de las cadenas ingresadas y las concatena. 
 * Devolver la nueva cadena. Puede utilizar el m�todo trim de la clase String.*/

public class StringManipulator {

	public String trimAndConcat(String Cadena1, String Cadena2) {
		String resultado = null;
		resultado = Cadena1.trim() + Cadena2.trim();
		return resultado;
	}
	/*
	 * Obtener el �ndice del caracter dado y devolverlo o devolver -1. Si el
	 * caracter aparece varias veces, retornar el primer �ndice. Puede utilizar el
	 * m�todo indexOf de la clase String.
	 */

	public int getIndexOrNull(String frase, char letra) {
		int resultado;
		resultado = frase.indexOf(letra);
		System.out.println(resultado);
		return resultado;

	}
	/*
	 * Obtener el �ndice donde empieza la subcadena dada y devolverlo o devolver -1.
	 * Puede utilizar el m�todo indexOf de la clase String.
	 */

	public void getIndexOrNull2(String subCadena1, String subCadena2) {
		int obtenerindiceMetodo = subCadena1.indexOf(subCadena2);
		System.out.println(obtenerindiceMetodo);

	}

	/*
	 * Obtener una subcadena utilizando un �ndice de inicio y un �ndice de
	 * finalizaci�n y concatenarlo con la segunda cadena de entrada en nuestro
	 * m�todo. Puede utilizar el m�todo substring de la clase String.
	 */

	public String concatSubstring(String textoInicial, int beginIndex, int endIndex, String textoFinal) {
		String resultado = null;

		resultado = textoInicial.substring(beginIndex, endIndex).concat(textoFinal);

		System.out.println(resultado);
		return resultado;
	}

}
