package edu.eci.cvds.test;

import edu.eci.cvds.samples.entities.Usuario;
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
    public void DeberiaLeerUnUsuarioExisitente() {
        SqlSessionFactory conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        UsuarioMapper UsMapper = sqlss.getMapper(UsuarioMapper.class);
        Usuario usuario = UsMapper.consultarUsuario("jsr25");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(usuario != null);
    }
    @Test
    public void DeberiaBuscarUsuarioNoExisitente() {
        SqlSessionFactory conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        UsuarioMapper UsMapper = sqlss.getMapper(UsuarioMapper.class);
        Usuario usuario = UsMapper.consultarUsuario("jsr25213123");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(usuario == null);
    }
    @Test
    public void DeberianCoincidirLasContrasenas(){
        SqlSessionFactory conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        UsuarioMapper UsMapper = sqlss.getMapper(UsuarioMapper.class);
        Usuario usuario = UsMapper.consultarUsuario("jsr25");
        sqlss.commit();
        sqlss.close();
        Assert.assertEquals(usuario.getPassword(),"Ramios");

    }
}