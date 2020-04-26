package edu.eci.cvds.samples.persistence.mybatisimpl.mappers;

import edu.eci.cvds.samples.entities.Comentario;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ComentarioMapper {

    /**
     * Consutar loas comentarios que tiene una idea
     * dado su nombre
     * @param nIdea
     * @return coleccion de comentarios
     */
    public List<Comentario> consultarComentarios(@Param("nIdea") String nIdea);

    /**
     * Registrar un nuevo comentario
     * dada la inforacion del comentario
     * @param comentario
     */
    public void registrarComentario(@Param("comentario") Comentario comentario);



}
