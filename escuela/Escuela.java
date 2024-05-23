package escuela;

import java.util.ArrayList;
import java.util.HashMap;

import usuario.Persona;
import usuario.utils.Rol;

public class Escuela {
    
    public static HashMap<Rol, ArrayList<Persona>> usuarios = new HashMap<>();

    public Escuela(){
        usuarios.put(Rol.Alumno, new ArrayList<>());
        usuarios.put(Rol.Maestro, new ArrayList<>());
        usuarios.put(Rol.Coordinador, new ArrayList<>());
        usuarios.get(Rol.Coordinador).add(new Persona("coooor", "Madero", "KKKK", "01/01/2002", "H", "Morelia","16", "", "1", "1",Rol.Coordinador));
    }

    public Persona verificarInicioSesion(String usuario,String contra){
        for(int i = 0; i < 5; i++){
            Rol rol = null;
            switch(i){
                case 0 -> rol = Rol.Alumno;
                case 1 -> rol = Rol.Maestro;
                case 2 -> rol = Rol.Coordinador;
                
            }

            for(Persona usuarioActual : usuarios.get(rol)){
                if(usuarioActual.getNombreUsuario().equals(usuario)){
                    if(usuarioActual.getContra().equals(contra)){
                            return usuarioActual;
                    }
                }
            }
        }
        return null;
    }
}
