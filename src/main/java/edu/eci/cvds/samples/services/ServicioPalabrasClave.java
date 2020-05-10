package edu.eci.cvds.samples.services;

import edu.eci.cvds.samples.entities.PalabraClave;

import java.util.List;

public interface ServicioPalabrasClave {
    public List<PalabraClave> consultarpalabe(String nombreIdea);
    public void registrarPalabra( PalabraClave palabraClave);
    public void removerPalabra( PalabraClave palabraClave);
    public void actualizarPalabras(List<PalabraClave> addList,List<PalabraClave> remvList);
}
