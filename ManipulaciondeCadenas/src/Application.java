
public class Application {
	public static void main(String[] args) {

		StringManipulator stringManipulator = new StringManipulator();
		// String resultadollamadoMetodo = stringManipulator.trimAndConcat (" Hola Mundo
		// " , " Adi�s Feliz a�o ");
		// int obtenerindiceMetodo =stringManipulator.getIndexOrNull ("Te Amo", 'T');
		// int obtenerindiceMetodo1 = getIndexOrNull2 ("Buen d�a", 'e');

		// stringManipulator.getIndexOrNull("Welcome 2022", 'e');

		// stringManipulator.getIndexOrNull2("Que tal", "t");

		/*
		 * System.out.println(resultadollamadoMetodo);
		 * System.out.println(obtenerindiceMetodo);
		 * System.out.println(obtenerindiceMetodo1); {
		 * 
		 * }
		 */
		stringManipulator.concatSubstring("Buenos dias, hola como estas,", 9, 28, "espero que bien.");
		stringManipulator.concatSubstring("Que tal", 4, 7, "Bienvenido");

	}
}
