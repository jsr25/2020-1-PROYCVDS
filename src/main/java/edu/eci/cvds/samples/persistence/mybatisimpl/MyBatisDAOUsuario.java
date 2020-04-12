package edu.eci.cvds.samples.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.persistence.DAOUsuario;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.UsuarioMapper;

import java.util.List;

public class MyBatisDAOUsuario implements DAOUsuario {
    @Inject
    private UsuarioMapper pmap=null;

    public Usuario consultarInfo(String usuario) {
        return pmap.consultarInfo(usuario);
    }

    public List<Usuario> consultarUsuarios(String pClave) {
        return pmap.consultarUsuarios(pClave);
    }

    public void registrarUsuario(Usuario usuario) {
        pmap.registrarUsuario(usuario);
    }

}
