import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         *2- ArrayList de números enteros:
        • Pedir cuantos números quiere el usuario entrar
        • Hacer entrada de datos (números) en el bucle
        • Cuando tengas el ArrayList completo, hacer la media de todos los números y dar ese resultado en
        pantalla
        */
        ArrayList <Integer> listaNumeros = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantos números quieres introducir?");
        int totalNumeros = teclado.nextInt();
        int sumaNumeros = 0;
        for(int i=0; i<totalNumeros; i++){
            System.out.println("Introduce un número:");
            listaNumeros.add(teclado.nextInt());
            sumaNumeros=sumaNumeros+listaNumeros.get(i);
            
        }
        
        System.out.println("-__________\nLa suma de los números es "+sumaNumeros);
        float media =  (float) sumaNumeros/ totalNumeros;
        System.out.println("Y por la tanto su media: "+media);


        
    }
}
