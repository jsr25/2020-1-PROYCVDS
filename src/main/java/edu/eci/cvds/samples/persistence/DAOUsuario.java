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
    public Usuario consultarUsuario(String usuario) throws PersistenceException;

    /**
     * Método que guarda informacion del usuario.
     * @param pClave Argumentos del programa.
     */
    public List<Usuario> consultarUsuarios(String pClave) throws PersistenceException;

    /**
     * Método que registra informacion del usuario.
     * @param usuario Argumentos del programa.
     */
    public void registrarUsuario(Usuario usuario) throws PersistenceException;

    /**
     *
     * @param usuario
     */
    public void deleteUsuario(String usuario) throws PersistenceException;

    public void carbiarRole(String estado, Usuario usuario) throws PersistenceException;
}
