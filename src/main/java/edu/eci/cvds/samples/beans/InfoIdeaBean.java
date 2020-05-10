package edu.eci.cvds.samples.beans;


import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.util.List;

@ManagedBean(name = "infoIdeaBean")
@SessionScoped
public class InfoIdeaBean extends BaseBean{
    @Inject
    private ServicioBancodeProyectos servicio;
    private List<Idea> ideas;
    private List<Idea> lidea2;
    private String pala;
    private String val = "login.xhtml";


    public void consultar ( )
    {
        ideas= servicio.consultarIDea(pala);
        System.out.println(ideas);
    }
    public void volver(){
        ideas=null;
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("usuario.xhtml");
        } catch (IOException e) {

        }
    }
    public List<Idea> getIdeas() {
        return ideas;
    }

    public void setIdeas(List<Idea> ideas) {
        this.ideas = ideas;
    }
    @PostConstruct
    public void init(){
        super.init();
        lidea2=servicio.consultarTodo();
    }

    public String getPala() {
        return pala;
    }

    public void setPala(String pala) {
        this.pala = pala;
    }
}

