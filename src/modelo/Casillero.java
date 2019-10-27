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
class Casillero {
    private int numero;
    private boolean estado;
    private ArrayList<Entregable> listaEntregables;

    public Casillero(int numero, boolean estado, ArrayList<Entregable> listaEntregables) {
        this.numero = numero;
        this.estado = estado;
        this.listaEntregables = listaEntregables;
    }

    public Casillero() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<Entregable> getListaEntregables() {
        return listaEntregables;
    }

    public void setListaEntregables(ArrayList<Entregable> listaEntregables) {
        this.listaEntregables = listaEntregables;
    }
    
    public void annadirEntregable(Entregable entrega){
        for (int i = 0; i < listaEntregables.size(); i++) {
            Entregable repetido = listaEntregables.get(i);
            if (repetido.getId()== entrega.getId()){
                System.out.println("No pudo ser ingresado");
             }
        }   
        listaEntregables.add(entrega);
        System.out.println("Ingresado al inventario");
    }

    @Override
    public String toString() {
        return "Casillero{" +
                "numero=" + numero 
                + ", estado=" + estado 
                + ", listaEntregables=" + listaEntregables + '}';   //Hola Karencita :3
    }



}