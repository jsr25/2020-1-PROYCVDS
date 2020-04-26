package edu.eci.cvds.samples.persistence.mybatisimpl;

import edu.eci.cvds.samples.persistence.DAOVoto;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.IdeaMapper;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.VotoMapper;

import javax.inject.Inject;

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
}
