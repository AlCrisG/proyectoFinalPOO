package usuario;
import usuario.utils.Genero;
import usuario.utils.Estado;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import usuario.utils.Curp;
import usuario.utils.Rol;

public class Persona {
    private String nombre, primerApellido, segundoApellido, ciudad, rfc, curp, direccion, nombreUsuario,contra;
    private Genero genero;
    private LocalDate fechaNacimiento, fechaRegistro;
    private Estado estado;
    private Rol rol;
    private int id;
    private static int ID_USUARIO= 1;

    public Persona(String nombre, String primerApellido, String segundoApellido, String fecha, String genero, String ciudad, String estado, String direccion,String nombreUsuario, String contra, Rol rol){
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = LocalDate.of(Integer.parseInt(fecha.substring(6)), Integer.parseInt(fecha.substring(3,5)), Integer.parseInt(fecha.substring(0,2)));
        this.genero = obtenerGenero(genero);
        this.ciudad = ciudad;
        this.estado = obtenerEstado(Integer.parseInt(estado));
        this.direccion = direccion;
        this.rol = rol;
        this.nombreUsuario = nombreUsuario;
        this.contra = contra;
        curp = Curp.crearCurp(nombre, primerApellido, segundoApellido, this.genero, fechaNacimiento, this.estado);
        this.id = ID_USUARIO;
        ID_USUARIO++;
        this.fechaRegistro = LocalDate.now();
    }
    
     public Rol getRol() {
        return rol;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContra() {
        return contra;
    }

    public int getId(){
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public LocalDate getFechaRegistro(){
        return fechaRegistro;
    }

    private Estado obtenerEstado(int option){
        Estado estado = null;

        switch(option){
            case 1 -> estado = Estado.Aguascalientes;
            case 2 -> estado = Estado.BCN;
            case 3 -> estado = Estado.BCS;
            case 4 -> estado = Estado.Campeche;
            case 5 -> estado = Estado.Coahuila;
            case 6 -> estado = Estado.Colima;
            case 7 -> estado = Estado.Chiapas;
            case 8 -> estado = Estado.Chihuahua;
            case 9 -> estado = Estado.CDMX;
            case 10 -> estado = Estado.Durango;
            case 11 -> estado = Estado.Guanajuato;
            case 12 -> estado = Estado.Guerrero;
            case 13 -> estado = Estado.Hidalgo;
            case 14 -> estado = Estado.Jalisco;
            case 15 -> estado = Estado.EdoMex;
            case 16 -> estado = Estado.Michoacan;
            case 17 -> estado = Estado.Morelos;
            case 18 -> estado = Estado.Nayarit;
            case 19 -> estado = Estado.NuevoLeon;
            case 20 -> estado = Estado.Oaxaca;
            case 21 -> estado = Estado.Puebla;
            case 22 -> estado = Estado.Queretaro;
            case 23 -> estado = Estado.QuintanaRoo;
            case 24 -> estado = Estado.SLP;
            case 25 -> estado = Estado.Sinaloa;
            case 26 -> estado = Estado.Sonora;
            case 27 -> estado = Estado.Tabasco;
            case 28 -> estado = Estado.Tamaulipas;
            case 29 -> estado = Estado.Tlaxcala;
            case 30 -> estado = Estado.Veracruz;
            case 31 -> estado = Estado.Yucatan;
            case 32 -> estado = Estado.Zacatecas;
            case 33 -> estado = Estado.NacidoExtranjero;
        }

        return estado;
    }

    private Genero obtenerGenero(String respuestaGenero){
        Genero genero = null;

        if(respuestaGenero.equals("H")){
            genero = Genero.Hombre;
        } else if(respuestaGenero.equals("M")){
            genero = Genero.Mujer;
        }

        return genero;
    }

    protected static void mostrarInformacion(Persona persona){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("======================================================");
        System.out.printf("ID: %s%n", persona.id);
        System.out.printf("Nombre completo: %s %s %s%n", persona.nombre, persona.primerApellido, persona.segundoApellido);
        System.out.printf("Fecha de nacimiento: %s%n", persona.fechaNacimiento.format(formatter));
        System.out.printf("CURP: %s%n", persona.curp);
        System.out.printf("RFC: %s%n", persona.rfc);
        System.out.printf("Dirección: %s%n", persona.direccion);
        System.out.printf("Ciudad: %s%n", persona.ciudad);
        System.out.printf("Estado: %s%n", persona.estado);
    }

    public String getNombreCompleto(){
        return nombre + " " + primerApellido + " " + segundoApellido;
    }

}
