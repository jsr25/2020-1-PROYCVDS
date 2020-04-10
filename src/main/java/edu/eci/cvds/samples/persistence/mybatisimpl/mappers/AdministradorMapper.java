package edu.eci.cvds.samples.persistence.mybatisimpl.mappers;


import edu.eci.cvds.samples.entities.Administrador;
import org.apache.ibatis.annotations.Param;

public interface AdministradorMapper{

    public Administrador consultarInfoAdmin(@Param("usuario")String usuario);





}