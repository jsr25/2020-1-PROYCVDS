package edu.eci.cvds.samples.beans;

import edu.eci.cvds.samples.entities.Area;
import edu.eci.cvds.samples.entities.Idea;
import edu.eci.cvds.samples.services.ServicioBancodeProyectos;
import org.primefaces.component.datatable.DataTable;
import org.primefaces.component.export.Exporter;
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
    private Exporter <DataTable> textExporter;

    @Inject
    private ServicioBancodeProyectos servicio;

    @PostConstruct
    public void init() {
        super.init();

        generar();

    }

    public PieChartModel getModel() {
        return model;
    }


    private void generar(){
        model = new PieChartModel();
        ideas=servicio.consultarTodo();
    }
    private void consultarPorArea(){
        areas=servicio.consultarArea();
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

    public void consultarIdeaPorEstado () {
         List<Idea> ideas1;
         List<Idea> ideas2;
         List<Idea> ideas3;
        ideas1 = servicio.consultarIdeaPorEstado("Finalizado");
        ideas2 = servicio.consultarIdeaPorEstado("en espera de revisión");
        ideas3 = servicio.consultarIdeaPorEstado("En proceso");
        model.set("finalizado",ideas1.size());
        model.set("en espera de revision",ideas2.size());
        model.set("En proceso",ideas3.size());
    }
    public void porEstado() throws IOException {
        consultarIdeaPorEstado();
        decorarModelo();
        FacesContext.getCurrentInstance().getExternalContext().redirect("estadistica.xhtml");
    }

    public void porArea() throws IOException {
        consultarPorArea();
        decorarModelo();
        FacesContext.getCurrentInstance().getExternalContext().redirect("estadistica.xhtml");
    }

    public void volver() throws IOException {
        generar();
        FacesContext.getCurrentInstance().getExternalContext().redirect("usuario.xhtml");
    }
}