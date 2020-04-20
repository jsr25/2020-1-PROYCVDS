package edu.eci.cvds.samples.beans;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.entities.PalabraClave;
import edu.eci.cvds.samples.persistence.PersistenceException;
import edu.eci.cvds.samples.services.BancoDeProyectosException;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
import edu.eci.cvds.samples.services.ServicioUsuario;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase RegistrarIdeaBean de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */

@ManagedBean(name = "registrarIDea")
@SessionScoped
public class RegistrarIdeaBean extends BaseBean{
    @Inject
    private ServicioBancodeProyectos servicio;
    private PalabraClave palabraClave;
    private List<PalabraClave> palabraClaves;
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
        /*Idea idea = new Idea(descripcion,fecha ,iD,palabras,clave,loginProponente,estado);
        try{servicio.registrarIDea(idea);}
        catch (Exception e){}*/
    }
    @PostConstruct
    public void init() {
        super.init();
        palabraClaves=new ArrayList<PalabraClave>();
        palabraClave=new PalabraClave();
    }



    public PalabraClave getPalabraClave() {
        return palabraClave;
    }

    public void setPalabraClave(PalabraClave palabraClave) {
        this.palabraClave = palabraClave;
    }

    public List<PalabraClave> getPalabraClaves() {
        return palabraClaves;
    }

    public void setPalabraClaves(List<PalabraClave> palabraClaves) {
        this.palabraClaves = palabraClaves;
    }
    public void reinit(){
        palabraClave=new PalabraClave();
        System.out.println(palabraClaves);
    }
}
