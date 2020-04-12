package edu.eci.cvds.samples.beans;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
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
    private ServicioBancodeProyectos servicio;
    private List<Usuario> usuarios=servicio.consultarUsuarios("jsr25");
    private List<Usuario> usuariosSeleccionados;

    /**
     * Método que consulta los usuarios de la base de datos.
     * @param pClave Argumentos del programa.
     * @throws IOException lanza excepcion si el usuario no coincide.
     */
    public void consultar(String pClave) throws IOException {
              //usuarios=servicio.consultarUsuarios(pClave);
        FacesContext.getCurrentInstance().getExternalContext().redirect("buscar.xhtml");
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
}