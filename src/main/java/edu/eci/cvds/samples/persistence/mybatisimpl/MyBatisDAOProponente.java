package edu.eci.cvds.samples.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Proponente;
import edu.eci.cvds.samples.persistence.DAOProponente;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.ProponenteMapper;

public class MyBatisDAOProponente implements DAOProponente {
    @Inject
    private ProponenteMapper pmap=null;
    public Proponente consultarInfo(String usuario) {
        return pmap.consultarInfo(usuario);
    }
}
