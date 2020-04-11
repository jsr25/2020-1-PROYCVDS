package edu.eci.cvds.samples.services.impl;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Administrador;
import edu.eci.cvds.samples.entities.PersonalPMO;
import edu.eci.cvds.samples.entities.Proponente;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.persistence.DAOAdministrador;
import edu.eci.cvds.samples.persistence.DAOPersonalPMO;
import edu.eci.cvds.samples.persistence.DAOProponente;
import edu.eci.cvds.samples.persistence.DAOUsuario;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;

import java.util.List;

public class ServicioBancodeProyectosimpl implements ServicioBancodeProyectos {
    @Inject
    private DAOAdministrador adminDAO;
    @Inject
    private DAOPersonalPMO persDao;
    @Inject
    private DAOProponente propoDao;
    @Inject
    private DAOUsuario usDao;

    public Administrador consultarInfoAdmin(String usuario) {
        Administrador admin= adminDAO.consultarInfoAdmin(usuario);
        return admin;
    }


    public PersonalPMO consultarinfo(String usuario) {
        return persDao.consultarInfo(usuario);
    }
    public Proponente consultarinfoPro(String usuario){
        return propoDao.consultarInfo(usuario);
    }
    public Usuario consultarinfoUsuario(String usuario){
        return usDao.consultarInfo(usuario);
    }

    public List<Usuario> consultarUsuarios(String usuario) {
        return adminDAO.consultarUsuarios(usuario);
    }
}
