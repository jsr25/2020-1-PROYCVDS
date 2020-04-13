package edu.eci.cvds.samples.persistence;

import edu.eci.cvds.samples.entities.Proponente;
import org.apache.ibatis.annotations.Param;

/**
 * Clase DAOProponente de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public interface DAOProponente {

    /**
     * Método que consulta informacion del proponente.
     * @param usuario Argumentos del programa.
     */
    public Proponente consultarInfo(String usuario);

    public void registrarProponente(Proponente proponente);
}
