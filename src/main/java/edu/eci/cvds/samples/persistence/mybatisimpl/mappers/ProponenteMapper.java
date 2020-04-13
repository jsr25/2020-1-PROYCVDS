package edu.eci.cvds.samples.persistence.mybatisimpl.mappers;

import edu.eci.cvds.samples.entities.Proponente;
import org.apache.ibatis.annotations.Param;

/**
 * Clase ProponenteMapper de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public interface ProponenteMapper {

    /**
     * Método que consulta informacion del proponente.
     * @param usuario Argumentos del programa.
     */
    public Proponente consultarInfo(@Param("usuario")String usuario);

    public void registrarProponente(@Param("usuario")Proponente proponente);
}
