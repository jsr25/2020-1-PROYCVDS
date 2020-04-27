package edu.eci.cvds.samples.services;

import edu.eci.cvds.samples.entities.Voto;

import java.util.List;

public interface ServicioVoto  {

    public List<Voto> consultarVoto(String idea);
}
