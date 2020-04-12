package edu.eci.cvds.samples.persistence;

import edu.eci.cvds.samples.entities.PersonalPMO;

/**
 * Clase DAOPersonalPMO de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public interface DAOPersonalPMO {

    /**
     * Método que consulta informacion del personal.
     * @param usuario Argumentos del programa.
     */
    public PersonalPMO consultarInfo(String usuario);
}
