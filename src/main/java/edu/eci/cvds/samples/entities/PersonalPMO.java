package edu.eci.cvds.samples.entities;

/**
 * Clase PersonalPMO de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public class PersonalPMO {
    private String nombre,apellido,password,login,correo;

    public PersonalPMO(String login, String nombre, String apellido, String password, String correo) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.password=password;
        this.login=login;
        this.correo=correo;
    }

    public PersonalPMO(){}

    /**
     * Método constructor de la clase.
     * @param login Argumentos del programa.
     * @param nombre Argumentos del programa.
     * @param apellido Argumentos del programa.
     * @param pasword Argumentos del programa.
     * @param correo Argumentos del programa.
     */
    public void PersonalPMO(String login,String nombre,String apellido,String pasword,String correo)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.password=pasword;
        this.login=login;
        this.correo=correo;
    }

    /**
     * Método que retorna el nombre.
     * @return nombre retorno del programa.
     */
    public String getNombre(){ return nombre; }

    /**
     * Método que retorna el apellido.
     * @return appelido retorno del programa.
     */
    public String getApellido(){ return apellido; }

    /**
     * Método que retorna la contrasena.
     * @return pasword retorno del programa.
     */
    public String getPassword(){ return password; }

    /**
     * Método que retorna el correo.
     * @return correo retorno del programa.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Método que retorna el login.
     * @return login retorno del programa.
     */
    public String getLogin() {
        return login;
    }

    /**
     * Método que guarda el apellido.
     * @param appelido Argumento del programa.
     */
    public void setApellido(String appelido) { this.apellido = appelido; }

    /**
     * Método que guarda el nombre.
     * @param nombre Argumento del programa.
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Método que guarda la contrasena.
     * @param pasword Argumento del programa.
     */
    public void setPassword(String pasword) { this.password = pasword; }

    /**
     * Método que guarda el correo.
     * @param correo Argumento del programa.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Método que guarda el login.
     * @param login Argumento del programa.
     */
    public void setLogin(String login) {
        this.login = login;
    }


    /**
     * Método que retorna el login exitoso.
     * @return string retorno del programa.
     */
    public String toString(){
        return "PersonalPMO{"+ "usuario= "+ login + ", nombre=" + nombre + ", apellido=" + apellido + ", password=" + password + ", correo=" + correo +'}';
    }
}