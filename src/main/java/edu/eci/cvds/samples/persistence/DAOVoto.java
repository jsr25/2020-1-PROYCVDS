package edu.eci.cvds.samples.persistence;

import org.apache.ibatis.annotations.Param;

/**
 * Clase IdeaMapper de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public interface DAOVoto {
    public void borrarVoto( String login,String nombreIdea);
}
