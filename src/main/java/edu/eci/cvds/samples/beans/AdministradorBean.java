package edu.eci.cvds.samples.beans;


import com.google.inject.Inject;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.IOException;


@ManagedBean(name = "adminbean")
@SessionScoped
public class AdministradorBean extends BaseBean{
    @Inject
    private ServicioBancodeProyectos servicio;

    public void asignarRole() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect("buscar.xhtml");
    }
}
