
public class Application {
	 public static void main(String[] args) {
		 
		 StringManipulator stringManipulator = new StringManipulator();
		 String resultadollamadoMetodo = stringManipulator.trimAndConcat  (" Hola Mundo " , " Adi�s Feliz a�o ");
		 int obtenerindiceMetodo =stringManipulator.getIndexOrNull ("Te Amo", 'T');

	

	        
	        
	        System.out.println(resultadollamadoMetodo);
	        System.out.println(obtenerindiceMetodo);
	    }

	} 

