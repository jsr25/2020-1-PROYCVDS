package edu.eci.cvds.samples.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.persistence.DAOUsuario;
import edu.eci.cvds.samples.persistence.PersistenceException;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.UsuarioMapper;
import java.util.List;

/**
 * Clase MyBatisDAOUsuario de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public class MyBatisDAOUsuario implements DAOUsuario {
    @Inject
    private UsuarioMapper pmap=null;

    /**
     * Método que consulta informacion del usuario.
     * @param usuario Argumentos del programa.
     * @return usuario Retorno del programa.
     */
    public Usuario consultarUsuario(String usuario) throws PersistenceException {
        Usuario user=null;
        try{
            user=pmap.consultarUsuario(usuario);
        }
        catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("No se pudo consulatar al usuario",e);
        }
        return user;
    }

    /**
     * Método que consulta informacion del usuario.
     * @param usuario Argumentos del programa.
     * @return usuario Retorno del programa.
     */
    public List<Usuario> consultarUsuarios(String usuario) throws PersistenceException {
        List<Usuario> users;
        users=pmap.consultarUsuarios(usuario);
        return users;
    }

    /**
     * Método que registra informacion del usuario.
     * @param usuario Argumentos del programa.
     */
    public void registrarUsuario(Usuario usuario) throws PersistenceException {
        try{
            pmap.registrarUsuario(usuario);
        }
        catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("No se pudo registrar al usuario",e);
        }

    }

    public void deleteUsuario(String usuario) throws PersistenceException {
        try{
            pmap.deleteUsuario(usuario);
        }
        catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("No se pudo borrar al usuario",e);
        }

    }

    public void carbiarRole(String estado, Usuario usuario) throws PersistenceException {
        try{
            pmap.carbiarRole(estado,usuario);
        }
        catch(org.apache.ibatis.exceptions.PersistenceException e){
            throw new PersistenceException("No se pudo actualizar al usuario",e);
        }
    }

}
