package edu.eci.cvds.samples.beans;

import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.entities.PalabraClave;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.io.IOException;
import java.util.List;

@ManagedBean(name = "modificarIdeaBean")
@SessionScoped
public class ModificarIdeaBean extends BaseBean{

    @Inject
    private ServicioBancodeProyectos servicio;

    private List<Idea> ideaList;
    private List<PalabraClave> palabraClaves;
    private Idea idea;
    private Idea editable;
    private String login;

    public void consultar(String login) throws IOException {
        this.login=login;
        ideaList = servicio.consultarIdeaEnEspera(login);
        FacesContext.getCurrentInstance().getExternalContext().redirect("ideasModificables.xhtml");

    }

    public void  modificar(String NombreIdea) throws IOException {
        System.out.println("....");
        this.idea=servicio.consultarIdea(NombreIdea);
        editable=idea;
        //palabraClaves = servicio.consultarPalabrasClave(idea.getNombreIdea());
        FacesContext.getCurrentInstance().getExternalContext().redirect("modificaciones.xhtml");
    }
    //corregir
    public void  actuaizarIdea() throws IOException {
        servicio.actualizarIdea(this.idea);
        idea = new Idea();
        consultar(login);
    }
    public void removerpalabra(String palabra){
        String nombreIdea = idea.getNombreIdea();
        //servicio.removerPalabra( nombreIdea, palabra)
        palabraClaves = servicio.consultarPalabrasClave(idea.getNombreIdea());
    }

    public void adicionarPalabra(String palabra){
        PalabraClave pal=new PalabraClave();
        pal.setNombreIdea(idea.getNombreIdea());
        pal.setValor(palabra);
        //servicio.registrarPalabra(pal)
        palabraClaves.add(pal);
    }

    public void volver() throws IOException {
        idea = new Idea();
        FacesContext.getCurrentInstance().getExternalContext().redirect("ideasModificables.xhtml");
    }

    public void guardar(){
        servicio.actualizarIdea(editable);
    }



    public List<Idea> getIdeaList() {
        return ideaList;
    }

    public void setIdeaList(List<Idea> ideaList) {
        this.ideaList = ideaList;
    }

    public Idea getIdea() {
        return idea;
    }

    public void setIdea(Idea idea) {
        this.idea = idea;
    }

}
