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
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase RegistrarIdeaBean de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */

@ManagedBean(name = "registrarIDeaBean")
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
     */

    public void registroIdea(String nombre,String descripcion, String loginProponente, String area) {
        Date fecha2=new Date();
        asignarIdea(nombre);
        Idea idea = new Idea(nombre,descripcion,fecha2,loginProponente,area,"En espera", palabraClaves);
        try{servicio.registrarIDea(idea);
            proponente();}
        catch (Exception e){

        }
    }

    private void asignarIdea(String nombreIdea){
        for(int i=0;i<palabraClaves.size();i++){
            palabraClaves.get(i).setNombreIdea(nombreIdea);
        }
    }
    @PostConstruct
    public void init() {
        super.init();
        palabraClaves=new ArrayList<PalabraClave>();
        palabraClave=new PalabraClave();
    }

    public void proponente(){
        try {
            super.init();
            palabraClaves=new ArrayList<PalabraClave>();
            palabraClave=new PalabraClave();
            FacesContext.getCurrentInstance().getExternalContext().redirect("proponente.xhtml");

        } catch (IOException e) {

        }
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
    public void reinit(String nombre){
        palabraClave=new PalabraClave();
        System.out.println(palabraClaves);
    }
}
