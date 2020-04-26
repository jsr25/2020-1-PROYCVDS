package edu.eci.cvds.samples.persistence;

import edu.eci.cvds.samples.entities.Comentario;

import java.util.List;

public interface DAOComentario {

    /**
     * Consultar los comentarios de una idea
     * dado su nombre
     * @param nIdea
     * @return coleccion de Comentarios
     */
    public List<Comentario> consultarComentarios(String nIdea);

    /**
     * Registrar un nuevo comentario
     * dadd toda la informacion del mismo
     * @param comentario
     */
    public void registrarComentario(Comentario comentario);
}
