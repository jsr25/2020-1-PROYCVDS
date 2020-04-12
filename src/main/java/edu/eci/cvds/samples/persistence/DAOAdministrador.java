package edu.eci.cvds.samples.persistence;

import edu.eci.cvds.samples.entities.Administrador;
import edu.eci.cvds.samples.entities.Usuario;
import java.util.List;

/**
 * Clase DAOAdministrador de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public interface DAOAdministrador {

    /**
     * Método que consulta informacion del administrador.
     * @param usuario Argumentos del programa.
     */
    public Administrador consultarInfoAdmin(String usuario);

    /**
     * Método que guarda informacion del administrador.
     * @param usuario Argumentos del programa.
     */
    public List<Usuario> consultarUsuarios(String usuario);
}
