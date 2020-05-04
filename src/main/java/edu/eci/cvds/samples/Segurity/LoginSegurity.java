package edu.eci.cvds.samples.Segurity;

public interface LoginSegurity {

    public void login(String Usuario, String password, Boolean record);

    public boolean isLogged();

    public boolean proponente();
    public boolean administrador();
    public boolean usuario();
    public boolean pmo();

    public void salir();

}
