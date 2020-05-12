package edu.eci.cvds.test;

import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.entities.PalabraClave;
import edu.eci.cvds.samples.entities.Usuario;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.IdeaMapper;
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
public class IdeaTest {

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
    public void DeberiaConsultarIdea() {
        SqlSessionFactory conectDB;
        conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        IdeaMapper idMapper = sqlss.getMapper(IdeaMapper.class);
        List<Idea> idea = idMapper.consultarIdea("qwe");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(idea.size()>0);
    }
    @Test
    public void DeberiaConsultarVoto() {
        SqlSessionFactory conectDB;
        conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        IdeaMapper idMapper = sqlss.getMapper(IdeaMapper.class);
        List<Idea> idea = idMapper.consultarVoto("jsr25");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(idea.size() > 0);
    }
   // @Test
   // public void DeberiaRegistrarIdea(){}

    @Test
    public void DeberiaCambiarEstado(){
        SqlSessionFactory conectDB;
        conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        IdeaMapper idMapper = sqlss.getMapper(IdeaMapper.class);
        Idea idea1= idMapper.consultarIdea2("desarrollo economico");
        idMapper.cambiarEstado("en espera",idea1);
        Idea idea2 = idMapper.consultarIdea2("desarrollo economico");
        System.out.println(idea2);
        idMapper.cambiarEstado("finalizado",idea2);
        System.out.println(idea2);
        sqlss.commit();
        sqlss.close();
        Assert.assertEquals(idea2.getEstado(),"en espera");
    }
    @Test
    public void deberiaConsultarIdea2(){
        SqlSessionFactory conectDB;
        conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        IdeaMapper idMapper = sqlss.getMapper(IdeaMapper.class);
        Idea idea = idMapper.consultarIdea2("desarrollo economico");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(idea != null);
    }
    @Test
    public void deberiaConsultarIdeaPorArea(){
        SqlSessionFactory conectDB;
        conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        IdeaMapper idMapper = sqlss.getMapper(IdeaMapper.class);
        List<Idea> idea = idMapper.consultarIdeaArea("finanicero");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(idea.size()>0 );
    }
    @Test
    public void DeberiaConsultarTodo(){
        SqlSessionFactory conectDB;
        conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        IdeaMapper idMapper = sqlss.getMapper(IdeaMapper.class);
        List<Idea> idea = idMapper.consultarTodo();
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(idea.size()>0);
    }
    @Test
    public void DeberiaConsultarIdeasM(){
        SqlSessionFactory conectDB;
        conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        IdeaMapper idMapper = sqlss.getMapper(IdeaMapper.class);
        List<Idea> idea = idMapper.consultarIdeasM("desarrollo economico");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(idea.size()>0);
    }
    @Test
    public void DeberiaConsultarIdeasRelacionadas(){
        SqlSessionFactory conectDB;
        conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        IdeaMapper idMapper = sqlss.getMapper(IdeaMapper.class);
        List<Idea> idea = idMapper.consultarRelacion("desarrollo economico");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(idea.size()>0 );
    }
    @Test
    public void DeberiaConsultarIdeasProponente(){
        SqlSessionFactory conectDB;
        conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        IdeaMapper idMapper = sqlss.getMapper(IdeaMapper.class);
        List<Idea> idea = idMapper.consultarIdeaProponente("mariahv9");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(idea.size()>0);
    }
    @Test
    public void DeberiaConsultarIdeasEnEspera () {
        SqlSessionFactory conectDB;
        conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        IdeaMapper idMapper = sqlss.getMapper(IdeaMapper.class);
        List<Idea> idea = idMapper.consultarIdeaEnEspera("mariahv9");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(idea.size()>0);
    }
    @Test
    public void DeberiaConsultarPorEstado(){
        SqlSessionFactory conectDB;
        conectDB = getSqlSessionFactory();
        SqlSession sqlss = conectDB.openSession();
        IdeaMapper idMapper = sqlss.getMapper(IdeaMapper.class);
        List<Idea> idea = idMapper.consultarIdeaPorEstado("finalizado");
        sqlss.commit();
        sqlss.close();
        Assert.assertTrue(idea.size()>0);
    }
}