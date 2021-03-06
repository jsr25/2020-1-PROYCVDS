package edu.eci.cvds.samples.beans;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.util.List;

@ManagedBean(name = "ideasProponente")
@SessionScoped
public class IdeaProponenteBean extends BaseBean{

    @Inject
    private ServicioBancodeProyectos servicio;
    private List<Idea> ideas;

    public void consultarIdeasProponente (String proponente )
    {
        ideas= servicio.consultarIdeasProponente(proponente);
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("ideasProponente.xhtml");
        } catch (IOException e) {
        }
    }

    public List<Idea> getIdeas() {
        return ideas;
    }

    public void setIdeas(List<Idea> ideas) {
        this.ideas = ideas;
    }
}