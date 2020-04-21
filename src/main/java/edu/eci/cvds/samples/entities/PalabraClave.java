package edu.eci.cvds.samples.entities;

import com.google.inject.internal.util.$AsynchronousComputationException;

public class PalabraClave {
    private String nombreIdea;
    private String valor;

    public PalabraClave(String nombreIdea, String valor) {
        this.nombreIdea=nombreIdea;
        this.valor=valor;
    }
    public PalabraClave(){}

    public String getNombreIdea() {
        return nombreIdea;
    }

    public void setNombreIdea(String nombreIdea) {
        this.nombreIdea = nombreIdea;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "PalabraClave{" +
                "nombreIdea='" + nombreIdea + '\'' +
                ", valor='" + valor + '\'' +
                '}';
    }
}
