package edu.eci.cvds.samples.services;

import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.persistence.PersistenceException;

import java.util.Date;
import java.util.List;

public interface ServicioUsuario {

    public Usuario consultarUsuario(String usuario) throws BancoDeProyectosException, PersistenceException;
    public void registrarUsuario(Usuario usuario) throws BancoDeProyectosException, PersistenceException;
    public List<Usuario> consultarUsuarios(String usuario) throws BancoDeProyectosException, PersistenceException;
    public void carbiarRole(String estado, Usuario usuario) throws BancoDeProyectosException, PersistenceException;
    public void registrarIDea(Idea idea) throws BancoDeProyectosException, PersistenceException;
}
