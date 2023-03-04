package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        int EdadJuan, EdadAna, EdadAlberto, EdadMama;
        
        System.out.println("Ingrese su nombre:");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.next();
        
        System.out.println("Ingrese su edad:");
        EdadJuan = entrada.nextInt();
        
        EdadAlberto = 2 * (EdadJuan/3);
        EdadAna = 4 * (EdadJuan/3);
        EdadMama = EdadJuan + EdadAna + EdadAlberto;
        
        System.out.println("Su nombre es " + nombre + " su edad es " + EdadJuan);
        System.out.println("La edad de Alberto es: " + EdadAlberto);
        System.out.println("La edad de Ana es: " + EdadAna);
        System.out.println("La edad de la Mama es: " + EdadMama);
        
        
        
       
       
    }
    
}
