	 /*Elimina los espacios en blanco de ambos lados de las cadenas ingresadas y las concatena. 
	  * Devolver la nueva cadena. Puede utilizar el m�todo trim de la clase String.*/

public class StringManipulator {
	
      public String trimAndConcat (String Cadena1, String Cadena2) {
    	  String resultado = null;
    	  resultado = Cadena1.trim() + Cadena2.trim(); 
    	  return resultado;
      }
      /*Obtener el �ndice del caracter dado y devolverlo o devolver -1.
       *  Si el caracter aparece varias veces, retornar el primer �ndice. 
       *  Puede utilizar el m�todo indexOf de la clase String.*/
       
public class StringMnipulator  {
	 public int obtenerindiceMetodo = getIndexOrNull ("Te Amo", 'A');
     
     public int getIndexOrNull (String frase, char letra) {
       int resultado;
    	 resultado = frase.indexOf(letra); 
    	 return resultado; 
     }
}
          
      /*Obtener el �ndice donde empieza la subcadena dada y devolverlo o devolver -1. 
       *Puede utilizar el m�todo indexOf de la clase String.
        StringManipulator manipulator = new StringManipulator();*/

public class StringManipulator  {
     
	
}

