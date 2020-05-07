package edu.eci.cvds.samples.beans;

import com.google.inject.Inject;
import edu.eci.cvds.samples.Segurity.LoginSegurity;
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
    @Inject
    private LoginSegurity loginSegurity;
    private String usuario;
    private String password;
    private Boolean remenber;


    public Boolean getRemenber() {
        return remenber;
    }

    public void setRemenber(Boolean remenber) {
        this.remenber = remenber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void login() throws IOException {
        if(!loginSegurity.isLogged()) {
            loginSegurity.login(usuario, password, false);
            pantallaInicial();
        }
        else{
            FacesContext facesContext = FacesContext.getCurrentInstance();
            facesContext.getExternalContext().redirect("../login.xhtml");
        }
    }

    public void salir() throws IOException {
        //
        loginSegurity.salir();
        FacesContext.getCurrentInstance().getExternalContext().redirect("../login.xhtml");
    }

    public void pantallaInicial() throws IOException {
        if(loginSegurity.proponente()){
            FacesContext.getCurrentInstance().getExternalContext().redirect("proponente/proponente.xhtml");
        }
        if(loginSegurity.administrador()){
            FacesContext.getCurrentInstance().getExternalContext().redirect("admin/administrador.xhtml");
        }
        if(loginSegurity.usuario()){
            FacesContext.getCurrentInstance().getExternalContext().redirect("usuario/usuario.xhtml");
        }
        if(loginSegurity.pmo()){
            FacesContext.getCurrentInstance().getExternalContext().redirect("PMO/personal.xhtml");
        }
    }

}