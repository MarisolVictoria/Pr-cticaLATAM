import java.util.Scanner;

public class Pitagoras {
public static void main(String[] args) {
      double c, b, solucion;
        Pitagoras pita = new Pitagoras();
        
        Scanner sca = new Scanner(System.in);
        
        System.out.println("Ponme el primer n�mero");
        String cIntermedio = sca.next();
        System.out.println("Ponme el segundo n�mero");
        String bIntermedio = sca.next();
        c = Double.parseDouble(pita.cambioComas(cIntermedio));
        b = Double.parseDouble(pita.cambioComas(bIntermedio));

        solucion = (c * c) + (b * b);
        solucion = Math.sqrt(solucion);

        System.out.println("La soluci�n es " + solucion);

    }

    public String cambioComas(String str) {
        str = str.replaceAll(",", ".");
        return str;
    }
}
          
          
          
         
          
          
          
          
	    

