package edu.eci.cvds.samples.entities;

/**
 * Clase Proponente de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public class Proponente {
    private String nombre, apellido, password, login, correo;

    public Proponente(String login, String nombre, String apellido, String password, String correo) {
        this.login = login;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
    }

    public Proponente(){}

    /**
     * Método constructor de la clase.
     * @param login Argumentos del programa.
     * @param nombre Argumentos del programa.
     * @param apellido Argumentos del programa.
     * @param password Argumentos del programa.
     * @param correo Argumentos del programa.
     */
    public void Proponente(String login, String nombre, String apellido, String password, String correo) {
        this.login = login;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
    }

    /**
     * Método que retorna el login.
     * @return login retorno del programa.
     */
    public String getLogin() {
        return login;
    }

    /**
     * Método que retorna el correo.
     * @return correo retorno del programa.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Método que retorna el apellido.
     * @return apellido retorno del programa.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Método que retorna el nombre.
     * @return nombre retorno del programa.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que retorna la contrasena.
     * @return password retorno del programa.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Método que guarda el login.
     * @param login retorno del programa.
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Método que guarda el correo.
     * @param correo retorno del programa.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Método que guarda el apellido.
     * @param apellido retorno del programa.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Método que guarda el nombre.
     * @param nombre retorno del programa.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que guarda la contrasena.
     * @param password retorno del programa.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Método que retorna el login exitoso.
     * @return string retorno del programa.
     */
    public String toString(){
        return "PersonalPMO{"+ "usuario= "+ login + ", nombre=" + nombre + ", apellido=" + apellido + ", password=" + password + ", correo=" + correo +'}';
    }
}
