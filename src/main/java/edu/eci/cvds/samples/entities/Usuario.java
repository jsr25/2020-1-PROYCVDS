package edu.eci.cvds.samples.entities;

import java.util.List;

public class Usuario {
    private String nombre,appelido,pasword,roll,estado,usuario;
    private List<String> nombres;
    public void Usuario(String usario,String nombre,String apellido,String pasword,String estado,String roll)
    {
        this.usuario=usuario;
        this.nombre=nombre;
        this.appelido=apellido;
        this.pasword=pasword;
        this.roll=roll;
        this.estado=estado;

    }
    public String getNombre(){ return nombre; }
    public String getAppelido(){ return appelido; }
    public String getPasword(){ return pasword; }
    public String getEstado(){ return estado ;}
    public String getRoll(){ return roll ;}
    public String getUsuario(){ return usuario; }
    public void setNombre(String nombre){ this.nombre=nombre; }
    public void setAppelido(String appelido){ this.appelido=appelido; }
    public void setPasword(String pasword){ this.pasword=pasword; }
    public void setEstado(String estado){ this.estado=estado; }
    public void setRoll(String roll){ this.roll=roll; }
    public void setUsuario(String usuario){ this.usuario=usuario; }
}
