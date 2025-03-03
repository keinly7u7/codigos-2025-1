import java.util.Random;
import java.util.Scanner;

public class punto13 {
    public static void main(String[] args) {
        String genero;
        System.out.println( "ingrese si es hombre o mujer");
        Scanner scanner= new Scanner(System.in);
         genero=scanner.nextLine();
         Random rand = new Random();
         int pelota = rand.nextInt(5)+1;
         if (genero.equalsIgnoreCase("hombre")) {
            System.out.println("pelota: " + pelota);
         
         switch (pelota) {
            case 1: 
             System.out.println(" su premio es un  Desodorante");
                break;
                case 2:
                System.out.println("su premio es Six-Pack de cerveza");
                break;
                case 3:
                System.out.println(" su premio es una Camiseta");
                break;
                case 4:
                System.out.println(" su premio es una Pantaloneta");
                break;
                case 5:
                System.out.println("su premio es una Sudadera");
                break;
            
         }
         
              
         }
         if (genero.equalsIgnoreCase("mujer")) {
            System.out.println("Número aleatorio: " + pelota);
         
         switch (pelota) {
            case 1: 
             System.out.println(" su premio es una locion");
                break;
                case 2:
                System.out.println("su premio es un bikini");
                break;
                case 3:
                System.out.println(" su premio es una crema para la cara");
                break;
                case 4:
                System.out.println(" una plancha para el cabello");
                break;
                case 5:
             System.out.println("su premio es un esmalte de uñas ");
         }
    }
    }
}
