package edu.eci.cvds.samples.beans;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.persistence.PersistenceException;
import edu.eci.cvds.samples.services.BancoDeProyectosException;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
import edu.eci.cvds.samples.services.ServicioUsuario;

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
    private String role;
    private String val="login.xhtml";

    /**
     * Método que revisa usuario con contrasena correcta.
     * @param password Argumentos del programa.
     * @param usuario Argumentos del programa.
     * @throws IOException lanza excepcion si no es correcto algun dato ingresado.
     */
    public void datos(String usuario, String password)  {
        try {
            this.usuario=servicio.consultarUsuario(usuario);
            comprobacion( password);
            FacesContext.getCurrentInstance().getExternalContext().redirect(val);
        } catch (BancoDeProyectosException e) {

        } catch (PersistenceException e) {
        }
        catch (IOException e) {

        }
    }

   public void comprobacion(String password){
        if(usuario.getRole().equals("Administrador")){
            val="administrador.xhtml";
        }
        else if(usuario.getRole().equals("Proponente")){
            val="Proponente.xhtml";
        }
        else if(usuario.getRole().equals("PersonalPMO")){
            val="PersonalPMO.xhtml";
        }
        else if(usuario.getRole().equals("Usuario")){
            val="Usuario.xhtml";
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