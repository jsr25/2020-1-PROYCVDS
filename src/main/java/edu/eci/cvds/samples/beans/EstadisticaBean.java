package edu.eci.cvds.samples.beans;

import edu.eci.cvds.samples.entities.Area;
import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
import org.primefaces.model.chart.PieChartModel;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.io.IOException;
import java.util.List;


@ManagedBean(name = "estadisticaBean")
@SessionScoped
public class EstadisticaBean extends BaseBean {
    private PieChartModel model;
    private List<Idea> ideas;
    private List<Area> areas;

    @Inject
    private ServicioBancodeProyectos servicio;

    @PostConstruct
    public void init() {
        super.init();
        model = new PieChartModel();
        generar();
        llenarGrafica();
        decorarModelo();
    }

    public PieChartModel getModel() {
        return model;
    }


    private void generar(){
        ideas=servicio.consultarTodo();
        areas=servicio.consultarArea();
    }
    private void llenarGrafica(){
        for(Area a: areas){
            model.set(a.getNombreArea(),a.getCantidadIdeas());
        }
    }
    private void decorarModelo(){
        model.setTitle("States Ideas");
        model.setLegendPosition("e");
        model.setShowDatatip(true);
        model.setShowDataLabels(true);
        model.setDataFormat("value");
        model.setSeriesColors("f5ce61,82f8d3,f787a4");
    }

    public List<Idea> getIdeas() {
        return ideas;
    }

}