package edu.eci.cvds.samples.persistence;

import edu.eci.cvds.samples.entities.Idea;

import java.util.List;

/**
 * Clase DAOIdea de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */

public interface DAOIdea {   /**
     * Método que consulta la idea que fue registrada.
     * @param idea Argumentos del programa.
     */
    public List<Idea> consultarIDea(String idea);

    public void registrarIDea(Idea idea);
}