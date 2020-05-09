package edu.eci.cvds.samples.persistence;

import edu.eci.cvds.samples.entities.Voto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Clase IdeaMapper de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public interface DAOVoto {
    public void remover( String login,String nombreIdea);
    public List<Voto> consultarVotos(String idea);
    public void insertar( String login,String nombreIdea);
    public Voto consultarVoto(String idea, String login);
}
