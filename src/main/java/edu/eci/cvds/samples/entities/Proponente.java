package edu.eci.cvds.samples.entities;

public class Proponente {
    private String usuario,descripcion,palabraClave,area;
    private Date fecha;
    public void Proponente(Date fecha;String usuario,String descripcion,String palabraClave,String area,)
    {
        this.usuario=usuario;
        this.descripcion=descripcion;
        this.palabraClave=palabraClave;
        this.area=area;
        this.fecha=fecha;
    }
    public String getUsuario(){ return usuario; }
    public String getDescripcion(){ return descripcion; }
    public String getPalabraClave(){ return palabraClave; }
    public String getArea(){ return area; }
    public Date getFecha(){ return fecha; }
    public void setUsuario(){ this.usuario=usuario; }
    public void setDescripcion(){ this.descripcion=descripcion; }
    public void setPalabraClave(){ this.palabraClave=palabraClave; }
    public void setArea(){ this.area=area; }
    public void setFecha(){ this.fecha=fecha; }
}
