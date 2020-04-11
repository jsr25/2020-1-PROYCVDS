package edu.eci.cvds.samples.persistence;

        import edu.eci.cvds.samples.entities.Administrador;
        import edu.eci.cvds.samples.entities.Usuario;

        import java.util.List;

public interface DAOAdministrador {

    public Administrador consultarInfoAdmin(String usuario);
    public List<Usuario> consultarUsuarios(String usuario);
}
