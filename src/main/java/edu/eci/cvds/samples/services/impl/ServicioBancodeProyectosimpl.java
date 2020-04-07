package edu.eci.cvds.samples.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Administrador;
import edu.eci.cvds.samples.persistence.DAOAdministrador;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;

public class ServicioBancodeProyectosimpl implements ServicioBancodeProyectos {
    @Inject
    private DAOAdministrador adminDAO;

    public Administrador consultarInfo() {

        Administrador admin= adminDAO.consultarInfo();
        return admin;
    }
}
