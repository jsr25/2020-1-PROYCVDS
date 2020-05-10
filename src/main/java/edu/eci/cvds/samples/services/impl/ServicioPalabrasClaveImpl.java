package edu.eci.cvds.samples.services.impl;

import edu.eci.cvds.samples.entities.PalabraClave;
import edu.eci.cvds.samples.persistence.DAOPalabrasClave;
import edu.eci.cvds.samples.services.ServicioPalabrasClave;

import javax.inject.Inject;
import java.util.List;

public class ServicioPalabrasClaveImpl implements ServicioPalabrasClave {
    @Inject
    private DAOPalabrasClave daoPC;

    @Override
    public List<PalabraClave> consultarpalabe(String nombreIdea) {
        return daoPC.consultarpalabe(nombreIdea);
    }

    @Override
    public void registrarPalabra(List<PalabraClave> claveList,String ideaname) {
        for(int i =0;i < claveList.size(); i++){
            PalabraClave palabraClave =claveList.get(i);
            palabraClave.setNombreIdea(ideaname);
            daoPC.registrarPalabra(palabraClave);
        }
    }

    @Override
    public void removerPalabra(PalabraClave palabraClave) {
        daoPC.removerPalabra(palabraClave);
    }

    @Override
    public void actualizarPalabras(List<PalabraClave> addList, List<PalabraClave> remvList) {
        for(int i =0 ; i < addList.size(); i++ ){
            try{
            daoPC.registrarPalabra(addList.get(i));}
            catch (Exception e){}
        }
        for(int i =0 ; i < remvList.size(); i++ ){
            try{
            daoPC.removerPalabra(remvList.get(i));}
            catch (Exception e){}
        }
    }
}
