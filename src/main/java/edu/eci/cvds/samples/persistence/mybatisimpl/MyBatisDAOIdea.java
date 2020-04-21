package edu.eci.cvds.samples.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.entities.PalabraClave;
import edu.eci.cvds.samples.persistence.DAOIdea;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.IdeaMapper;

import java.util.List;

/**
 * Clase MyBatisDAOIdea de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public class MyBatisDAOIdea implements DAOIdea {
    @Inject
    private IdeaMapper pmap = null;


    /**
     *
     * @param idea
     */
    public void registrarIDea(Idea idea) {
        pmap.registrarIdea(idea);
    }

    /**
     *
     * @param estado
     * @param idea
     */
    public void cambiarEstado(String estado, Idea idea) {
        pmap.cambiarEstado(estado,idea);
    }

    @Override
    public Idea consultarIdea(String idea) {
        return pmap.consultarIdea2(idea);
    }

    @Override
    public void registrarPalabraClave(PalabraClave palabraClave) {
        pmap.registrarPalabraClave(palabraClave);
    }

    /**
     * Método que consulta informacion de la idea.
     * @param idea Argumentos del programa.
     * @return idea Retorno del programa.
     */
    public List<Idea> consultarIDea(String idea) {
        return pmap.consultarIdea(idea);
    }


}
