package carrera;

import java.time.LocalDate;

import usuario.Coordinador;

public class IMAT extends Carrera{

    public IMAT(int id, String nomCarrera, int cantGrupos, int cantAlumnos, LocalDate fechaCreacion,Coordinador coordinador){
        super(id,nomCarrera, cantGrupos, cantAlumnos, fechaCreacion, coordinador);

    }

    
}
