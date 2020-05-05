package edu.eci.cvds.samples.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.*;
import edu.eci.cvds.samples.persistence.*;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
import java.util.List;

/**
 * Clase ServicioBancodeProyectosimpl de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public class ServicioBancodeProyectosimpl implements ServicioBancodeProyectos {


    @Inject
    private DAOIdea daoIdea;



    public void registrarIDea(Idea idea){      daoIdea.registrarIDea(idea);      }

    public List<Idea>  consultarIDea(String idea){
        return daoIdea.consultarIDea(idea);
    }

    public void cambiarEstado(String estado, Idea idea) {daoIdea.cambiarEstado(estado,idea); }

    @Override
    public void registrarPalabraClave(PalabraClave palabraClave) {
        daoIdea.registrarPalabraClave(palabraClave);
    }

    @Override
    public Idea consultarIdea(String idea) {
        return daoIdea.consultarIdea(idea);
    }

    @Override
    public List<Idea> consultarTodo() {
        return daoIdea.consultarTodo();
    }

    @Override
    public List<Idea> consultarVoto(String login) {
        return daoIdea.consultarVoto(login);
    }

    @Override
    public List<Idea> consultarIdeaArea(String area) {
        return daoIdea.consultarIdeaArea(area);
    }

    @Override
    public List<Area> consultarArea() {
        return daoIdea.consultarArea();
    }

    @Override
    public List<Idea> consultarIdeaM(String idea) {
        return daoIdea.consultarIdeaM(idea);
    }

    @Override
    public void registrarRelacion(String idea1, String idea2) {
        daoIdea.registrarRelacion(idea1,idea2);
    }

    @Override
    public List<Idea> consultarRelacion(String idea) {
        return daoIdea.consultarRelacion(idea);
    }

    @Override
    public List<Idea> consultarIdeasProponente(String proponente) {
        return  daoIdea.consultarIdeasProponente(proponente);
    }

    @Override
    public List<Idea> consultarIdeaEnEspera(String login) {
        return daoIdea.consultarIdeaEnEspera(login);
    }

    @Override
    public List<PalabraClave> consultarPalabrasClave(String idea) {
        return daoIdea.consultarPalabrasClave(idea);
    }

    @Override
    public void actualizarIdea(Idea idea) {
        daoIdea.actualizarIdea(idea);
    }

}