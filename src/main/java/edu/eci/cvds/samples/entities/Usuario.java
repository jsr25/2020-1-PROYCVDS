package edu.eci.cvds.samples.entities;

/**
 * Clase Usuario de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public class Usuario {

    private String nombre;
    private String apellido;
    private String password;
    private String login;
    private String correo;
    private String role;
    private String area;



    /**
     * Método constructor de la clase.
     * @param login Argumentos del programa.
     * @param nombre Argumentos del programa.
     * @param apellido Argumentos del programa.
     * @param password Argumentos del programa.
     * @param correo Argumentos del programa.
     */
    public Usuario(String login, String nombre, String apellido, String password, String correo, String role,String area ) {
        this.login = login;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
        this.role=role;
        this.area=area;
    }
    /**
     * Método constructor de la clase.
     */
    public Usuario(){}

    /**
     * Método que retorna el login.
     * @return login retorno del programa.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que guarda el login.
     * @param nombre retorno del programa.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que retorna el apellido.
     * @return apellido retorno del programa.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Método que guarda el apellido.
     * @param apellido retorno del programa.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Método que retorna la contrasena.
     * @return password retorno del programa.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Método que guarda la contrasena.
     * @param password retorno del programa.
     */
    public void setPassword(String password) {
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
     * Método que guarda el login.
     * @param login retorno del programa.
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Método que retorna el correo.
     * @return correo retorno del programa.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Método que guarda el correo.
     * @param correo retorno del programa.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     *
     * @return
     */
    public String getRole() {
        return role;
    }

    /**
     *
     * @param role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     *
     * @return
     */
    public String getArea() {
        return area;
    }

    /**
     *
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * Método que retorna el login exitoso.
     * @return string retorno del programa.
     */

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", password='" + password + '\'' +
                ", login='" + login + '\'' +
                ", correo='" + correo + '\'' +
                ", role='" + role + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
