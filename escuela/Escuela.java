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
        usuarios.put(Rol.CoordinadorISC, new ArrayList<>());
        usuarios.put(Rol.CoordinadorIMAT, new ArrayList<>());
        usuarios.put(Rol.CoordinadorELC, new ArrayList<>());
        usuarios.get(Rol.CoordinadorISC).add(new Persona("c1", "Madero", "KKKK", "01/01/2002", "H", "Morelia","16", "direc1", "1", "1",Rol.CoordinadorISC));
        usuarios.get(Rol.CoordinadorIMAT).add(new Persona("c2", "Mad", "KKK", "01/01/2001", "M", "Morelia","16", "direc2", "2", "2",Rol.CoordinadorIMAT));
        usuarios.get(Rol.CoordinadorELC).add(new Persona("c3", "Ma", "KK", "01/01/2000", "H", "Morelia","16", "direc3", "3", "3",Rol.CoordinadorELC));
    }

    public Persona verificarInicioSesion(String usuario,String contra){
        for(int i = 0; i < 5; i++){
            Rol rol = null;
            switch(i){
                case 0 -> rol = Rol.Alumno;
                case 1 -> rol = Rol.Maestro;
                case 2 -> rol = Rol.CoordinadorISC;
                case 3 -> rol = Rol.CoordinadorIMAT;
                case 4 -> rol = Rol.CoordinadorELC;
                
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
