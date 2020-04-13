package edu.eci.cvds.samples.beans;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Administrador;
import edu.eci.cvds.samples.entities.PersonalPMO;
import edu.eci.cvds.samples.entities.Proponente;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;
import java.util.ArrayList;
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

    private List<Usuario> usuarios;
    private List<Usuario> usuariosSeleccionados;
    private Usuario usuario;
    private String role;


    /**
     * Método que consulta los usuarios de la base de datos.
     * @param pClave Argumentos del programa.
     * @throws IOException lanza excepcion si el usuario no coincide.
     */
    public void consultar(String pClave) throws IOException {
              usuarios=servicio.consultarUsuarios(pClave);

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
            servicio.deleteUsuario(usuario.getLogin());
            if(role.equals("Administrador")){
                Administrador admin=new Administrador(usuario.getLogin(),usuario.getNombre(),usuario.getApellido(),usuario.getPassword(),usuario.getCorreo());
                servicio.registrarAdministrador(admin);
            }
            else if (role.equals("PersonalPMO")){
                PersonalPMO personalPMO=new PersonalPMO(usuario.getLogin(),usuario.getNombre(),usuario.getApellido(),usuario.getPassword(),usuario.getCorreo());
                servicio.registrarPersonalPMO(personalPMO);
            }
            else if (role.equals("Proponente")){
                Proponente proponente= new Proponente(usuario.getLogin(),usuario.getNombre(),usuario.getApellido(),usuario.getPassword(),usuario.getCorreo());
                servicio.registrarProponente(proponente);
            }
        }

    }
}