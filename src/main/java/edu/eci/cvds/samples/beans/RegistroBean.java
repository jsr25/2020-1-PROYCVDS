package edu.eci.cvds.samples.beans;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "loginbean")
@SessionScoped
public class RegistroBean extends BaseBean{
    @Inject
    private ServicioBancodeProyectos servicio;

    private Usuario user;

    public void registroUsuario(String login,String nombre, String apellido , String password, String correo){
        Usuario usuario=new Usuario(login,nombre,apellido,password,correo);
        servicio.registarUsuario(usuario);
    }


}
