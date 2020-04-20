package edu.eci.cvds.samples.entities;
import java.util.Date;
import java.util.List;

/**
 * Clase Idea de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public class Idea {
    private String descripcion;
    private String login_Prop;
    private String nombreIdea;
    private String area;
    private String estado;
    private Date fecha;
    private List<PalabraClave> palabraClaves;

    /**
     *
     * @param nombreidea
     * @param descripcion
     * @param fecha
     * @param login_Prop
     * @param area
     * @param estado
     */
    public Idea(String nombreidea,String descripcion,Date fecha, String login_Prop, String area,String estado) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.login_Prop = login_Prop;
        this.nombreIdea = nombreidea;
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


    public String getNombreIdea() {
        return nombreIdea;
    }

    public void setNombreIdea(String nombreIdea) {
        this.nombreIdea = nombreIdea;
    }

    public String getLogin_Prop() {
        return login_Prop;
    }

    public void setLogin_Prop(String login_Prop) {
        this.login_Prop = login_Prop;
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
                ", login_Prop='" + login_Prop + '\'' +
                ", nombreIdea='" + nombreIdea + '\'' +
                ", area='" + area + '\'' +
                ", estado='" + estado + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}