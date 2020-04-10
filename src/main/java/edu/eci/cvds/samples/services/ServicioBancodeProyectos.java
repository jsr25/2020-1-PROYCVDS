package edu.eci.cvds.samples.services;

import edu.eci.cvds.samples.entities.Administrador;
import edu.eci.cvds.samples.entities.PersonalPMO;
import edu.eci.cvds.samples.entities.Proponente;
import edu.eci.cvds.samples.entities.Usuario;

public interface ServicioBancodeProyectos {


    public Administrador consultarInfoAdmin(String usuario);

    public PersonalPMO consultarinfo(String usuario);
    public Proponente consultarinfoPro(String usuario);
    public Usuario consultarinfoUsuario(String usuario);
}
