package escuela;

import java.util.Scanner;
import usuario.Persona;
import escuela.menus.MenuAlumno;
import escuela.menus.MenuMaestro;
import escuela.menus.MenuCoordinador;
import usuario.utils.UsuarioEnSesion;
public class EscuelaSistema {
    public static Scanner leerNum = new Scanner(System.in);
    public static Scanner leerCad = new Scanner(System.in);
    Escuela escuela = new Escuela();

    public void iniciarSesionSistema(){
        System.out.println("Inicia sesión para continuar");

        System.out.println("Ingresa tu usuario: ");
        String usuario = leerCad.nextLine();

        System.out.println("Ingresa tu contraseña: ");
        String contra = leerCad.nextLine();

        Persona usuarioActual = escuela.verificarInicioSesion(usuario, contra);

        if (usuarioActual != null) {
            UsuarioEnSesion.getInstancia().setUsuario(usuarioActual);
            seleccionarMenu();
        } else {
            System.out.println("Usuario o contraseña incorrectos. Intenta de nuevo.");
            seleccionarMenu();
        }
    }


    private void seleccionarMenu() {
        switch (UsuarioEnSesion.getInstancia().getUsuarioActual().getRol()) {
            case Alumno:
                MenuDelAlumno();
                break;

            case Maestro:
                MenuDelMaestro();
                break;

            case CoordinadorISC:
                MenuDelCoordinadorISC();
                break;
            case CoordinadorIMAT:
                MenuDelCoordinadorIMAT();
                break;
            case CoordinadorELC:
                MenuDelCoordinadorELC();
                break;
        }
    }

    public void MenuDelMaestro(){
        MenuMaestro.mostrarMenuMaestro();
    }

    public void MenuDelAlumno(){
        MenuAlumno.mostrarMenuAlumno();
    }
    
    public void MenuDelCoordinadorISC(){
        MenuCoordinador.mostrarMenuCoordinadorISC();
    }
    public void MenuDelCoordinadorIMAT(){
        MenuCoordinador.mostrarMenuCoordinadorIMAT();
    }
    public void MenuDelCoordinadorELC(){
        MenuCoordinador.mostrarMenuCoordinadorELC();
    }


}
