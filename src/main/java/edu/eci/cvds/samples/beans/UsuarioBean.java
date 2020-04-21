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
    public void graphic(){
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("estadistica.xhtml");
        } catch (IOException e) {

        }
    }
    public void volver(){
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("usuario.xhtml");
        } catch (IOException e) {

        }
    }
}
