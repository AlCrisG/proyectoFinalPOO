package usuario;

import java.time.LocalDate;
import java.util.Scanner;
import usuario.utils.Rol;

public class Coordinador extends Persona{
    private static Scanner leerNumeros = new Scanner(System.in);
    private static Scanner leerCadenas = new Scanner(System.in);
    private LocalDate fechaInicio;
    private double salario;

    public Coordinador(String nombre, String primerApellido, String segundoApellido, String fecha, String genero, String ciudad, String estado, String direccion, LocalDate fechaInicio,double salario, Rol rol, String nombreUsuario, String contra){
        super(nombre, primerApellido, segundoApellido, fecha, genero, ciudad, estado, direccion, nombreUsuario, contra, rol);
        this.fechaInicio = fechaInicio;
        this.salario = salario;
        
    }

    public LocalDate getFechaInicio(){
        return fechaInicio;
    }

    public double getSalario(){
        return salario;
    }



    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
