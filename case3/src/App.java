import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*- En la siguiente frase:
        String fraseAleatoria = "Los errores del pasado son la sabiduría del presente";
        Decir si existe la letra "e", cuántas veces aparece, y en qué posiciones.
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indica una frase y te diré si existe la letra 'e', en que posición y cuantas veces aparece");
        String fraseAleatoria = teclado.nextLine();
        ArrayList <Character> fraseArray = new ArrayList<>();
        ArrayList <Integer> posicionLetra = new ArrayList<>();
        int numeroVeces=0;
        for (int i=0; i<fraseAleatoria.length(); i++) {
            fraseArray.add(fraseAleatoria.charAt(i));
            if(fraseArray.get(i).equals('e')){
                posicionLetra.add(i);
                numeroVeces=numeroVeces+1;
            }
        }
        System.out.println(fraseArray);
        System.out.println("Se repite "+ numeroVeces);
        System.out.println("Aparece en las posiciones "+ posicionLetra);

    }
}
