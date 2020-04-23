package edu.eci.cvds.samples.entities;

public class Area {

    private String nombreArea;
    private int cantidadIdeas;

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public int getCantidadIdeas() {
        return cantidadIdeas;
    }

    public void setCantidadIdeas(int cantidadIdeas) {
        this.cantidadIdeas = cantidadIdeas;
    }

    @Override
    public String toString() {
        return "Area{" +
                "nombreArea='" + nombreArea + '\'' +
                ", cantidadIdeas=" + cantidadIdeas +
                '}';
    }
}
