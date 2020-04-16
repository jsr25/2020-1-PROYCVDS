package edu.eci.cvds.samples.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.persistence.DAOUsuario;
import edu.eci.cvds.samples.persistence.PersistenceException;
import edu.eci.cvds.samples.services.BancoDeProyectosException;
import edu.eci.cvds.samples.services.ServicioUsuario;

import java.util.List;

public class ServicioUsuarioimpl implements ServicioUsuario {
    @Inject
    private DAOUsuario usDao;


    public Usuario consultarUsuario(String usuario) throws BancoDeProyectosException, PersistenceException {
        Usuario user = null;
        try{
           user=usDao.consultarUsuario(usuario);
        }
        catch(NullPointerException e){
            throw new BancoDeProyectosException("No a ingresado ningun usuario");
        }

        return user;
    }

    public void registrarUsuario(Usuario usuario) throws BancoDeProyectosException, PersistenceException {
        try{
            usDao.registrarUsuario(usuario);
        }
        catch(NullPointerException e) {
            throw new BancoDeProyectosException("No a ingresado ningun usuario");

        }
    }

    public List<Usuario> consultarUsuarios(String usuario) throws BancoDeProyectosException, PersistenceException {
        List<Usuario> usuarios=null;
        try{
            usuarios=usDao.consultarUsuarios(usuario);
        }
        catch(NullPointerException e){

        }
        return usuarios;
    }

    public void carbiarRole(String estado, Usuario usuario) throws BancoDeProyectosException, PersistenceException {
        usDao.carbiarRole(estado,usuario);
    }
}
