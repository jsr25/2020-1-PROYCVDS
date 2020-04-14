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
    private DAOAdministrador adminDAO;
    @Inject
    private DAOPersonalPMO persDao;
    @Inject
    private DAOProponente propoDao;
    @Inject
    private DAOUsuario usDao;
    @Inject
    private DAOIdea daoIdea;

    /**
     * Método que consulta informacion del administrador.
     * @param usuario Argumentos del programa.
     * @return admin retorno del programa.
     */
    public Administrador consultarInfoAdmin(String usuario) {
        Administrador admin= adminDAO.consultarInfoAdmin(usuario);
        return admin;
    }

    /**
     * Método que consulta informacion del usuario.
     * @param usuario Argumentos del programa.
     * @return usuario retorno del programa.
     */
    public PersonalPMO consultarinfo(String usuario) {
        return persDao.consultarInfo(usuario);
    }

    /**
     * Método que consulta informacion del proponente.
     * @param usuario Argumentos del programa.
     * @return usuario retorno del programa.
     */
    public Proponente consultarinfoPro(String usuario){
        return propoDao.consultarInfo(usuario);
    }

    /**
     * Método que consulta informacion del administrador.
     * @param usuario Argumentos del programa.
     * @return usuario retorno del programa.
     */
    public Usuario consultarinfoUsuario(String usuario){
        return usDao.consultarInfo(usuario);
    }

    /**
     * Método que guarda informacion del usuario.
     * @param pClave Argumentos del programa.
     * @return pClave retorno del programa.
     */
    public List<Usuario> consultarUsuarios(String pClave) {
        return usDao.consultarUsuarios(pClave);
    }

    /**
     * Método que registrar informacion del usuario.
     * @param usuario Argumentos del programa.
     * @return admin retorno del programa.
     */
    public void registarUsuario(Usuario usuario) {
        usDao.registrarUsuario(usuario);
    }

    public void deleteUsuario(String usuario) {
        usDao.deleteUsuario(usuario);
    }

    public void registrarProponente(Proponente proponente) {
        propoDao.registrarProponente(proponente);
    }

    public void registrarPersonalPMO(PersonalPMO personalPMO) {
        persDao.registrarPersonalPMO(personalPMO);
    }

    public void registrarAdministrador(Administrador administrador) {
        adminDAO.registrarAdministrador(administrador);
    }

    public void registrarIDea(Idea idea){      daoIdea.registrarIDea(idea);      }

    public List<Idea>  consultarIDea(String idea){
        return daoIdea.consultarIDea(idea);
    }

    public void cambiarEstado(String estado, Idea idea) {daoIdea.cambiarEstado(estado,idea); }
}