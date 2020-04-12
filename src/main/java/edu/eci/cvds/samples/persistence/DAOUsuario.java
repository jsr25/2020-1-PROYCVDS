package edu.eci.cvds.samples.persistence;

import edu.eci.cvds.samples.entities.Usuario;
import java.util.List;

/**
 * Clase DAOUsuario de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public interface DAOUsuario {

    /**
     * Método que consulta informacion del usuario.
     * @param usuario Argumentos del programa.
     */
    public Usuario consultarInfo(String usuario);

    /**
     * Método que guarda informacion del usuario.
     * @param pClave Argumentos del programa.
     */
    public List<Usuario> consultarUsuarios(String pClave);

    /**
     * Método que registra informacion del usuario.
     * @param usuario Argumentos del programa.
     */
    public void registrarUsuario(Usuario usuario);
}
