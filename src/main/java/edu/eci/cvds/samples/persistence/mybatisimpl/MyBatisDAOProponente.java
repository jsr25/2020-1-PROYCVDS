package edu.eci.cvds.samples.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Proponente;
import edu.eci.cvds.samples.persistence.DAOProponente;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.ProponenteMapper;

/**
 * Clase MyBatisDAOProponente de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public class MyBatisDAOProponente implements DAOProponente {
    @Inject
    private ProponenteMapper pmap=null;

    /**
     * Método que consulta informacion del proponente.
     * @param usuario Argumentos del programa.
     * @return usuario Retorno del programa.
     */
    public Proponente consultarInfo(String usuario) {
        return pmap.consultarInfo(usuario);
    }
}
