package edu.eci.cvds.samples.beans;

import com.google.inject.Inject;
import edu.eci.cvds.samples.entities.Voto;
import edu.eci.cvds.samples.services.ServicioVoto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ValueChangeEvent;
import java.util.List;

@ManagedBean(name = "votoBean")
@ViewScoped
public class VotoBean extends BaseBean {
    private List<Voto> votoList;
    private Integer votos;
    @Inject
    private ServicioVoto servicio;
    public void generar(String nombreIdea){
        votoList=servicio.consultarVoto(nombreIdea);
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }
    public  void consultar(String idea,String login,Boolean valor){
        if (valor){
            servicio.remover(login,idea);
            System.out.println("remover");
        }
        else{
            servicio.insertar(login,idea);
            System.out.println("insertar");
        }
        System.out.println(valor);
    }
}
