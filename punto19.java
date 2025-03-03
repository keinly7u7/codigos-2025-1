import java.util.Scanner;

public class punto19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0; 
        boolean continuar = true;

        while (continuar) {
            System.out.println("¡Hola! Bienvenido a la página del centro penitenciario");
            System.out.println("Ingresa el nombre del interno:");
            String nombre = scanner.nextLine();

            System.out.println("Ingresa en meses el tiempo de condena del interno:");
            int condena = scanner.nextInt();
            scanner.nextLine(); 

            if (condena > 36) {
                contador++;
                System.out.println("Interno con mas de 36 meses de condena: " + nombre + ", Condena: " + condena + " meses");
            }

            boolean cantreclusos = false;
            while (!cantreclusos) {
                System.out.println("¿Desea ingresar otro interno? (S/N):");
                String respuesta = scanner.nextLine().toUpperCase();

                if (respuesta.equals("N")) {
                    continuar = false;
                    cantreclusos = true;
                } else if (respuesta.equals("S")) {
                    cantreclusos= true;
                } else {
                    System.out.println("Respuesta inválida. Por favor, ingrese S o N.");
                }
            }
        }

        System.out.println("\nCantidad de internos con mas de 36 meses de condena: " + contador);
       
    }
}