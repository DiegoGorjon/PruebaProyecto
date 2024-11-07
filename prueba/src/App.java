import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        System.out.println("Escribe tu nombre:");
        Scanner leer = new Scanner(System.in);
        String nombre = leer.nextLine();
        System.out.println("Hola, "+nombre+"!");
        
        
    }
}
