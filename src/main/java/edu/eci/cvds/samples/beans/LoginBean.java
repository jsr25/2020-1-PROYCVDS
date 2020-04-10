package edu.eci.cvds.samples.beans;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Administrador;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
import edu.eci.cvds.samples.services.ServicioBancodeProyectosFactory;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServlet;

@ManagedBean(name = "loginbean")
@SessionScoped

public class LoginBean extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Inject
    private ServicioBancodeProyectos servicio;
    private String usuario;
    private String password;
    private String role;
    private String val="faces/login.xhtml";

    public String datos(String usuario, String password) {
        System.out.println(usuario);
        System.out.println(password);
        Administrador admin =ServicioBancodeProyectosFactory.getInstance().getServicioBancodeProyectos().consultarInfoAdmin(usuario);



                //if (role.equals("Adiministrador")){
        System.out.println(admin.toString());
           // if(admin.getPasword().equals(password)){
        val="faces/index.xhtml";
            //}
        //}
        return val;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
