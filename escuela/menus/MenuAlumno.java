package escuela.menus;

import java.util.Scanner;

public class MenuAlumno {
    

    private static Scanner leerNum = new Scanner(System.in);


    public static void mostrarMenuAlumno(){
        int opcion = 0;

        do{
            System.out.println("+------------------------+");
            System.out.println("|   MENU ALUMNO MINDBOX  |");
            System.out.println("+------------------------+");
            System.out.println("| OPCION | DESCRIPCION   |");
            System.out.println("+------------------------+");
            System.out.println("|   1    | Registrar     |");
            System.out.println("|   2    | Modificar     |");
            System.out.println("|   3    | Consultar     |");
            System.out.println("|   4    | Eliminar      |");
            System.out.println("|   5    | Cerrar sesión |");
            System.out.println("+------------------------+");
            System.out.print("Elige una opción: ");
            opcion = leerNum.nextInt();

            switch (opcion) {
                case 1:
                    
                    break;
            
                default:
                    break;
            }

        }while(true);
    }
}
