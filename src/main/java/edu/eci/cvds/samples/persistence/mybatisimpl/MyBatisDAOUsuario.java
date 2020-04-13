package edu.eci.cvds.samples.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.persistence.DAOUsuario;
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
    public Usuario consultarInfo(String usuario) {
        return pmap.consultarInfo(usuario);
    }

    /**
     * Método que consulta informacion del usuario.
     * @param pClave Argumentos del programa.
     * @return usuario Retorno del programa.
     */
    public List<Usuario> consultarUsuarios(String pClave) {
        return pmap.consultarUsuarios(pClave);
    }

    /**
     * Método que registra informacion del usuario.
     * @param usuario Argumentos del programa.
     */
    public void registrarUsuario(Usuario usuario) {
        pmap.registrarUsuario(usuario);
    }

    public void deleteUsuario(String usuario) {
        pmap.deleteUsuario(usuario);
    }

}
