package edu.eci.cvds.samples.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Voto;
import edu.eci.cvds.samples.persistence.DAOVoto;
import edu.eci.cvds.samples.services.ServicioVoto;

import java.util.List;

public class ServicioVotoImpl implements ServicioVoto {
    @Inject
    private DAOVoto daoVoto;

    @Override
    public List<Voto> consultarVoto(String idea) {
        return daoVoto.consultarVotos(idea);
    }

    @Override
    public void remover(String login, String nombreIdea) {
        daoVoto.remover(login,nombreIdea);
    }

    @Override
    public void insertar(String login, String nombreIdea) {
        daoVoto.insertar(login,nombreIdea);
    }

    @Override
    public Voto consultarVoto(String idea, String login) {
        daoVoto.consultarVoto(idea,login);
        return null;
    }
}
