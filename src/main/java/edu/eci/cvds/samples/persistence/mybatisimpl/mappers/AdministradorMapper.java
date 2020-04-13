package edu.eci.cvds.samples.persistence.mybatisimpl.mappers;

import edu.eci.cvds.samples.entities.Administrador;
import edu.eci.cvds.samples.entities.Usuario;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * Clase AdministradorMapper de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public interface AdministradorMapper{

    /**
     * Método que consulta informacion del administrador.
     * @param usuario Argumentos del programa.
     */
    public Administrador consultarInfoAdmin(@Param("usuario")String usuario);

    /**
     * Método que consulta el usuario.
     * @param usuario Argumentos del programa.
     */
    public List<Usuario> consultarUsuarios(@Param("usuario") String usuario);

    /**
     *
     * @param administrador
     */
    public void registrarAdministrador(@Param("usuario") Administrador administrador);
}