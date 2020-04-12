package edu.eci.cvds.samples.persistence;

import edu.eci.cvds.samples.entities.Usuario;

import java.util.List;

public interface DAOUsuario {
    public Usuario consultarInfo(String usuario);
    public List<Usuario> consultarUsuarios(String pClave);
    public void registrarUsuario(Usuario usuario);
}
