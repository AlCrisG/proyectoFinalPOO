package usuario;

import java.time.LocalDate;
import java.util.Scanner;

import usuario.utils.Rol;

public class Alumno extends Persona{

    private LocalDate fechaRegistro;
    static Scanner leerCadenas = new Scanner(System.in);

    public Alumno(String nombre, String primerApellido, String segundoApellido, String fecha, String genero, String ciudad, String estado, String direccion, String nombreUsuario, String contra, LocalDate fechaRegistro){
        super(nombre, primerApellido, segundoApellido, fecha, genero, ciudad, estado, direccion, nombreUsuario, contra, Rol.Alumno);
        this.fechaRegistro = fechaRegistro;
    }
}
