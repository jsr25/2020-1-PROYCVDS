package edu.eci.cvds.samples.persistence.mybatisimpl.mappers;

import edu.eci.cvds.samples.entities.Voto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Clase IdeaMapper de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public interface VotoMapper {
    public void insertar(@Param("login") String login, @Param("idea")String nombreIdea);
    public void remover(@Param("login") String login, @Param("idea")String nombreIdea);
    public List<Voto> consultarVotos(@Param("idea") String idea);
}



