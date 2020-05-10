package edu.eci.cvds.samples.persistence.mybatisimpl;

import edu.eci.cvds.samples.entities.PalabraClave;
import edu.eci.cvds.samples.persistence.DAOPalabrasClave;
import edu.eci.cvds.samples.persistence.mybatisimpl.mappers.PalabrasClaveMapper;

import javax.inject.Inject;
import java.util.List;

public class MyBatisDAOPalabrasClave implements DAOPalabrasClave {
    @Inject
    private PalabrasClaveMapper pmap;
    @Override
    public List<PalabraClave> consultarpalabe(String nombreIdea) {
        return pmap.consultarpalabe(nombreIdea);
    }

    @Override
    public void registrarPalabra(PalabraClave palabraClave) {
        pmap.registrarPalabra(palabraClave);
    }

    @Override
    public void removerPalabra(PalabraClave palabraClave) {
        pmap.removerPalabra(palabraClave);
    }
}
