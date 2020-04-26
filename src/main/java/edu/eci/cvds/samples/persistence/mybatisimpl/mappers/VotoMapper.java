package edu.eci.cvds.samples.persistence.mybatisimpl.mappers;

import edu.eci.cvds.samples.entities.Voto;
import org.apache.ibatis.annotations.Param;

/**
 * Clase IdeaMapper de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public interface VotoMapper {
    public void borrarVoto(@Param("login") String login, @Param("idea")String nombreIdea);
    public Voto consultarVotos();
}



