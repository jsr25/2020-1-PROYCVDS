package edu.eci.cvds.samples.services;

import edu.eci.cvds.samples.entities.*;

import java.util.List;

/**
 * Clase ServicioBancodeProyectos de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public interface ServicioBancodeProyectos {


    /**
     *
     * @param idea
     */
    public void registrarIDea(Idea idea);

    /**
     *
     * @param idea
     * @return
     */
    public List<Idea>  consultarIDea(String idea);

    /**
     *
     * @param estado
     * @param idea
     */
    public void cambiarEstado(String estado,Idea idea);
}