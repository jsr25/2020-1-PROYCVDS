package edu.eci.cvds.samples.beans;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.persistence.PersistenceException;
import edu.eci.cvds.samples.services.BancoDeProyectosException;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
import edu.eci.cvds.samples.services.ServicioUsuario;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;

/**
 * Clase RegistroBean de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
@ManagedBean(name = "registarbean")
@ViewScoped
public class RegistroBean extends BaseBean{
    @Inject
    private ServicioUsuario servicio;

    /**
     * Método que registra el usuario con los datos que se piden.
     * @param login Argumentos del programa.
     * @param nombre Argumentos del programa.
     * @param apellido Argumentos del programa.
     * @param password Argumentos del programa.
     * @param correo Argumentos del programa.
     */
    public void registroUsuario (String login,String nombre, String apellido , String password, String correo, String area){
        Usuario usuario = new Usuario(login,nombre,apellido,password,correo,"Usuario",area);
        try {
            servicio.registrarUsuario(usuario);
            System.out.println(usuario);
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("creado.xhtml");
            } catch (IOException e) {

            }
        } catch (BancoDeProyectosException e) {

        } catch (PersistenceException e) {

        }
    }
    public void reinicio (){
        try {

            FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
        } catch (IOException e) {

        }
    }
}
