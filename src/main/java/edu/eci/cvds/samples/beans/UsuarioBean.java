package edu.eci.cvds.samples.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
@ManagedBean(name = "usuariobean")
@SessionScoped
public class UsuarioBean extends BaseBean {
    public void consultar(){
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("ConsultarIdeas.xhtml");
        } catch (IOException e) {

        }
    }
}