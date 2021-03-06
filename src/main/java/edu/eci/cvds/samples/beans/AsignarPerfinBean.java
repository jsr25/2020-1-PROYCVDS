package edu.eci.cvds.samples.beans;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.persistence.PersistenceException;
import edu.eci.cvds.samples.services.BancoDeProyectosException;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
import edu.eci.cvds.samples.services.ServicioUsuario;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.util.List;

/**
 * Clase AsignarPerfinBean de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
@ManagedBean(name = "asignarPerfil")
@SessionScoped
public class AsignarPerfinBean extends BaseBean {
    @Inject
    private ServicioUsuario servicio;

    private List<Usuario> usuarios;
    private List<Usuario> usuariosSeleccionados;
    private Usuario usuario;
    private String role;
    private String name;


    /**
     * Método que consulta los usuarios de la base de datos.
     * @throws IOException lanza excepcion si el usuario no coincide.
     */
    public void consultar() {
        try {
            usuarios=servicio.consultarUsuarios("Administrador");
        } catch (BancoDeProyectosException e) {

        } catch (PersistenceException e) {

        }


    }

    @PostConstruct
    public void init()  {
        super.init();
        consultar();

    }
    /**
     * Método que obtiene los usuarios de la base de datos que han sido seleccionados.
     * @return usuariosSeleccioandos retorno del programa.
     */
   public List<Usuario> getUsuariosSeleccionados() {return usuariosSeleccionados;}

    /**
     * Método que guarda los usuarios de la base de datos que han sido seleccionados.
     * @param usuariosSeleccionados Argumentos del programa.
     */
    public void setUsuariosSeleccionados(List<Usuario> usuariosSeleccionados) {
        this.usuariosSeleccionados = usuariosSeleccionados;
    }

    /**
     * Método que consulta los usuarios de la base de datos.
     * @return usuarios retorno del programa.
     */
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * Método que guarda los usuarios de la base de datos.
     * @param usuarios Argumentos del programa.
     */
    public void setUsuarios(List<Usuario> usuarios) {
       this.usuarios = usuarios;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void cambiar(){
        if(!role.equals("")){
            try {
                servicio.carbiarRole(role,usuario);
                usuario=null;
                usuarios=servicio.consultarUsuarios("Administrador");;
                role=null;
                FacesContext.getCurrentInstance().getExternalContext().redirect("administrador.xhtml");

            } catch (BancoDeProyectosException e) {

            } catch (PersistenceException e) {

            } catch (IOException e) {

            }
        }
    }
    public void volver(){
        usuario=null;
        try {
            usuarios=servicio.consultarUsuarios("Administrador");
        } catch (BancoDeProyectosException e) {

        } catch (PersistenceException e) {

        }
        ;
        role=null;
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("administrador.xhtml");
        } catch (IOException e) {

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
