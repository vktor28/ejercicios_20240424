import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * 1- FIESTA EN TU CASA!  (JAVA VERSION)

            Montas una fiesta este finde en tu casa!
            Tienes una lista de 10 invitados en un arraylist

            – Michael, que estaba el primero de la lista, resulta que está de viaje y no puede venir
            – Te llama la Pepi que se apunta con su novio Silvester
            – Te encuentras a Eva, que dice que le cueles la tercera
            – Resulta que hay otra fiesta al lado la misma noche, con 10 personas más,  y toda esa gente dicen que les gusta vuestra música que se apuntan a tu fiesta!
            – Mostrar la lista definitiva de invitados en orden alfabético. En un momento dado, tienes curiosidad por saber quién es el último de la lista (mostrarlo)
            – Además, con tanto lío, te entra la duda de si tu amigo Pedro está incluído en la lista o no. Si está, decir en qué posición está. Si no, decir que no está.

            A cada paso debe ir actualizándose la la lista de invitados en tu casa y qué proceso has hecho.
            */

            ArrayList <String> invitadosCasa1 = new ArrayList<>(Arrays.asList("Michael","Pepi","Albert","Juan Carlos","María","Eva","Judit","Ramon","Pedro","Irene"));
            System.out.println("Ya tenemos la lista de invitados:");
            for (String listaInv1: invitadosCasa1){
                System.out.print(listaInv1+", ");
            }
            System.out.println("\n------------------------");
            System.out.println("\nVaya, parece que Michael está de viaje y no vendrá...");
            System.out.println("Pero me he llamado  Pepi, y me ha dicho si se puede apuntar Silvestre en su lugar");
            System.out.println("\nAsí que la lista queda así");
            invitadosCasa1.set(0,"Silveste");
            for (String listaInv1: invitadosCasa1){
                System.out.print(listaInv1+", ");
                
            }
            System.out.println("\n------------------------");
            System.out.println("\nBuah... y ahora me ha llamado Eva por si la podemos poner la tercera en la lista...");
            System.out.println("\nAsí que ahora está así");
            invitadosCasa1.remove(invitadosCasa1.lastIndexOf("Eva"));
            invitadosCasa1.add(2,"Eva");
            for (String listaInv1: invitadosCasa1){
                System.out.print(listaInv1+", ");
                
            }
            // Resulta que hay otra fiesta al lado la misma noche, con 10 personas más,  y toda esa gente dicen que les gusta vuestra música que se apuntan a tu fiesta!
            System.out.println("\n------------------------");
            System.out.println("\nY justo hay otra fiesta al lado y también se quieren apuntar.");
            System.out.println("\nLa nueva lista con todos los invitados ordenada alfabéticamente quedaría así:");
            ArrayList <String> invitadosCasa2 = new ArrayList<>(Arrays.asList("Macarena","Jordi","Claudia","Giorgio","Ignasi","Anna","Patri","Aitor","Bea","Ilias"));
            ArrayList <String> invitadosAll = new ArrayList<>();
            invitadosAll.addAll(invitadosCasa1);
            invitadosAll.addAll(invitadosCasa2);
            Collections.sort(invitadosAll);
            for (String listaAll: invitadosAll){
                System.out.print(listaAll+", ");      
            }
            System.out.println("\n¿Quie es el último en la lista?");
            System.out.println(invitadosAll.get(19));

            System.out.println("\n------------------------");
            System.out.println("\n¿Y Pedro está en la lista?");
            if(invitadosAll.contains("Pedro")) {
                System.out.println("Sí, está en la lista en la posición número "+invitadosAll.indexOf("Pedro"));
            }else {
                System.out.println("Vaya, no está en la lista.");
            }
            

            


    }
}
