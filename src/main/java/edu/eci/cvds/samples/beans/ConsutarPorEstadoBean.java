package edu.eci.cvds.samples.beans;

import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean(name = "consultarPorEstado")
@SessionScoped
public class ConsutarPorEstadoBean extends BaseBean {
    @Inject
    private ServicioBancodeProyectos servicio;
    private String estado;
    private List<Idea> ideaList;

    public void mostrar(){
        ideaList = servicio.consultarIdeaPorEstado(estado);
        System.out.println(ideaList);

    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Idea> getIdeaList() {
        return ideaList;
    }

    public void setIdeaList(List<Idea> ideaList) {
        this.ideaList = ideaList;
    }
}
