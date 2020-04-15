package edu.eci.cvds.samples.beans;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
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
     * @param pClave Argumentos del programa.
     * @throws IOException lanza excepcion si el usuario no coincide.*/
    public void consultar(String pClave) throws IOException {
        ideas=servicio.consultarIDea(pClave);
    }
    public void cambiarEstado(){
        if (!estado.equals("")) { servicio.cambiarEstado(estado, idea); }
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
