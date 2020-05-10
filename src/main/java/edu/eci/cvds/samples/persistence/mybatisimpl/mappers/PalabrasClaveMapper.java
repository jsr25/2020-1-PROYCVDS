package edu.eci.cvds.samples.persistence.mybatisimpl.mappers;

import edu.eci.cvds.samples.entities.PalabraClave;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PalabrasClaveMapper {

    public List<PalabraClave> consultarpalabe(@Param("idea") String nombreIdea);
    public void registrarPalabra(@Param("palabra") PalabraClave palabraClave);
    public void removerPalabra(@Param("palabra") PalabraClave palabraClave);
}
