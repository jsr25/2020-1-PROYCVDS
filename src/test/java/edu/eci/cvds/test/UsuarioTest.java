package edu.eci.cvds.test;

import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.IdeaMapper;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.UsuarioMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

/**
 * Clase bancoIniciativas de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public class UsuarioTest {

    public static SqlSessionFactory getSqlSessionFactory() {
        SqlSessionFactory sqlSessionFactory = null;
        if (sqlSessionFactory == null) {
            InputStream inputStream;
            try {
                inputStream = Resources.getResourceAsStream("mybatis-config-h2.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
        return sqlSessionFactory;
    }

    @Test
    public void DeberiaLeerUnUsuarioExisitente() {
        SqlSessionFactory conectDB;
        conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        UsuarioMapper UsMapper = sqlss.getMapper(UsuarioMapper.class);
        Usuario usuario = UsMapper.consultarUsuario("jsr25");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(usuario != null);
    }

    @Test
    public void DeberiaBuscarUsuarioNoExisitente() {
        SqlSessionFactory conectDB;
        conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        UsuarioMapper UsMapper = sqlss.getMapper(UsuarioMapper.class);
        Usuario usuario = UsMapper.consultarUsuario("jsr25213123");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(usuario == null);
    }

    @Test
    public void DeberianCoincidirLasContrasenas(){
        SqlSessionFactory conectDB;
        conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        UsuarioMapper UsMapper = sqlss.getMapper(UsuarioMapper.class);
        Usuario usuario = UsMapper.consultarUsuario("jsr25");
        sqlss.commit();
        sqlss.close();
        Assert.assertEquals(usuario.getPassword(),"Ramios");
    }
    @Test
    public void DeberiaModificarRolUsuario () {
        SqlSessionFactory conectDB;
        conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        UsuarioMapper UsMapper = sqlss.getMapper(UsuarioMapper.class);
        Usuario usuario = UsMapper.consultarUsuario("jsr25");
        UsMapper.carbiarRole("Usuario",usuario);
        Usuario usuario2 = UsMapper.consultarUsuario("jsr25");
        UsMapper.carbiarRole(usuario.getRole(),usuario2);
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(usuario.getRole()!=usuario2.getRole());

    }
    @Test
    public void DeberiaBorrarUsuario () {
        SqlSessionFactory conectDB;
        conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        UsuarioMapper UsMapper = sqlss.getMapper(UsuarioMapper.class);
        Usuario usuario = UsMapper.consultarUsuario("jsr25");
        UsMapper.deleteUsuario("jsr25");
        Usuario usuario2 = UsMapper.consultarUsuario("jsr25");
        UsMapper.registrarUsuario(usuario);
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(usuario2== null);
    }
    @Test
    public void DeberiaRegistrarUsuario () {
        SqlSessionFactory conectDB;
        conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        UsuarioMapper UsMapper = sqlss.getMapper(UsuarioMapper.class);
        Usuario usuario = UsMapper.consultarUsuario("jsr25");
        UsMapper.deleteUsuario("jsr25");
        UsMapper.registrarUsuario(usuario);
        Usuario usuario2 = UsMapper.consultarUsuario("jsr25");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(usuario2!= null);

    }
   /*   @Test
    public void DeberianRegistrarIdea(){
      Idea idea = new Idea("Iniciativa CVDS", new Date(), "Maria", "001", "CVDS", "Desarrollo", "Pendiente");
        SqlSessionFactory conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        IdeaMapper IdMapper = sqlss.getMapper(IdeaMapper.class);
        sqlss.commit();
        sqlss.close();
        Assert.assertNotNull(idea.getDescripcion());
    }

    @Test
    public void DeberiaConsultarIdea(){
        Idea idea = new Idea("Iniciativa CVDS", new Date(), "Maria", "001", "CVDS", "Desarrollo", "Pendiente");
        SqlSessionFactory conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        IdeaMapper IdMapper = sqlss.getMapper(IdeaMapper.class);
        sqlss.commit();
        sqlss.close();
        Assert.assertEquals(idea.getPalabras(), "Desarrollo");
    }*/
}