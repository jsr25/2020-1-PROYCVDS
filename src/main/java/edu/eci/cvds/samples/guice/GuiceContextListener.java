package edu.eci.cvds.samples.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import edu.eci.cvds.samples.persistence.*;
import edu.eci.cvds.samples.persistence.mybatisimpl.*;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
import edu.eci.cvds.samples.services.ServicioComentario;
import edu.eci.cvds.samples.services.ServicioUsuario;
import edu.eci.cvds.samples.services.impl.ServicioBancodeProyectosimpl;
import edu.eci.cvds.samples.services.impl.ServicioComentarioImpl;
import edu.eci.cvds.samples.services.impl.ServicioUsuarioimpl;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Clase GuiceContextListener de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public class GuiceContextListener implements ServletContextListener {

    /**
     * Método del guice.
     * @param servletContextEvent Argumentos del programa.
     */
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.removeAttribute(Injector.class.getName());
    }

    /**
     * Método del guice.
     * @param servletContextEvent Argumentos del programa.
     */
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Injector injector = Guice.createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                install(JdbcHelper.PostgreSQL);
                setEnvironmentId("development");
                setClassPathResource("mybatis-config.xml");

                // TODO Add service class associated to Stub implementation
                bind(DAOUsuario.class).to(MyBatisDAOUsuario.class);
                bind(DAOIdea.class).to(MyBatisDAOIdea.class);
                bind(DAOVoto.class).to(MyBatisDAOVoto.class);
                bind(DAOComentario.class).to(MyBatisDAOComentario.class);

                //
                bind(ServicioBancodeProyectos.class).to(ServicioBancodeProyectosimpl.class);
                bind(ServicioUsuario.class).to(ServicioUsuarioimpl.class);
                bind(ServicioComentario.class).to(ServicioComentarioImpl.class);
            }
        });
        servletContextEvent.getServletContext().setAttribute(Injector.class.getName(), injector);
    }
}