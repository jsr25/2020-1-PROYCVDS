package edu.eci.cvds.samples.persistence.mybatisimpl.mappers;

import edu.eci.cvds.samples.entities.Usuario;
import org.apache.ibatis.annotations.Param;

public interface UsuarioMapper {
    public Usuario consultarInfo(@Param("usuario")String usuario);
}
