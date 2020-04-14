package edu.eci.cvds.samples.persistence.mybatisimpl.mappers;

import edu.eci.cvds.samples.entities.Usuario;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * Clase UsuarioMapper de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
public interface UsuarioMapper {

    /**
     * Método que consulta informacion del usuario.
     * @param usuario Argumentos del programa.
     */
    public Usuario consultarUsuario(@Param("usuario")String usuario);

    /**
     * Método que consulta los usuarios del usuario.
     * @param usuario Argumentos del programa.
     */
    public List<Usuario> consultarUsuarios(@Param("usuario")String usuario);

    /**
     * Método que registra los usuarios del administrador.
     * @param usuario Argumentos del programa.
     */
    public void registrarUsuario(@Param("usuario") Usuario usuario);

    public void deleteUsuario(@Param("user") String usuario );

    public void carbiarRole(@Param("estado")String estado,@Param("usuario") Usuario usuario );
}
