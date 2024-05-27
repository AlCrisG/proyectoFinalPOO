package grupo;

import java.util.ArrayList;

import materia.Materia;
import usuario.Alumno;

public class Grupo {
    private int id;
    private String carreraDelGrupo;
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    private String tipoGrupo;
    private ArrayList<Materia> materias = new ArrayList<>();
    private String semestre;


    public Grupo(int id, String carreraDelGrupo, ArrayList<Alumno> alumnos, String tipoGrupo,
            ArrayList<Materia> materias, String semestre) {
        this.id = id;
        this.carreraDelGrupo = carreraDelGrupo;
        this.alumnos = alumnos;
        this.tipoGrupo = tipoGrupo;
        this.materias = materias;
        this.semestre = semestre;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getCarreraDelGrupo() {
        return carreraDelGrupo;
    }


    public void setCarreraDelGrupo(String carreraDelGrupo) {
        this.carreraDelGrupo = carreraDelGrupo;
    }


    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }


    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }


    public String getTipoGrupo() {
        return tipoGrupo;
    }


    public void setTipoGrupo(String tipoGrupo) {
        this.tipoGrupo = tipoGrupo;
    }


    public ArrayList<Materia> getMaterias() {
        return materias;
    }


    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }


    public String getSemestre() {
        return semestre;
    }


    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    
    
}
