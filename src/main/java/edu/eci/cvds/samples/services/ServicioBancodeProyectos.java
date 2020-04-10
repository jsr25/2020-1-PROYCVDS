package edu.eci.cvds.samples.services;

import edu.eci.cvds.samples.entities.Administrador;
import edu.eci.cvds.samples.entities.PersonalPMO;

public interface ServicioBancodeProyectos {

    public Administrador consultarInfoAdmin();
    public Administrador consultarInfoAdmin(String usuario);

    public PersonalPMO consultarinfo();
}
