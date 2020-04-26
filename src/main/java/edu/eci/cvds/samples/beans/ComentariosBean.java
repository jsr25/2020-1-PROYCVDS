package edu.eci.cvds.samples.beans;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Comentario;
import edu.eci.cvds.samples.services.ServicioComentario;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Date;
import java.util.List;


/**
 * Clase que proporciona la interaccion entre la parte web y
 * los comentarios en la base de datos
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
@ManagedBean(name = "comentarioBean")
@SessionScoped
public class ComentariosBean extends BaseBean{

    @Inject
    private ServicioComentario servcom;
    private Boolean visible;
    private String nombreIdea;
    private List<Comentario> comentarioList;


    /**
     * Registrar un nuevo comentario
     * @param loginUsuario
     * @param comentario
     */
    public void registrasComentario(String loginUsuario,String comentario,String nombreIdea){
        Date fecha=new Date();
        Comentario comen= new Comentario(nombreIdea,loginUsuario,comentario,fecha);
        servcom.registrarComentario(comen);
        Buscar(nombreIdea);

    }

    /**
     *Consulta los comentarios
     * dado el nombre de la idea
     * @param nombreIdea
     */
    public void Buscar(String nombreIdea){
        this.nombreIdea=nombreIdea;
        comentarioList=servcom.consultarComentarios(nombreIdea);
        visible=true;

    }
    @PostConstruct
    public void init() {
    super.init();
    visible=false;
    }

    public String getNombreIdea() {
        return nombreIdea;
    }

    public void setNombreIdea(String nombreIdea) {
        this.nombreIdea = nombreIdea;
    }

    public List<Comentario> getComentarioList() {
        return comentarioList;
    }

    public void setComentarioList(List<Comentario> comentarioList) {
        this.comentarioList = comentarioList;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
}
