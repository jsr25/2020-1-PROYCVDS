package edu.eci.cvds.samples.persistence.mybatisimpl;

import com.google.inject.Inject;
import com.google.inject.internal.cglib.core.$ReflectUtils;
import edu.eci.cvds.samples.entities.Area;
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
     * @param idea
     */
    public void registrarIDea(Idea idea) {
        pmap.registrarIdea(idea);
        List<PalabraClave> palabraClaves=idea.getPalabraClaves();
        for(int i=0;i<palabraClaves.size();i++){
            pmap.registrarPalabraClave(palabraClaves.get(i));
        }
    }

    /**
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
    public List<Idea> consultarVoto(String login) {
        return pmap.consultarVoto(login);
    }

    @Override
    public void registrarPalabraClave(PalabraClave palabraClave) {
        pmap.registrarPalabraClave(palabraClave);
    }

    @Override
    public List<Idea> consultarIdeaArea(String area) {
        return pmap.consultarIdeaArea(area);

    }

    @Override
    public List<Idea> consultarTodo() {
        return pmap.consultarTodo();
    }

    @Override
    public List<Area> consultarArea() {
        return pmap.consultarArea();
    }

    @Override
    public List<Idea> consultarIdeaM(String idea) {
        return pmap.consultarIdeasM(idea);
    }

    @Override
    public void registrarRelacion(String idea1, String idea2) {
        pmap.registrarRelacion(idea1,idea2);
    }

    @Override
    public List<Idea> consultarRelacion(String idea) {
        return pmap.consultarRelacion(idea);
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
