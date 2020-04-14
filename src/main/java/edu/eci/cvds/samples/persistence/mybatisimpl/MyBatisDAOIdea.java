package edu.eci.cvds.samples.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.persistence.DAOIdea;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.IdeaMapper;

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
     * Método que consulta informacion de la idea.
     * @param idea Argumentos del programa.
     * @return idea Retorno del programa.
     */
    public Idea consultarIDea(String idea) {
        return pmap.consultarIdea(idea);
    }


}
