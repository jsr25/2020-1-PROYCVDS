package edu.eci.cvds.samples.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.PersonalPMO;
import edu.eci.cvds.samples.persistence.DAOPersonalPMO;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.PersonalPMOMapper;

/**
 * Clase MyBatisDAOPersonalPMO de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public class MyBatisDAOPersonalPMO implements DAOPersonalPMO {
    @Inject
    private PersonalPMOMapper pmap=null;

    /**
     * Método que consulta informacion del personal.
     * @param usuario Argumentos del programa.
     * @return usuario Retorno del programa.
     */
    public PersonalPMO consultarInfo(String usuario) {
        return pmap.consultarInfo(usuario);
    }

    public void registrarPersonalPMO(PersonalPMO personalPMO) {
        pmap.registrarPersonalPMO(personalPMO);
    }
}
