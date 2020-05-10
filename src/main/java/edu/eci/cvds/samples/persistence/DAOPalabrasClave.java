package edu.eci.cvds.samples.persistence;

import edu.eci.cvds.samples.entities.PalabraClave;


import java.util.List;

public interface DAOPalabrasClave {
    public List<PalabraClave> consultarpalabe( String nombreIdea);
    public void registrarPalabra( PalabraClave palabraClave);
    public void removerPalabra( PalabraClave palabraClave);
}
