package edu.eci.cvds.samples.persistence.mybatisimpl.mappers;

import org.apache.ibatis.annotations.Param;
import edu.eci.cvds.samples.entities.Idea;

import java.util.List;

/**
 * Clase IdeaMapper de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public interface IdeaMapper {
    /**
     * Método que consulta informacion de la idea.
     * @param idea Argumentos del programa.
     */
    public List<Idea> consultarIdea(@Param("idea")String idea);

    /**
     * Método que registra la idea.
     * @param idea
     */
    public void registrarIdea(@Param("idea")Idea idea);
}