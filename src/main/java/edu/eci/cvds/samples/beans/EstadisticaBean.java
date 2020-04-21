package edu.eci.cvds.samples.beans;

import edu.eci.cvds.samples.entities.Idea;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

@ManagedBean(name = "estadisticaBean")
@SessionScoped
public class EstadisticaBean extends  BaseBean{
    private List<Idea> ideaLis;
    private int enProceso;
    private int enEspera;
    private int finalizado;

    public void generar(){
        for(int i=0;i<ideaLis.size();i++){
            if(ideaLis.get(i).getEstado().equals("En proceso")){
                enProceso++;
            }
            else if(ideaLis.get(i).getEstado().equals("En espera")){
                enEspera++;

            }
            else if(ideaLis.get(i).getEstado().equals("Finalizado")){
                finalizado++;

            }
        }
    }


}
