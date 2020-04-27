package edu.eci.cvds.samples.persistence.mybatisimpl;

import edu.eci.cvds.samples.entities.Voto;
import edu.eci.cvds.samples.persistence.DAOVoto;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.IdeaMapper;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.VotoMapper;

import javax.inject.Inject;
import java.util.List;

/**
 * Clase IdeaMapper de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public class MyBatisDAOVoto implements DAOVoto {
    @Inject
    private VotoMapper pmap = null;

    @Override
    public void borrarVoto(String login, String nombreIdea) {
        pmap.borrarVoto(login, nombreIdea);
    }

    @Override
    public List<Voto> consultarVotos(String idea) {
        return pmap.consultarVotos(idea);
    }
}
