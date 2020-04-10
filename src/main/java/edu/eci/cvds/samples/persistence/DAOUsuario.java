package edu.eci.cvds.samples.persistence;

import edu.eci.cvds.samples.entities.Usuario;

public interface DAOUsuario {
    public Usuario consultarInfo(String usuario);
}
