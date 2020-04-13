package edu.eci.cvds.samples.entities;

/**
 * Clase Administrador de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public class Administrador {
    private String nombre,apellido,pasword,login,correo;

    public Administrador(String login, String nombre, String apellido, String password, String correo) {

        this.login=login;
        this.nombre=nombre;
        this.apellido=apellido;
        this.pasword=password;
        this.correo=correo;
    }
    public Administrador(){}
    /**
     * Método constructor de la clase.
     * @param login Argumentos del programa.
     * @param nombre Argumentos del programa.
     * @param apellido Argumentos del programa.
     * @param pasword Argumentos del programa.
     * @param correo Argumentos del programa.
     */
    public void Administrador(String login,String nombre,String apellido,String pasword, String correo)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.pasword=pasword;
        this.correo=correo;
    }

    /**
     * Método que retorna el nombre.
     * @return nombre retorno del programa.
     */
    public String getNombre(){ return nombre; }

    /**
     * Método que retorna el apellido.
     * @return apellido retorno del programa.
     */
    public String getApellido() {return apellido;}

    /**
     * Método que retorna la contrasena.
     * @return pasword retorno del programa.
     */
    public String getPassword(){ return pasword; }

    /**
     * Método que retorna el login.
     * @return login retorno del programa.
     */
    public String getLogin() {return login; }

    /**
     * Método que retorna el correo.
     * @return correo retorno del programa.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Método que guarda el login.
     * @param login Argumento del programa.
     */
    public void setLogin(String login) { this.login = login; }

    /**
     * Método que guarda el nombre.
     * @param nombre Argumento del programa.
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Método que guarda el apellido.
     * @param apellido Argumento del programa.
     */
    public void setApellido(String apellido) { this.apellido = apellido;}

    /**
     * Método que guarda la contrasena.
     * @param pasword Argumento del programa.
     */
    public void setPassword(String pasword) { this.pasword = pasword; }

    /**
     * Método que guarda el correo.
     * @param correo Argumento del programa.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Método que retorna el login exitoso.
     * @return string retorno del programa.
     */
    public String toString(){
        return "Administrador{"+ "usuario= "+ login + ", nombre=" + nombre + ", apellido=" + apellido + ", password=" + pasword + ", correo=" + correo +'}';
    }
}
