package edu.eci.cvds.samples.persistence.mybatisimpl.mappers;

import edu.eci.cvds.samples.entities.Proponente;
import org.apache.ibatis.annotations.Param;

public interface ProponenteMapper {

    public Proponente consultarInfo(@Param("usuario")String usuario);
}
