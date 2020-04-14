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
}