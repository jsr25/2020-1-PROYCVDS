package edu.eci.cvds.samples.services;

import edu.eci.cvds.samples.entities.Voto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServicioVoto  {

    public List<Voto> consultarVoto(String idea);
    public void  remover(String login,String nombreIdea);
    public void  insertar(String login,String nombreIdea);
}
