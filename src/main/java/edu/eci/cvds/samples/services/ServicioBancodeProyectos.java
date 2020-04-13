package edu.eci.cvds.samples.services;

import edu.eci.cvds.samples.entities.Administrador;
import edu.eci.cvds.samples.entities.PersonalPMO;
import edu.eci.cvds.samples.entities.Proponente;
import edu.eci.cvds.samples.entities.Usuario;
import java.util.List;

/**
 * Clase ServicioBancodeProyectos de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public interface ServicioBancodeProyectos {

    /**
     * Método que consulta informacion del administrador.
     * @param usuario Argumentos del programa.
     */
    public Administrador consultarInfoAdmin(String usuario);

    /**
     * Método que consulta informacion del personal.
     * @param usuario Argumentos del programa.
     */
    public PersonalPMO consultarinfo(String usuario);

    /**
     * Método que consulta informacion del proponente.
     * @param usuario Argumentos del programa.
     */
    public Proponente consultarinfoPro(String usuario);

    /**
     * Método que consulta informacion del usuario.
     * @param usuario Argumentos del programa.
     */
    public Usuario consultarinfoUsuario(String usuario);

    /**
     * Método que guarda el usuario.
     * @param pClave Argumentos del programa.
     */
    public List<Usuario> consultarUsuarios(String pClave);

    /**
     * Método que regisra el usuario
     * @param usuario Argumentos del programa.
     */
    public void registarUsuario(Usuario usuario);

    /**
     *
     * @param usuario
     */
    public void deleteUsuario(String usuario);

    /**
     *
     * @param proponente
     */
    public void registrarProponente(Proponente proponente);

    /**
     *
     * @param personalPMO
     */
    public void registrarPersonalPMO(PersonalPMO personalPMO);

    public void registrarAdministrador(Administrador administrador);
}