package edu.eci.cvds.samples.beans;

import com.google.inject.Inject;
import edu.eci.cvds.samples.MyBatisExample;
import edu.eci.cvds.samples.entities.Administrador;
import edu.eci.cvds.samples.entities.PersonalPMO;
import edu.eci.cvds.samples.entities.Proponente;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.AdministradorMapper;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.PersonalPMOMapper;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.ProponenteMapper;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.UsuarioMapper;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
import edu.eci.cvds.samples.services.ServicioBancodeProyectosFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "loginbean")
@SessionScoped

public class LoginBean  extends BaseBean{

    @Inject
    private ServicioBancodeProyectos servicio;

    private List<Usuario> ususarios=new ArrayList<Usuario>();
    private List<Usuario> usuariosseleccionados=new ArrayList<Usuario>();
    private String usuario;
    private String password;
    private String role;
    private String val="login.xhtml";


    public void buscar(){
        ususarios.add(new Usuario("a","b","c","d","e"));

    }
    public void datos(String usuario, String password) throws IOException {

        System.out.println(usuario);
        System.out.println(password);
        System.out.println(role);
        Administrador admin = servicio.consultarInfoAdmin("ma");
        if (role.equals("Administrador")) {comproAd(usuario,password);}
        else if(role.equals("PersonalPMO")){comproPerso(usuario,password);}
        else if(role.equals("Proponente")){comproPropo(usuario,password);}
        else if(role.equals("Usuario")){comproUsu(usuario,password);}
        FacesContext.getCurrentInstance().getExternalContext().redirect(val);
    }

    public void comproAd(String usuario,String password){
        Administrador admin = servicio.consultarInfoAdmin("ma");
        System.out.println(admin.toString());
        if(admin.getPasword().equals(password)){
            val = "administrador.xhtml";
        }
    }
    public void comproPropo(String usuario,String password){
        Proponente proponente= servicio.consultarinfoPro(usuario);
        System.out.println(proponente.toString());
        if(proponente.getPassword().equals(password)){
            val = "proponente.xhtml";
        }
    }
    public void comproUsu(String usuario,String password){
        Usuario user= servicio.consultarinfoUsuario(usuario);
        if(user.getPassword().equals(password)){
            val = "usuario.xhtml";
        }
    }

    public void comproPerso(String usuario,String password){
        PersonalPMO personalPMO=servicio.consultarinfo(usuario);
        if(personalPMO.getPasword().equals(password)){
            val = "personal.xhtml";
        }
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
