package edu.eci.cvds.samples.services;
import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;
public class ServicioBancodeProyectosFactory {
    private static ServicioBancodeProyectosFactory instance = new ServicioBancodeProyectosFactory();

    private static Injector injector;
    private static Injector testingInjector;
    private ServicioBancodeProyectosFactory() {
        injector = createInjector(new XMLMyBatisModule() {
            @Override
            protected void initialize() {
                install(JdbcHelper.MySQL);
                setClassPathResource("mybatis-config.xml");
            }
        }
        );
        testingInjector = createInjector(new XMLMyBatisModule() {

            @Override
            protected void initialize() {
                install(JdbcHelper.MySQL);
                setClassPathResource("h2-mybatis-config.xml");
            }
        }
        );
        public ServicioBancodeProyectos getServicioBancodeProyectos(){
            return injector.getInstance(ServicioBancodeProyectos.class);
        }

        public ServicioBancodeProyectos getServicioBancodeProyectosTesting(){
            return testingInjector.getInstance(ServicioBancodeProyectos.class);
        }

        public static ServicioBancodeProyectos getInstance(){
            return instance;
        }
    }
}
