package edu.eci.cvds.samples.entities;


public class Usuario {
    private String nombre, apellido, password, login, correo;

    public Usuario(String as, String ad, String af, String ag, String ah)
    {
        this.login = as;
        this.nombre = ad;
        this.apellido = af;
        this.correo = ag;
        this.password = ah;
    }


    public void Usuario(String login, String nombre, String apellido, String password, String correo)
    {
        this.login = login;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getCorreo() {
        return correo;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return "PersonalPMO{"+ "usuario= "+ login + ", nombre=" + nombre + ", apellido=" + apellido + ", password=" + password + ", correo=" + correo +'}';
    }
}
