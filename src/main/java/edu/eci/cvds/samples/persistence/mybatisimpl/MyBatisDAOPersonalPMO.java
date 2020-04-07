package edu.eci.cvds.samples.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.PersonalPMO;
import edu.eci.cvds.samples.persistence.DAOPersonalPMO;

import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.PersonalPMOMapper;

public class MyBatisDAOPersonalPMO implements DAOPersonalPMO {
    @Inject
    private PersonalPMOMapper pmap=null;

    public PersonalPMO consultarInfo() {
        return pmap.consultarInfo();
    }
}
