
public class Application {
	 public static void main(String[] args) {
		 
		 StringManipulator stringManipulator = new StringManipulator();
		 String resultadollamadoMetodo = stringManipulator.trimAndConcat  (" Hola Mundo " , " Adiós Feliz año ");
		 int obtenerindiceMetodo =stringManipulator.getIndexOrNull ("Te Amo", 'T');

	

	        
	        
	        System.out.println(resultadollamadoMetodo);
	        System.out.println(obtenerindiceMetodo);
	    }

	} 

