package edu.eci.cvds.samples.entities;

import java.util.Date;

/**
 * Entidad que representa un comentario
 *  de los usuarios
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public class Comentario {
    private String nombreIdea;
    private String Comentario;
    private String loginUsuario;
    private Date fecha;

    public Comentario(String nombreIdea, String loginUsuario, String comentario, Date fecha) {
        this.nombreIdea=nombreIdea;
        this.loginUsuario=loginUsuario;
        this.Comentario=comentario;
        this.fecha=fecha;
    }
    public Comentario(){}

    public String getNombreIdea() {
        return nombreIdea;
    }

    public void setNombreIdea(String nombreIdea) {
        this.nombreIdea = nombreIdea;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String comentario) {
        Comentario = comentario;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "nombreIdea='" + nombreIdea + '\'' +
                ", Comentario='" + Comentario + '\'' +
                ", loginUsuario='" + loginUsuario + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
