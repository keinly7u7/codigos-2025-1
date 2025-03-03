import java.util.Scanner;

public class punto27 {
    //Leer los siguientes datos de los empleados de una compañía: Nombre, Sueldo, Departamento.
//Calcule lo siguiente:
//• Cuántos empleados hay en cada departamento.
//• Cuántos empleados ganan más de $ 8,000
//Existen 5 departamentos: Finanzas, Sistemas, Producción, Ventas y Mantenimiento. Considere
//las claves necesarias.

    public static void main(String[] args) {
        int contFinanzas=0, contSistemas=0, contProdccion =0, contVentas=0, contMantenimiento=0, contSueldo=0;
        boolean continua= true;
        while (continua) {
            Scanner sc = new Scanner(System.in);
            System.out.println("¡bienvenido!, ingrese su nombre");
            String nombre = sc.nextLine();
            System.out.println(" ingrese su sueldo");
           int sueldo = sc.nextInt();
            System.out.println(" ingrese del numero del  departamento al que pertenece");
            System.out.println("1-finanzas");
            System.out.println("2-sistemas");
            System.out.println("3-produccion");
            System.out.println("4-ventas");
            System.out.println("5-mantenimiento");
            int departamento = sc.nextInt();
            sc.nextLine();
            switch (departamento) {
                case 1:
                contFinanzas++;
                    
                    break;
                 case 2:
                contSistemas++;
                    
                    break;
                 case 3:

                 contProdccion++;
                 case 4:
                contVentas++;
                    
                    break;
                    case 5:
                 contMantenimiento++;
                    
                    break;
             
            }
            if (sueldo>8000) {
                contSueldo++;

                
            }

            boolean salir = false;
            
            while (!salir) {
                System.out.println("¿Desea ingresar otro empleado? (S/N):");
                String respuesta = sc.nextLine().toUpperCase();

                if (respuesta.equals("N")) {
                    continua = false;
                    salir = true;
                } else if (respuesta.equals("S")) {
                    salir= true;
                    continua=true;
                } else {
                    System.out.println("Respuesta inválida. Por favor, ingrese S o N.");
                }
     
        }        
        
       
    }
    System.out.println("la cantidad de empleados por departamento son las siguientes:");
    System.out.println("finanzas " + contFinanzas );
    System.out.println("sistemas " + contSistemas );
    System.out.println("produccion " + contProdccion );
    System.out.println("ventas " + contVentas );
    System.out.println("mantenimiento " + contMantenimiento);
    System.out.println( "la cantidad de empleados que ganan 8000 son : " + contSueldo);
  }
}  
