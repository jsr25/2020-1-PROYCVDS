package edu.eci.cvds.samples.persistence;

import edu.eci.cvds.samples.entities.Area;
import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.entities.PalabraClave;
import org.apache.ibatis.annotations.Param;

import javax.persistence.Id;
import java.util.List;

/**
 * Clase DAOIdea de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */

public interface DAOIdea {   /**
     * Método que consulta la idea que fue registrada.
     * @param idea Argumentos del programa.
     */
    public List<Idea> consultarIDea(String idea);

    public void registrarIDea(Idea idea);

    public void cambiarEstado(String estado,Idea idea);

    public Idea consultarIdea(String idea);

    public void registrarPalabraClave(PalabraClave palabraClave);

    public List<Idea> consultarIdeaArea(String area);

    public List<Idea> consultarTodo();

    public List<Area> consultarArea();

    public List<Idea> consultarIdeaM(String idea);

    public void registrarRelacion(String idea1,String idea2);

    public List<Idea> consultarRelacion(String idea);
}