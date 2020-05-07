package edu.eci.cvds.samples.Segurity;



import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;


public class Shiro  implements LoginSegurity{

    @Override
    public void login(String usuario, String password, Boolean record) {
            Subject  subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(usuario, password, record);
            subject.getSession().setAttribute("usuario", usuario);
            subject.login(token);

    }

    @Override
    public boolean isLogged() {
       return SecurityUtils.getSubject().isAuthenticated();
    }

    @Override
    public boolean proponente() {

        return SecurityUtils.getSubject().hasRole("Proponente");
    }

    @Override
    public boolean administrador() {
        return SecurityUtils.getSubject().hasRole("Administrador");
    }

    @Override
    public boolean usuario() {
        return SecurityUtils.getSubject().hasRole("Usuario");
    }

    @Override
    public boolean pmo() {
        return SecurityUtils.getSubject().hasRole("PerosnalPMO");
    }

    @Override
    public void salir() {
        SecurityUtils.getSubject().logout();
    }
}
