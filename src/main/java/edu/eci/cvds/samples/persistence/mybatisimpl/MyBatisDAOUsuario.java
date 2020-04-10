package edu.eci.cvds.samples.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.persistence.DAOUsuario;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.UsuarioMapper;

public class MyBatisDAOUsuario implements DAOUsuario {
    @Inject
    private UsuarioMapper pmap=null;

    public Usuario consultarInfo(String usuario) {
        return pmap.consultarInfo(usuario);
    }
}
