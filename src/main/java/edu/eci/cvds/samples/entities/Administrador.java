package edu.eci.cvds.samples.entities;

public class Administrador {
    private String nombre,apellido,pasword,login,correo;
    public void Administrador(String login,String nombre,String apellido,String pasword, String correo)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.pasword=pasword;
        this.correo=correo;
    }
    public String getNombre(){ return nombre; }
    public String getApellido() {return apellido;}
    public String getPasword(){ return pasword; }
    public String getLogin() {return login; }

    public String getCorreo() {
        return correo;
    }

    public void setLogin(String login) { this.login = login; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido;}
    public void setPasword(String pasword) { this.pasword = pasword; }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String toString(){
        return "Administrador{"+ "usuario= "+ login + ", nombre=" + nombre + ", apellido=" + apellido + ", password=" + pasword + ", correo=" + correo +'}';
    }

}
