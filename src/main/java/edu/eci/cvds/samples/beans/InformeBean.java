package edu.eci.cvds.samples.beans;
import com.google.inject.Inject;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Clase InformeBean de la aplicación.
 * @author Juan Ramos, Mateo Quintero, Brayan Jimenez, Maria Hernandez.
 * @version 1.0
 */
@ManagedBean(name = "js")
@SessionScoped
public class InformeBean {
    @Inject
    private ServicioBancodeProyectos servicio;
    private String val="azul";

    /**
     * Método que retorna un valor.
     * @return val retorno del programa.
     */
    public String getVal() {
        return val;
    }

    /**
     * Método que guarda el valor del programa.
     * @param val Argumento del programa.
     */
    public void setVal(String val) {
        this.val = val;
    }
}
