package edu.eci.cvds.samples.beans;

import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
import org.primefaces.model.chart.PieChartModel;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.List;


@ManagedBean(name = "estadisticaBean")
@SessionScoped
public class EstadisticaBean extends BaseBean {
    private PieChartModel model;
    @Inject
    private ServicioBancodeProyectos servicio;

    @PostConstruct
    public void init() {
        super.init();
        model = new PieChartModel();
        estadistica("monitoria");
        //model.set("En Espera", 62);//jobs in thousands
        //model.set("En Proceso", 46);
        //model.set("Finalizado", 38);

        //followings are some optional customizations:
        //set title
        model.setTitle("States Ideas");
        //set legend position to 'e' (east), other values are 'w', 's' and 'n'
        model.setLegendPosition("e");
        //enable tooltips
        model.setShowDatatip(true);
        //show labels inside pie chart
        model.setShowDataLabels(true);
        //show label text  as 'value' (numeric) , others are 'label', 'percent' (default). Only one can be used.
        model.setDataFormat("value");
        //format: %d for 'value', %s for 'label', %d%% for 'percent'
        model.setDataLabelFormatString("%dK");
        //pie sector colors
        model.setSeriesColors("f5ce61,82f8d3,f787a4");
    }

    public PieChartModel getModel() {
        return model;
    }

    public void estadistica(String area){
        int totalAreas=0;
        int espera=0;
        int proceso=0;
        int finalizado=0;
        List<Idea> listIdeas = servicio.consultarIdeaArea(area);
        totalAreas = listIdeas.size();
        for (Idea a :listIdeas){
           if ( a.getEstado().equals("En espera")){
               espera+=1;
           }
           else if (a.getEstado().equals("En proceso")){
               proceso+=1;
           }
           else if (a.getEstado().equals("Finalizado")) {
               finalizado+=1;
           }
        }
        model.set("En espera",espera);
        model.set("Finalizado",finalizado);
        model.set("En proceso",proceso);
    }

}