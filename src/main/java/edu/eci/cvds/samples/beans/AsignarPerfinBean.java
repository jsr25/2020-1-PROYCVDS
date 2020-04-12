package edu.eci.cvds.samples.beans;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "asignarPerfil")
@SessionScoped
public class AsignarPerfinBean extends BaseBean {
    @Inject
    private ServicioBancodeProyectos servicio;

    private List<Usuario> usuarios=servicio.consultarUsuarios("jsr25");
    private List<Usuario> usuariosSeleccionados;
    public void consultar(String pClave) throws IOException {
              //usuarios=servicio.consultarUsuarios(pClave);
        FacesContext.getCurrentInstance().getExternalContext().redirect("buscar.xhtml");
    }

    public List<Usuario> getUsuariosSeleccionados() {
        return usuariosSeleccionados;
    }

    public void setUsuariosSeleccionados(List<Usuario> usuariosSeleccionados) {
        this.usuariosSeleccionados = usuariosSeleccionados;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
