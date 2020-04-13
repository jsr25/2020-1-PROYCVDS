package edu.eci.cvds.test;

import edu.eci.cvds.samples.entities.PersonalPMO;
import edu.eci.cvds.samples.entities.Administrador ;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.entities.Proponente;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.AdministradorMapper;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.PersonalPMOMapper;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.ProponenteMapper;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.UsuarioMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;

/**
 * Clase bancoIniciativas de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public class bancoIniciativas {

    public static SqlSessionFactory getSqlSessionFactory() {
        SqlSessionFactory sqlSessionFactory = null;
        if (sqlSessionFactory == null) {
            InputStream inputStream;
            try {
                inputStream = Resources.getResourceAsStream("mybatis-config.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
        return sqlSessionFactory;
    }

    @Test
    public void DeberiaBuscarAdministradorQueNoExiste() {
        SqlSessionFactory conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        AdministradorMapper adminMapper = sqlss.getMapper(AdministradorMapper.class);
        Administrador admin = adminMapper.consultarInfoAdmin("xa");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(admin == null);
    }

    @Test
    public void DeberiaExisitirUnAdministrador() {
        SqlSessionFactory conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        AdministradorMapper adminMapper = sqlss.getMapper(AdministradorMapper.class);
        Administrador admin = adminMapper.consultarInfoAdmin("ma");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(admin != null);

    }

    @Test
    public void laContrasenaDebeSerCorrecta() {
        SqlSessionFactory conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        AdministradorMapper adminMapper = sqlss.getMapper(AdministradorMapper.class);
        Administrador admin = adminMapper.consultarInfoAdmin("ma");
        sqlss.commit();
        sqlss.close();
        Assert.assertEquals(admin.getPasword(), "asdfty");

    }

    @Test
    public void DeberiaBuscarPersonalPMOQueNoExiste() {
        SqlSessionFactory conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        PersonalPMOMapper PersonalMapper = sqlss.getMapper(PersonalPMOMapper.class);
        PersonalPMO personal = PersonalMapper.consultarInfo("fasq");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(personal == null);
    }

    @Test
    public void DeberiaExisitirUnPersonalPMO() {
        SqlSessionFactory conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        PersonalPMOMapper PersonalMapper = sqlss.getMapper(PersonalPMOMapper.class);
        PersonalPMO personal = PersonalMapper.consultarInfo("matox99");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(personal != null);

    }

    @Test
    public void laContrasenaDebeSerCorrectaPersonal() {
        SqlSessionFactory conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        PersonalPMOMapper PersonalMapper = sqlss.getMapper(PersonalPMOMapper.class);
        PersonalPMO personal = PersonalMapper.consultarInfo("matox99");
        sqlss.commit();
        sqlss.close();
        Assert.assertEquals(personal.getPassword(), "asdfqwerty");

    }

    @Test
    public void DeberiaLeerUnProponenteExisitente() {
        SqlSessionFactory conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        ProponenteMapper PropMapper = sqlss.getMapper(ProponenteMapper.class);
        Proponente prop = PropMapper.consultarInfo("mat");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(prop != null);
    }

    @Test
    public void DeberiaBuscarProponenteNoExistente() {
        SqlSessionFactory conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        ProponenteMapper PropMapper = sqlss.getMapper(ProponenteMapper.class);
        Proponente prop = PropMapper.consultarInfo("maasdft");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(prop== null);
    }

    @Test
    public void LaContrasenaEsCorrectaEnProponente() {
        SqlSessionFactory conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        ProponenteMapper PropMapper = sqlss.getMapper(ProponenteMapper.class);
        Proponente prop = PropMapper.consultarInfo("mat");
        sqlss.commit();
        sqlss.close();
        Assert.assertEquals(prop.getPassword(), "maka");
    }

    @Test
    public void DeberiaLeerUnUsuarioExisitente() {
        SqlSessionFactory conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        UsuarioMapper UsMapper = sqlss.getMapper(UsuarioMapper.class);
        Usuario usuario = UsMapper.consultarInfo("jsr25");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(usuario != null);
    }
    @Test
    public void DeberiaBuscarUsuarioNoExisitente() {
        SqlSessionFactory conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        UsuarioMapper UsMapper = sqlss.getMapper(UsuarioMapper.class);
        Usuario usuario = UsMapper.consultarInfo("jsr25213123");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(usuario == null);
    }
    @Test
    public void DeberianCoincidirLasContrasenas(){
        SqlSessionFactory conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        UsuarioMapper UsMapper = sqlss.getMapper(UsuarioMapper.class);
        Usuario usuario = UsMapper.consultarInfo("jsr25");
        sqlss.commit();
        sqlss.close();
        Assert.assertEquals(usuario.getPassword(),"Ramios");

    }
}