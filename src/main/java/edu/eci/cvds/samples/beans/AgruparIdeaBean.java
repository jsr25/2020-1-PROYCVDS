package edu.eci.cvds.samples.beans;

import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase AsignarPerfinBean de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
@ManagedBean(name = "agruparIdea")
@SessionScoped
public class AgruparIdeaBean extends BaseBean {
    @Inject
    private ServicioBancodeProyectos servicio;

    private List<Idea> ideas;
    private List<Idea> seleccion;
    private Idea principal;
    private Idea segunda;

    @PostConstruct
    public void init() {
        super.init();
        ideas = servicio.consultarTodo();
    }

    public void generar(String idea){
        principal=servicio.consultarIdea(idea);
        ideas=servicio.consultarIdeaM(idea);
    }

    public void agrupar(){
        servicio.registrarRelacion(principal.getNombreIdea(),segunda.getNombreIdea());
    }

    public void consultar(String idea){
        principal=servicio.consultarIdea(idea);
        ideas=servicio.consultarRelacion(idea);
    }

    public List<Idea> getIdeas() {
        return ideas;
    }

    public void setIdeas(List<Idea> ideas) {
        this.ideas = ideas;
    }

    public Idea getPrincipal() {
        return principal;
    }

    public void setPrincipal(Idea principal) {
        this.principal = principal;
    }

    public Idea getSegunda() {
        return segunda;
    }

    public void setSegunda(Idea segunda) {
        this.segunda = segunda;
    }

    public List<Idea> getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(List<Idea> seleccion) {
        this.seleccion = seleccion;
    }
}