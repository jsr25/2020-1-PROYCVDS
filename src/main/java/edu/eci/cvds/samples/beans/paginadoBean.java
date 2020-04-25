package edu.eci.cvds.samples.beans;


import edu.eci.cvds.samples.entities.Area;
import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
import org.primefaces.model.chart.PieChartModel;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.io.IOException;
import java.util.List;

@ManagedBean(name = "paginadoBean")
@SessionScoped


public class paginadoBean extends BaseBean {
   @Inject
   private ServicioBancodeProyectos servicio;
   private List<Idea> ideas;
   private Idea idea;

    private void generar() {
        ideas = servicio.consultarTodo();
    }
    public void volver() {
        ideas = null;
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("usuario.xhtml");
        } catch (IOException e) {
        }
    }
    public void view(String idea) {
        this.idea=servicio.consultarIdea(idea);
        System.out.println(this.idea);
        /*try {
            //FacesContext.getCurrentInstance().getExternalContext().redirect("viewIdea.xhtml");
        } catch (IOException e) {
        }*/
    }
    public List<Idea> getIdeas() {
        return ideas;
    }

    public void setIdeas(List<Idea> ideas) {
        this.ideas = ideas;
    }

    @PostConstruct
    public void init() {
        super.init();
        generar();
    }
}
