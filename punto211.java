import java.util.Scanner;

public class punto211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tallasContador = new int[7];
        String[] tallas = {"XS", "S", "M", "L", "XL", "XXL", "XXXL"};
        String talla, nombres, respuesta;

        System.out.println("Hola, Bienvenido ingrese /s/ si desea realizar una compra, de lo contrario ingrese /n/");
        respuesta = scanner.nextLine();

        while (respuesta.equals("s")) {
            System.out.print("Ingrese el nombre del empleado: ");
            nombres = scanner.nextLine();
            talla = "";

            boolean tallaValida = false;
            do {
                System.out.print("Ingrese la talla de la camisa (XS, S, M, L, XL, XXL, XXXL): ");
                talla = scanner.nextLine().toUpperCase();
                for (int i = 0; i < tallas.length; i++) {
                    if (talla.equals(tallas[i])) {
                        tallaValida = true;
                        break;
                    }
                }

                if (!tallaValida) {
                    System.out.println("Talla no válida, por favor ingrese una talla correcta.");
                }

            } while (!tallaValida);

            System.out.println("Empleado " + nombres + " talla " + talla);

            for (int i = 0; i < tallas.length; i++) {
                if (talla.equals(tallas[i])) {
                    tallasContador[i]++;
                    break;
                }
            }

            System.out.println("\nCantidad de camisas por talla:");
            for (int i = 0; i < tallas.length; i++) {
                System.out.println(tallas[i] + ": " + tallasContador[i]);
            }

            System.out.println("¿Desea registrar otra compra? Ingrese /s/ para continuar o /n/ para salir.");
            respuesta = scanner.nextLine();
        }

        scanner.close();
    }
}
    
