package semestre;

import java.util.ArrayList;

import grupo.Grupo;

public class PrimerSemestre {
    private int id;
    private int numSemestre;
    private String carrera;
    private ArrayList<Grupo>grupos = new ArrayList<>();
    public PrimerSemestre(int id, int numSemestre, String carrera, ArrayList<Grupo> grupos) {
        this.id = id;
        this.numSemestre = numSemestre;
        this.carrera = carrera;
        this.grupos = grupos;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumSemestre() {
        return numSemestre;
    }
    public void setNumSemestre(int numSemestre) {
        this.numSemestre = numSemestre;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public ArrayList<Grupo> getGrupos() {
        return grupos;
    }
    public void setGrupos(ArrayList<Grupo> grupos) {
        this.grupos = grupos;
    }

    
}
