package edu.eci.cvds.samples.persistence.mybatisimpl.mappers;

import edu.eci.cvds.samples.entities.Area;
import edu.eci.cvds.samples.entities.PalabraClave;
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

    public List<Idea> consultarVoto(@Param("login")String login);

    /**
     * Método que registra la idea.
     * @param idea
     */
    public void registrarIdea(@Param("idea")Idea idea);

    /**
     * Método que cambia el estado de una idea
     * @param estado
     * @param idea
     */
    public void cambiarEstado(@Param("estado")String estado,@Param("idea")Idea idea);

    public void registrarPalabraClave(@Param("palabra") PalabraClave palabraClave);

    public Idea consultarIdea2(@Param("idea")String idea);

    public List<PalabraClave> consultarpalabe();

    public List<Idea> consultarIdeaArea(@Param("area") String area );

    public List<Idea> consultarTodo();

    public List<Area> consultarArea();

    public List<Idea> consultarIdeasM(@Param("idea") String idea);
    public void registrarRelacion(@Param("nombreIdea1")String idea1,@Param("nombreIdea1")String idea2);
    public List<Idea> consultarRelacion(@Param("idea") String idea);
}