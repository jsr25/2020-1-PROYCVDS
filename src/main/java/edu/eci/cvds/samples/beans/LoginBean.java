package edu.eci.cvds.samples.beans;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.persistence.PersistenceException;
import edu.eci.cvds.samples.services.BancoDeProyectosException;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
import edu.eci.cvds.samples.services.ServicioUsuario;
import org.h2.value.ValueStringIgnoreCase;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;

/**
 * Clase LoginBean de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
@ManagedBean(name = "loginbean")
@SessionScoped

public class LoginBean extends BaseBean{
    @Inject
    private ServicioUsuario servicio;
    private Usuario usuario;
    private String val="login.xhtml";
    private String login;
    private String area;


    /**
     * Método que revisa usuario con contrasena correcta.
     * @param password Argumentos del programa.
     * @param usuario Argumentos del programa.
     * @throws IOException lanza excepcion si no es correcto algun dato ingresado.
     */
    public void datos(String usuario, String password)  {
        try {

            this.usuario=servicio.consultarUsuario(usuario);
            this.area=this.usuario.getArea();
            if (password.equals(this.usuario.getPassword())) {
                comprobacion(password);
            }
            login=this.usuario.getLogin();
            FacesContext.getCurrentInstance().getExternalContext().redirect(val);
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage("form:User", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error!", "User or Password invalid"));
        }
    }

   public void comprobacion(String password){
        if(usuario.getRole().equals("Administrador")){
            val="administrador.xhtml";
        }
        else if(usuario.getRole().equals("Proponente")){
            val="proponente.xhtml";
        }
        else if(usuario.getRole().equals("PersonalPMO")){
            val="personal.xhtml";
        }
        else if(usuario.getRole().equals("Usuario")){
            val="usuario.xhtml";
        }
   }
    public void volverLogin(){
        usuario=null;
        val="login.xhtml";
        login=null;
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect(val);
        } catch (IOException e) {

        }

    }
    public void reinicio(){
        usuario=null;
        val="index.xhtml";
        login=null;
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect(val);
        } catch (IOException e) {

        }

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}