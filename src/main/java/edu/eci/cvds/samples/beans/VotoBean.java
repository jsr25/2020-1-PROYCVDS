package edu.eci.cvds.samples.beans;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.entities.Voto;
import edu.eci.cvds.samples.services.ServicioVoto;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import java.io.IOException;
import java.util.List;

@ManagedBean(name = "votoBean")
@SessionScoped
public class VotoBean extends BaseBean {
    private List<Voto> votoList;
    private Integer votos;
    private Boolean valor;
    private Idea idea;
    @Inject
    private ServicioVoto servicio;
    @PostConstruct
    public void init() {
        super.init();
    }

    public void generar(Idea idea) throws IOException {
        this.idea=idea;
        System.out.println(idea);
        //votoList=servicio.consultarVoto(nombreIdea);
        FacesContext.getCurrentInstance().getExternalContext().redirect("viewIdea.xhtml");
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }
    public  void consultar(String login){
        Boolean voto=idea.getVoto();
        if (voto){
            servicio.remover(login,idea.getNombreIdea());
            System.out.println("remover");
            idea.setVoto(!voto);
        }
        else{
            servicio.insertar(login,idea.getNombreIdea());
            System.out.println("insertar");
            idea.setVoto(!voto);
        }
        System.out.println(valor);
    }

    public Idea getIdea() {
        return idea;
    }

    public void setIdea(Idea idea) {
        this.idea = idea;
    }

}
