package edu.eci.cvds.samples.beans;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import edu.eci.cvds.samples.entities.PalabraClave;
import edu.eci.cvds.samples.services.ServicioPalabrasClave;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "palabrasClaveBean")
@SessionScoped
public class PalabrasClaveBean extends BaseBean {
    @Inject
    private ServicioPalabrasClave servicio;

    private List<PalabraClave> claveList;
    private List<PalabraClave> removList;
    private List<PalabraClave> addList;


    @Override
    public void init() {
        super.init();
        iniciar();
    }

    public void registarPalabra(String nombreIdea, String valor){
        PalabraClave pl =new PalabraClave();
        pl.setNombreIdea(nombreIdea);
        pl.setValor(valor);
        claveList.add(pl);
        addList.add(pl);
    }

    public void removerPalabra(PalabraClave palabraClave){
        claveList.remove(palabraClave);
        removList.add(palabraClave);
    }
    public void generar(String nombreIdea){
        claveList=servicio.consultarpalabe(nombreIdea);
    }


    public List<PalabraClave> getClaveList() {
        return claveList;
    }

    public void setClaveList(List<PalabraClave> claveList) {
        this.claveList = claveList;
    }

    public void actualizarPalabras(){
        servicio.actualizarPalabras(addList,removList);
        iniciar();
    }
    public void iniciar(){
        removList = new ArrayList<>();
        claveList = new ArrayList<>();
        addList = new ArrayList<>();
    }
}
