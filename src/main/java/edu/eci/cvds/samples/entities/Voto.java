package edu.eci.cvds.samples.entities;

/**
 * Clase Idea de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public class Voto {
    private String login_Prop;
    private String nombreIdea;

    /**
     * @param nombreIdea
     * @param login_Prop
     */
    public Voto (String login_Prop, String nombreIdea){
        this.login_Prop = login_Prop;
        this.nombreIdea = nombreIdea;
    }

    /**
     * Método que retorna login.
     * @return login retorno del programa.
     */
    public String getLoginProponente() {
        return login_Prop;
    }

    /**
     * Método que guarda login.
     * @param loginProponente Argumentos del programa.
     */
    public void setLoginProponente(String loginProponente) {
        this.login_Prop = loginProponente;
    }

    /**
     * Método que retorna nombre de la idea.
     * @return nombreIdea retorno del programa.
     */
    public String getNombreIdea() {
        return nombreIdea;
    }

    /**
     * Método que guarda nombre de la idea.
     * @param nombreIdea Argumentos del programa.
     */
    public void setNombreIdea(String nombreIdea) {
        this.nombreIdea = nombreIdea;
    }
}
