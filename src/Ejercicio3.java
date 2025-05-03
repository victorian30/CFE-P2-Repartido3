import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {


        String[] nombres = {"Juan", "María", "Lucas", "Pedro", "Ana"};

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un nombre para buscar: ");
        String buscar = leer.nextLine();

        for (int i=0; i < nombres.length; i++) {
                if (nombres[i].equals(buscar)) {
                    System.out.println("El nombre " + nombres[i] + " se encuentra en el arreglo.");
                    return;

                }
        }
        System.out.println("El nombre " + buscar + " no se encuentra en el arreglo.");
    }
}
