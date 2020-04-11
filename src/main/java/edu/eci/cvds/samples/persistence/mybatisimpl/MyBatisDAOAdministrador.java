package edu.eci.cvds.samples.persistence.mybatisimpl;

import edu.eci.cvds.samples.entities.Administrador;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.persistence.DAOAdministrador;
import com.google.inject.Inject;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.AdministradorMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MyBatisDAOAdministrador implements DAOAdministrador {
    @Inject
    private AdministradorMapper pmap=null;

    public Administrador consultarInfoAdmin(String usuario) {

        return pmap.consultarInfoAdmin(usuario);
    }

    public List<Usuario> consultarUsuarios(String usuario) {
        return  pmap.consultarUsuarios(usuario);
    }
}
