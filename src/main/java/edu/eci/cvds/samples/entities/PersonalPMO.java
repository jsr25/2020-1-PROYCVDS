package edu.eci.cvds.samples.entities;

public class PersonalPMO {
    private String nombre,appelido,pasword;
    public void PersonalPMO(String nombre,String apellido,String pasword)
    {
        this.nombre=nombre;
        this.appelido=apellido;
        this.pasword=pasword;
    }
    public String getNombre(){ return nombre; }
    public String getAppelido(){ return appelido; }
    public String getPasword(){ return pasword; }
    public void setAppelido(String appelido) { this.appelido = appelido; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPasword(String pasword) { this.pasword = pasword; }

}
