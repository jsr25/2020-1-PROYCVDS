package edu.eci.cvds.samples.entities;
import java.util.Date;

/**
 * Clase Idea de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public class Idea {
    private String descripcion, login_Prop, id, palabrasClave, area, estado;
    private Date fecha;

    /**
     * Método constructor de la clase.
     * @param descripcion Argumentos del programa.
     * @param login_Prop Argumentos del programa.
     * @param id Argumentos del programa.
     * @param palabrasClave Argumentos del programa.
     * @param area Argumentos del programa.
     * @param estado Argumentos del programa.
     */
    public Idea(String descripcion,Date fecha, String login_Prop,String id,String palabrasClave, String area,String estado) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.login_Prop = login_Prop;
        this.id = id;
        this.palabrasClave = palabrasClave;
        this.area = area;
        this.estado=estado;
    }
    public Idea(){}

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
     * Método que retorna iD.
     * @return iD retorno del programa.
     */
    public String getiD() {
        return id;
    }

    /**
     * Método que guarda iD.
     * @param iD Argumentos del programa.
     */
    public void setiD(String iD) {
        this.id = iD;
    }

    /**
     * Método que retorna palabras.
     * @return palabras retorno del programa.
     */
    public String getPalabras() {
        return palabrasClave;
    }

    /**
     * Método que guarda palabras.
     * @param palabras Argumentos del programa.
     */
    public void setPalabras(String palabras) {
        this.palabrasClave = palabras;
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

    /**
     * Método que retorna estado.
     * @return estado Argumentos del programa.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Método que guarda estado.
     * @param estado Argumentos del programa.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Método que retorna area.
     * @return area Argumentos del programa.
     */
    public String getArea() {
        return area;
    }

    /**
     * Método que guarda area.
     * @param area Argumentos del programa.
     */
    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Idea{" +
                "descripcion='" + descripcion + '\'' +
                ", loginProponente='" + login_Prop + '\'' +
                ", iD='" + id + '\'' +
                ", palabras='" + palabrasClave + '\'' +
                ", area='" + area + '\'' +
                ", estado='" + estado + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}