package edu.eci.cvds.samples.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.PersonalPMO;
import edu.eci.cvds.samples.persistence.DAOPersonalPMO;

import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.PersonalPMOMapper;
import org.apache.ibatis.annotations.Param;

public class MyBatisDAOPersonalPMO implements DAOPersonalPMO {
    @Inject
    private PersonalPMOMapper pmap=null;

    public PersonalPMO consultarInfo(String usuario) {
        return pmap.consultarInfo(usuario);
    }
}
