package edu.eci.cvds.samples.beans;


import org.primefaces.model.chart.PieChartModel;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class EstadisticaBean extends BaseBean {
    private PieChartModel model;

    @PostConstruct
    public void init() {
        model = new PieChartModel();
        model.set("En Espera", 62);//jobs in thousands
        model.set("En Proceso", 46);
        model.set("Finalizado", 38);

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
        model.setSeriesColors("aaf,afa,faa,ffa,aff,faf,ddd");
    }

    public PieChartModel getModel() {
        return model;
    }
}