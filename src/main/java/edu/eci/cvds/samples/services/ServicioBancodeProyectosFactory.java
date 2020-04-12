package edu.eci.cvds.samples.services;
import edu.eci.cvds.samples.beans.LoginBean;
import edu.eci.cvds.samples.persistence.DAOAdministrador;
import edu.eci.cvds.samples.persistence.DAOPersonalPMO;
import edu.eci.cvds.samples.persistence.DAOProponente;
import edu.eci.cvds.samples.persistence.DAOUsuario;
import edu.eci.cvds.samples.persistence.mybatisimpl.MyBatisDAOAdministrador;
import edu.eci.cvds.samples.persistence.mybatisimpl.MyBatisDAOPersonalPMO;
import edu.eci.cvds.samples.persistence.mybatisimpl.MyBatisDAOProponente;
import edu.eci.cvds.samples.persistence.mybatisimpl.MyBatisDAOUsuario;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;
import edu.eci.cvds.samples.services.impl.ServicioBancodeProyectosimpl;

import java.sql.SQLException;
import java.text.ParseException;

public class ServicioBancodeProyectosFactory {
    private static ServicioBancodeProyectosFactory instance = new ServicioBancodeProyectosFactory();

    private static Injector injector;
    private static Injector testingInjector;
    private  ServicioBancodeProyectosFactory() {
        injector = createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                install(JdbcHelper.PostgreSQL);
                setClassPathResource("mybatis-config.xml");
                bind(ServicioBancodeProyectos.class).to(ServicioBancodeProyectosimpl.class);

                bind(DAOAdministrador.class).to(MyBatisDAOAdministrador.class);
                bind(DAOPersonalPMO.class).to(MyBatisDAOPersonalPMO.class);
                bind(DAOUsuario.class).to(MyBatisDAOUsuario.class);
                bind(DAOProponente.class).to(MyBatisDAOProponente.class);
            }
        });
        testingInjector = createInjector(new XMLMyBatisModule() {

            @Override
            protected void initialize() {
                install(JdbcHelper.MySQL);
                setClassPathResource("mybatis-config-h2.xml");
                bind(ServicioBancodeProyectos.class).to(ServicioBancodeProyectosimpl.class);
                bind(DAOAdministrador.class).to(MyBatisDAOAdministrador.class);
                bind(DAOPersonalPMO.class).to(MyBatisDAOPersonalPMO.class);
                bind(DAOUsuario.class).to(MyBatisDAOUsuario.class);
                bind(DAOProponente.class).to(MyBatisDAOProponente.class);
            }
        });
    }
        public ServicioBancodeProyectos getServicioBancodeProyectos()
        {
            return injector.getInstance(ServicioBancodeProyectos.class);
        }

        public ServicioBancodeProyectos getServicioBancodeProyectosTesting()
        {
            return testingInjector.getInstance(ServicioBancodeProyectos.class);
        }

        public static ServicioBancodeProyectosFactory getInstance()
        {
            return instance;
        }
    public static void main(String args[]) throws SQLException, ParseException {
        System.out.println(ServicioBancodeProyectosFactory.getInstance().getServicioBancodeProyectos().consultarInfoAdmin("ma"));
    }
}
