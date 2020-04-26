package edu.eci.cvds.samples.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Comentario;
import edu.eci.cvds.samples.persistence.DAOComentario;
import edu.eci.cvds.samples.services.ServicioComentario;

import java.util.List;

public class ServicioComentarioImpl implements ServicioComentario {

    @Inject
    private DAOComentario daoComentario;

    @Override
    public List<Comentario> consultarComentarios(String nIdea) {
        return daoComentario.consultarComentarios(nIdea);
    }

    @Override
    public void registrarComentario(Comentario comentario) {
        daoComentario.registrarComentario(comentario);
    }
}
