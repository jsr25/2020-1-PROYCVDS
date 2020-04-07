package edu.eci.cvds.samples.entities;

public class PersonalPMO {
    private String nombre,appelido,pasword,login,correo;
    public void PersonalPMO(String login,String nombre,String apellido,String pasword,String correo)
    {
        this.nombre=nombre;
        this.appelido=apellido;
        this.pasword=pasword;
        this.login=login;
        this.correo=correo;
    }
    public String getNombre(){ return nombre; }
    public String getAppelido(){ return appelido; }
    public String getPasword(){ return pasword; }

    public String getCorreo() {
        return correo;
    }

    public String getLogin() {
        return login;
    }

    public void setAppelido(String appelido) { this.appelido = appelido; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPasword(String pasword) { this.pasword = pasword; }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String toString(){
        return "PersonalPMO{"+ "usuario= "+ login + ", nombre=" + nombre + ", apellido=" + appelido + ", password=" + pasword + ", correo=" + correo +'}';
    }
}
