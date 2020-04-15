package edu.eci.cvds.samples.beans;


import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

@ManagedBean(name = "infoIdeaBean")
@SessionScoped
public class InfoIdeaBean extends BaseBean{
    @Inject
    private ServicioBancodeProyectos servicio;
    private List<Idea> Lidea;
    private List<Idea> Lidea2;
    private String val = "login.xhtml";

    @PostConstruct
    public void init() {
        super.init();
        Lidea = servicio.consultarIDea("a");
    }

    public void consultar (String palabrasClave ){
        Lidea= servicio.consultarIDea(palabrasClave);
    }

    public List<Idea> getLidea() {
        return Lidea;
    }

    public void setLidea(List<Idea> lidea) {
        Lidea = lidea;
    }

    public List<Idea> getLidea2() {
        return Lidea2;
    }

    public void setLidea2(List<Idea> lidea2) {
        Lidea2 = lidea2;
    }
}

