package edu.eci.cvds.samples.beans;

import com.google.inject.Inject;
import edu.eci.cvds.samples.MyBatisExample;
import edu.eci.cvds.samples.entities.Administrador;
import edu.eci.cvds.samples.entities.PersonalPMO;
import edu.eci.cvds.samples.entities.Proponente;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
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
    private ServicioBancodeProyectos servicio;
    private String usuario;
    private String password;
    private String role;
    private String val="login.xhtml";

    /**
     * Método que revisa usuario con contrasena correcta.
     * @param password Argumentos del programa.
     * @param usuario Argumentos del programa.
     * @throws IOException lanza excepcion si no es correcto algun dato ingresado.
     */
    public void datos(String usuario, String password) throws IOException {
        if (role.equals("Administrador")) {comproAd(usuario,password);}
        else if(role.equals("PersonalPMO")){comproPerso(usuario,password);}
        else if(role.equals("Proponente")){comproPropo(usuario,password);}
        else if(role.equals("Usuario")){comproUsu(usuario,password);}
        FacesContext.getCurrentInstance().getExternalContext().redirect(val);
    }

    /**
     * Método que comprueba datos del administrador.
     * @param password Argumentos del programa.
     * @param usuario Argumentos del programa.
     */
    public void comproAd(String usuario,String password){
        Administrador admin = servicio.consultarInfoAdmin("ma");
        if(admin.getPasword().equals(password)){
            val = "administrador.xhtml";
        }
    }

    /**
     * Método que comprueba datos del proponente.
     * @param password Argumentos del programa.
     * @param usuario Argumentos del programa.
     */
    public void comproPropo(String usuario,String password){
        Proponente proponente= servicio.consultarinfoPro(usuario);
        if(proponente.getPassword().equals(password)){
            val = "proponente.xhtml";
        }
    }

    /**
     * Método que comprueba datos del usuario.
     * @param password Argumentos del programa.
     * @param usuario Argumentos del programa.
     */
    public void comproUsu(String usuario,String password){
        Usuario user= servicio.consultarinfoUsuario(usuario);
        if(user.getPassword().equals(password)){
            val = "usuario.xhtml";
        }
    }

    /**
     * Método que comprueba datos del personal.
     * @param password Argumentos del programa.
     * @param usuario Argumentos del programa.
     */
    public void comproPerso(String usuario,String password){
        PersonalPMO personalPMO=servicio.consultarinfo(usuario);
        if(personalPMO.getPassword().equals(password)){
            val = "personal.xhtml";
        }
    }

    /**
     * Método que retorna el rol ingresado.
     * @return role retorno del programa.
     */
    public String getRole() {
        return role;
    }

    /**
     * Método que guarda el rol ingresado.
     * @return role retorno del programa.
     */
    public void setRole(String role) {
        this.role = role;
    }
}