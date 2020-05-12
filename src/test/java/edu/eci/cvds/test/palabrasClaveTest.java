package edu.eci.cvds.test;

import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.entities.PalabraClave;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.IdeaMapper;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.PalabrasClaveMapper;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.UsuarioMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * Clase bancoIniciativas de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public class palabrasClaveTest {

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
    public void DeberiaConsultarpalabe() {
        SqlSessionFactory conectDB;
        conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        PalabrasClaveMapper paMapper = sqlss.getMapper(PalabrasClaveMapper.class);
        List<PalabraClave> palabras = paMapper.consultarpalabe("desarrollo economico");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(palabras.size()>0 );
    }
    @Test
    public void DeberiaRegistrarPalabras(){
        SqlSessionFactory conectDB;
        conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        PalabrasClaveMapper paMapper = sqlss.getMapper(PalabrasClaveMapper.class);
        List<PalabraClave> palabras = paMapper.consultarpalabe("desarrollo economico");
        paMapper.removerPalabra(palabras.get(0));
        paMapper.registrarPalabra(palabras.get(0));
        List<PalabraClave> palabras2 =paMapper.consultarpalabe("desarrollo economico");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(palabras2.size()>0);

    }
    @Test
    public void DeberiaBorrarPalabras(){
        SqlSessionFactory conectDB;
        conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        PalabrasClaveMapper paMapper = sqlss.getMapper(PalabrasClaveMapper.class);
        List<PalabraClave> palabras = paMapper.consultarpalabe("desarrollo economico");
        paMapper.removerPalabra(palabras.get(0));
        List<PalabraClave> palabras2 =paMapper.consultarpalabe("desarrollo economico");
        paMapper.registrarPalabra(palabras.get(0));
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(palabras2.size() == 0 );
    }
}