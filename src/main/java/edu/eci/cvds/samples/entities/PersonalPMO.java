package edu.eci.cvds.samples.entities;

/**
 * Clase PersonalPMO de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public class PersonalPMO {
    private String nombre,appelido,pasword,login,correo;

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
        this.appelido=apellido;
        this.pasword=pasword;
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
    public String getAppelido(){ return appelido; }

    /**
     * Método que retorna la contrasena.
     * @return pasword retorno del programa.
     */
    public String getPasword(){ return pasword; }

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
    public void setAppelido(String appelido) { this.appelido = appelido; }

    /**
     * Método que guarda el nombre.
     * @param nombre Argumento del programa.
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Método que guarda la contrasena.
     * @param pasword Argumento del programa.
     */
    public void setPasword(String pasword) { this.pasword = pasword; }

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
        return "PersonalPMO{"+ "usuario= "+ login + ", nombre=" + nombre + ", apellido=" + appelido + ", password=" + pasword + ", correo=" + correo +'}';
    }
}