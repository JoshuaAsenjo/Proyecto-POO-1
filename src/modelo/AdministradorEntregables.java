/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author joshu
 */
public class AdministradorEntregables {
    private ArrayList<Entregable> listaEntregables;

    public AdministradorEntregables(ArrayList<Entregable> listaEntregables) {
        this.listaEntregables = listaEntregables;
    }

    public AdministradorEntregables() {
    }

    public ArrayList<Entregable> getListaEntregables() {
        return listaEntregables;
    }

    public void setListaEntregables(ArrayList<Entregable> listaEntregables) {
        this.listaEntregables = listaEntregables;
    }

    @Override
    public String toString() {
        return "AdministradorEntregables{" + "listaEntregables=" + listaEntregables + '}';
    }
    
    
}
