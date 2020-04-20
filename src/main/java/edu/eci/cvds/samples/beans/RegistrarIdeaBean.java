package edu.eci.cvds.samples.beans;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.entities.PalabraClave;
import edu.eci.cvds.samples.persistence.PersistenceException;
import edu.eci.cvds.samples.services.BancoDeProyectosException;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
import edu.eci.cvds.samples.services.ServicioUsuario;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Date;
import java.util.List;

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

   public void registroIdea(String nombreIdea, String descripcion, Date fecha, String login_Prop, String area, String estado) {
        Idea idea = new Idea(nombreIdea,descripcion,fecha ,login_Prop,area,estado);
       try{servicio.registrarIDea(idea);}
         catch (Exception e){}
    }

}
