package edu.eci.cvds.samples.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Comentario;
import edu.eci.cvds.samples.persistence.DAOComentario;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.ComentarioMapper;

import java.util.List;

public class MyBatisDAOComentario implements DAOComentario {
    @Inject
    private ComentarioMapper pmap = null;

    @Override
    public List<Comentario> consultarComentarios(String nIdea) {
        return pmap.consultarComentarios(nIdea);
    }

    @Override
    public void registrarComentario(Comentario comentario) {
        pmap.registrarComentario(comentario);
    }
}
