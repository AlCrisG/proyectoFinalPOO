package carrera;

import java.time.LocalDate;

import usuario.Coordinador;

public class ELC extends Carrera{
    private int id;
    private String nomCarrera;
    private int cantGrupos;
    private int cantAlumnos;
    private LocalDate fechaCreacion;
    private Coordinador coordinadorELC;

    public ELC(int id, String nomCarrera, int cantGrupos, int cantAlumnos, LocalDate fechaCreacion,Coordinador coordinadorELC) {
        this.id = id;
        this.nomCarrera = nomCarrera;
        this.cantGrupos = cantGrupos;
        this.cantAlumnos = cantAlumnos;
        this.fechaCreacion = fechaCreacion;
        this.coordinadorELC = coordinadorELC;
    }

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomCarrera() {
        return nomCarrera;
    }
    public void setNomCarrera(String nomCarrera) {
        this.nomCarrera = nomCarrera;
    }
    public int getCantGrupos() {
        return cantGrupos;
    }
    public void setCantGrupos(int cantGrupos) {
        this.cantGrupos = cantGrupos;
    }
    public int getCantAlumnos() {
        return cantAlumnos;
    }
    public void setCantAlumnos(int cantAlumnos) {
        this.cantAlumnos = cantAlumnos;
    }
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Coordinador getCoordinadorELC() {
        return coordinadorELC;
    }
    public void setCoordinadorELC(Coordinador coordinadorELC) {
        this.coordinadorELC = coordinadorELC;
    }

    
}
