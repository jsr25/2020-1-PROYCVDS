package edu.eci.cvds.samples.services;

import edu.eci.cvds.samples.entities.Comentario;

import java.util.List;

public interface ServicioComentario {

    /**
     * Servicio que provee la informacion
     * de los comentarios de una idea
     * dado el nobre de al misma
     * @param nIdea
     * @return coleccion de comentarios
     */
    public List<Comentario> consultarComentarios(String nIdea);

    /**
     * Servicio que registra un comentario
     * dada la informacion del mismo
     * @param comentario
     */
    public void registrarComentario(Comentario comentario);

}
