package usuario;

import java.time.LocalDate;
import java.util.Scanner;

import grupo.Grupo;
import semestre.Semestre;
import usuario.utils.CarreraEnum;
import usuario.utils.Rol;

public class Alumno extends Persona{
    private CarreraEnum carrera;
    private Semestre semestre;
    private Grupo grupo;
    private float promedio = 0;
    private String numControl;

    static Scanner leerCadenas = new Scanner(System.in);

    public Alumno(String nombre, String primerApellido, String segundoApellido, String fecha, String genero, String ciudad, String estado, 
    String direccion, String nombreUsuario, String contra, LocalDate fechaRegistro, CarreraEnum carrera, Semestre semestre, Grupo grupo){
        super(nombre, primerApellido, segundoApellido, fecha, genero, ciudad, estado, direccion, nombreUsuario, contra, Rol.Alumno);
        this.carrera = carrera;
    }
}
