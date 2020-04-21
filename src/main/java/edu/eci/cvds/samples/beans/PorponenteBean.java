package edu.eci.cvds.samples.beans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;

@ManagedBean(name = "proponentebean")
@SessionScoped
public class PorponenteBean extends BaseBean {

    public void  registroIdea(){
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("registroIdea.xhtml");
        } catch (IOException e) {

        }
    }
}
