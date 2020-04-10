package edu.eci.cvds.samples.beans;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean(name = "js")
@SessionScoped
public class InformeBean {

    private String val="azul";


    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
