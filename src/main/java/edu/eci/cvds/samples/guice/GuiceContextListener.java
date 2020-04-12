package edu.eci.cvds.samples.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import edu.eci.cvds.samples.persistence.DAOAdministrador;
import edu.eci.cvds.samples.persistence.DAOPersonalPMO;
import edu.eci.cvds.samples.persistence.DAOProponente;
import edu.eci.cvds.samples.persistence.DAOUsuario;
import edu.eci.cvds.samples.persistence.mybatisimpl.MyBatisDAOAdministrador;
import edu.eci.cvds.samples.persistence.mybatisimpl.MyBatisDAOPersonalPMO;
import edu.eci.cvds.samples.persistence.mybatisimpl.MyBatisDAOProponente;
import edu.eci.cvds.samples.persistence.mybatisimpl.MyBatisDAOUsuario;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
import edu.eci.cvds.samples.services.impl.ServicioBancodeProyectosimpl;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class GuiceContextListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.removeAttribute(Injector.class.getName());
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Injector injector = Guice.createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                install(JdbcHelper.PostgreSQL);
                setEnvironmentId("development");
                setClassPathResource("mybatis-config.xml");

                // TODO Add service class associated to Stub implementation
                bind(DAOAdministrador.class).to(MyBatisDAOAdministrador.class);
                bind(DAOPersonalPMO.class).to(MyBatisDAOPersonalPMO.class);
                bind(DAOUsuario.class).to(MyBatisDAOUsuario.class);
                bind(DAOProponente.class).to(MyBatisDAOProponente.class);
                //
                bind(ServicioBancodeProyectos.class).to(ServicioBancodeProyectosimpl.class);
            }
        });

        servletContextEvent.getServletContext().setAttribute(Injector.class.getName(), injector);
    }
}