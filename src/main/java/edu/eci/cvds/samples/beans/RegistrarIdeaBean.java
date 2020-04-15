package edu.eci.cvds.samples.beans;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.persistence.PersistenceException;
import edu.eci.cvds.samples.services.BancoDeProyectosException;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
import edu.eci.cvds.samples.services.ServicioUsuario;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Date;

/**
 * Clase RegistrarIdeaBean de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */

@ManagedBean(name = "registrarIDea")
@SessionScoped
public class RegistrarIdeaBean {
    @Inject
    private ServicioBancodeProyectos servicio;

    /**
     * Método que registra la idea.
     * @param descripcion Argumentos del programa.
     * @param loginProponente Argumentos del programa.
     * @param iD Argumentos del programa.
     * @param palabras Argumentos del programa.
     * @param clave Argumentos del programa.
     * @param fecha Argumentos del programa.
     * @param estado Argumentos del programa.
     */

    public void registroIdea(String descripcion, String loginProponente, String iD, String palabras, String clave, Date fecha, String estado) {
        Idea idea = new Idea(descripcion,loginProponente,iD,palabras,clave,fecha,estado);
        try{servicio.registrarIDea(idea);}
        catch (Exception e){}
    }

}
