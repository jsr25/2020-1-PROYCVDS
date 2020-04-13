package edu.eci.cvds.samples.persistence.mybatisimpl;

import edu.eci.cvds.samples.entities.Administrador;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.persistence.DAOAdministrador;
import com.google.inject.Inject;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.AdministradorMapper;
import java.util.List;

/**
 * Clase MyBatisDAOAdministrador de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public class MyBatisDAOAdministrador implements DAOAdministrador {
    @Inject
    private AdministradorMapper pmap=null;

    /**
     * Método que consulta informacion del administrador.
     * @param usuario Argumentos del programa.
     */
    public Administrador consultarInfoAdmin(String usuario) {

        return pmap.consultarInfoAdmin(usuario);
    }

    /**
     * Método que consulta usuarios del administrador.
     * @param usuario Argumentos del programa.
     * @return usuario Retorno del programa.
     */
    public List<Usuario> consultarUsuarios(String usuario) {
        return  pmap.consultarUsuarios(usuario);
    }

    public void registrarAdministrador(Administrador administrador) {
        pmap.registrarAdministrador(administrador);

    }
}
