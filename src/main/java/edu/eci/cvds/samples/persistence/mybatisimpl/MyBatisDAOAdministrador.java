package edu.eci.cvds.samples.persistence.mybatisimpl;

import edu.eci.cvds.samples.persistence.DAOAdministrador;
import com.google.inject.Inject;
public class MyBatisDAOAdministrador implements DAOAdministrador {
    @Inject
    private ComentariosMapper pmap=null;
}
