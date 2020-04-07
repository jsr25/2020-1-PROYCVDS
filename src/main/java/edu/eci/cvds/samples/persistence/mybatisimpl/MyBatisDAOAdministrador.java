package edu.eci.cvds.samples.persistence.mybatisimpl;

import edu.eci.cvds.samples.entities.Administrador;
import edu.eci.cvds.samples.persistence.DAOAdministrador;
import com.google.inject.Inject;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.AdministradorMapper;
import org.apache.ibatis.session.SqlSession;
public class MyBatisDAOAdministrador implements DAOAdministrador {
    @Inject
    private AdministradorMapper pmap=null;

    public Administrador consultarInfo() {
        return pmap.consultarInfo();
    }
}
