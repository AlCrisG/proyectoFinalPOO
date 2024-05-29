package carrera;

import java.time.LocalDate;

import usuario.Coordinador;

public class Carrera {
    private int id;
    private String nomCarrera;
    private int cantGrupos;
    private int cantAlumnos;
    private LocalDate fechaCreacion;
    private Coordinador coordinador;

    public Carrera(int id, String nomCarrera, int cantGrupos, int cantAlumnos, LocalDate fechaCreacion,Coordinador coordinador) {
        this.id = id;
        this.nomCarrera = nomCarrera;
        this.cantGrupos = cantGrupos;
        this.cantAlumnos = cantAlumnos;
        this.fechaCreacion = fechaCreacion;
        this.coordinador = coordinador;
    }

    


}
