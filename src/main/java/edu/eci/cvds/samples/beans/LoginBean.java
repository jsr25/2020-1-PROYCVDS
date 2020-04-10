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

@ManagedBean(name = "loginbean")
@SessionScoped

public class LoginBean implements Serializable {

    @Inject
    private ServicioBancodeProyectos servicio;

    private String usuario;
    private String password;
    private String role;
    private String val="login.xhtml";



    public void datos(String usuario, String password) throws IOException {
        System.out.println(usuario);
        System.out.println(password);
        System.out.println(role);

        if (role.equals("Administrador")) {comproAd(usuario,password);}
        else if(role.equals("PersonalPMO")){comproPerso(usuario,password);}
        else if(role.equals("Proponente")){comproPropo(usuario,password);}
        else if(role.equals("Usuario")){comproUsu(usuario,password);}
        FacesContext.getCurrentInstance().getExternalContext().redirect(val);
    }

    public void comproAd(String usuario,String password){
        SqlSessionFactory sessionfact =MyBatisExample.getSqlSessionFactory();
        SqlSession sqlss = sessionfact.openSession();
        Administrador admin;
        AdministradorMapper u = sqlss.getMapper(AdministradorMapper.class);
        admin = u.consultarInfoAdmin(usuario);
        System.out.println(admin.toString());
        sqlss.commit();
        sqlss.close();
        if(admin.getPasword().equals(password)){
            val = "administrador.xhtml";
        }
    }
    public void comproPropo(String usuario,String password){
        SqlSessionFactory sessionfact =MyBatisExample.getSqlSessionFactory();
        SqlSession sqlss = sessionfact.openSession();
        Proponente proponente;
        ProponenteMapper u = sqlss.getMapper(ProponenteMapper.class);
        proponente = u.consultarInfo(usuario);
        System.out.println(proponente.toString());
        sqlss.commit();
        sqlss.close();
        if(proponente.getPassword().equals(password)){
            val = "proponente.xhtml";
        }
    }
    public void comproUsu(String usuario,String password){
        SqlSessionFactory sessionfact =MyBatisExample.getSqlSessionFactory();
        SqlSession sqlss = sessionfact.openSession();
        Usuario user;
        UsuarioMapper u = sqlss.getMapper(UsuarioMapper.class);
        user = u.consultarInfo(usuario);
        System.out.println(user.toString());
        sqlss.commit();
        sqlss.close();
        if(user.getPassword().equals(password)){
            val = "usuario.xhtml";
        }
    }

    public void comproPerso(String usuario,String password){
        SqlSessionFactory sessionfact =MyBatisExample.getSqlSessionFactory();
        SqlSession sqlss = sessionfact.openSession();
        PersonalPMO personalPMO;
        PersonalPMOMapper u = sqlss.getMapper(PersonalPMOMapper.class);
        personalPMO = u.consultarInfo(usuario);
        System.out.println(personalPMO.toString());
        sqlss.commit();
        sqlss.close();
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
