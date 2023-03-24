package Clases;

/**
 *
 * @author Trifunski
 */

public class Persona {
    
    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String añoNac;
    private String correo;
    private String contraseña;
    
    public void Persona (String dni, String nombre, String apellido1, String apellido2, String añoNac, String correo, String contraseña) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.añoNac = añoNac;
        this.correo = correo;
        this.contraseña = contraseña;
    }
    
    public String getDNI() {
        return dni;
    }
    
    public void setDNI(String dni) {
	this.dni = dni;
    } 
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido1() {
        return apellido1;
    }
    
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    
    public String getApellido2() {
        return apellido2;
    }
    
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    
    public String getAñoNac() {
        return añoNac;
    }
    
    public void setAñoNac(String añoNac) {
        this.añoNac = añoNac;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getContraseña() {
        return contraseña;
    }
    
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
