package edu.eci.cvds.samples.persistence.mybatisimpl.mappers;

import edu.eci.cvds.samples.entities.PersonalPMO;
import org.apache.ibatis.annotations.Param;

/**
 * Clase PersonalPMOMapper de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public interface PersonalPMOMapper {

    /**
     * Método que consulta informacion del personal.
     * @param usuario Argumentos del programa.
     */
    public PersonalPMO consultarInfo(@Param("usuario")String usuario);
}
