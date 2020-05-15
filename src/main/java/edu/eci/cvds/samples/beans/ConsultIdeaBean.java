package edu.eci.cvds.samples.beans;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.util.List;

@ManagedBean(name = "ConsultBean")
@SessionScoped
public class ConsultIdeaBean extends BaseBean {
    @Inject
    private ServicioBancodeProyectos servicio;
    private List<Idea> ideas;
    private Idea idea;
    private String estado;
    /**
     * Método que consulta los usuarios de la base de datos.
     * @throws IOException lanza excepcion si el usuario no coincide.*/
    public void consultar() throws IOException {
        ideas=servicio.consultarTodo();
        FacesContext.getCurrentInstance().getExternalContext().redirect("estado_idea.xhtml");
    }
    public void cambiarEstado(){

        if (!estado.equals("")) {
            servicio.cambiarEstado(estado, idea);
            estado=null;
            idea=null;
            ideas=null;
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("administrador.xhtml");
            } catch (IOException e) {

            }
        }
    }
    public void volver(){
        estado=null;
        idea=null;
        ideas=null;
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("administrador.xhtml");
        } catch (IOException e) {

        }
    }
    public void volver2(){
        estado=null;
        idea=null;
        ideas=null;
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("personal.xhtml");
        } catch (IOException e) {

        }
    }
    public List<Idea> getIdeas() {
        return ideas;
    }

    public void setIdeas(List<Idea> ideas) {
        this.ideas = ideas;
    }

    public Idea getIdea() {
        return idea;
    }

    public void setIdea(Idea idea) {
        this.idea = idea;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
