package edu.eci.cvds.samples.persistence.mybatisimpl.mappers;


import edu.eci.cvds.samples.entities.Administrador;
import edu.eci.cvds.samples.entities.Usuario;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdministradorMapper{

    public Administrador consultarInfoAdmin(@Param("usuario")String usuario);

    public List<Usuario> consultarUsuarios(@Param("usuario") String usuario);



}