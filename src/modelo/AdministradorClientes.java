/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author joshu
 */
public class AdministradorClientes {
    private Cliente cliente;
    private Casillero casillero;
    private int cantidadRecibidos;
<<<<<<< HEAD
 
=======
    //private NivelCliente nivelCliente;
>>>>>>> 123358e3295232d79c6651bdfbc6dab47f5fd6a2

    public AdministradorClientes(Cliente cliente, Casillero casillero, int cantidadRecibidos) {
        this.cliente = cliente;
        this.casillero = casillero;
        this.cantidadRecibidos = cantidadRecibidos;
    }

    public AdministradorClientes() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Casillero getCasillero() {
        return casillero;
    }

    public void setCasillero(Casillero casillero) {
        this.casillero = casillero;
    }

    public int getCantidadRecibidos() {
        return cantidadRecibidos;
    }

    public void setCantidadRecibidos(int cantidadRecibidos) {
        this.cantidadRecibidos = cantidadRecibidos;
    }
<<<<<<< HEAD

=======
 
>>>>>>> 123358e3295232d79c6651bdfbc6dab47f5fd6a2

    
    
    @Override
    public String toString() {
        return "AdministradorClientes{" + "cliente=" 
                + cliente + ", casillero=" 
                + casillero + ", cantidadRecibidos=" 
                + cantidadRecibidos + '}';
    }
    
    
}
