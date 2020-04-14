package edu.eci.cvds.samples.entities;
import java.util.Date;

/**
 * Clase Idea de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public class Idea {
    private String descripcion, loginProponente, iD, palabras, clave;
    private Date fecha;

    /**
     * Método constructor de la clase.
     * @param descripcion Argumentos del programa.
     * @param loginProponente Argumentos del programa.
     * @param iD Argumentos del programa.
     * @param palabras Argumentos del programa.
     * @param clave Argumentos del programa.
     */
    public Idea(String descripcion, String loginProponente, String iD, String palabras, String clave, Date fecha) {
        this.descripcion = descripcion;
        this.loginProponente = loginProponente;
        this.iD = iD;
        this.palabras = palabras;
        this.clave = clave;
        this.fecha = fecha;
    }

    /**
     * Método que retorna descripcion.
     * @return descripcion retorno del programa.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método que guarda descripcion.
     * @param descripcion Argumentos del programa.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Método que retorna login.
     * @return login retorno del programa.
     */
    public String getLoginProponente() {
        return loginProponente;
    }

    /**
     * Método que guarda login.
     * @param loginProponente Argumentos del programa.
     */
    public void setLoginProponente(String loginProponente) {
        this.loginProponente = loginProponente;
    }

    /**
     * Método que retorna iD.
     * @return iD retorno del programa.
     */
    public String getiD() {
        return iD;
    }

    /**
     * Método que guarda iD.
     * @param iD Argumentos del programa.
     */
    public void setiD(String iD) {
        this.iD = iD;
    }

    /**
     * Método que retorna palabras.
     * @return palabras retorno del programa.
     */
    public String getPalabras() {
        return palabras;
    }

    /**
     * Método que guarda palabras.
     * @param palabras Argumentos del programa.
     */
    public void setPalabras(String palabras) {
        this.palabras = palabras;
    }

    /**
     * Método que retorna clave.
     * @return clave retorno del programa.
     */
    public String getClave() {
        return clave;
    }

    /**
     * Método que guarda clave.
     * @param clave Argumentos del programa.
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * Método que retorna fecha.
     * @return fecha retorno del programa.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Método que guarda fecha.
     * @param fecha Argumentos del programa.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}