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
    private NivelCliente nivelCliente;

    public AdministradorClientes(Cliente cliente, Casillero casillero, int cantidadRecibidos, NivelCliente nivelCliente) {
        this.cliente = cliente;
        this.casillero = casillero;
        this.cantidadRecibidos = cantidadRecibidos;
        this.nivelCliente = nivelCliente;
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

    public NivelCliente getNivelCliente() {
        return nivelCliente;
    }

    public void setNivelCliente(NivelCliente nivelCliente) {
        this.nivelCliente = nivelCliente;
    }

    
    
    @Override
    public String toString() {
        return "AdministradorClientes{" + "cliente=" 
                + cliente + ", casillero=" 
                + casillero + ", cantidadRecibidos=" 
                + cantidadRecibidos + ", nivelCliente=" + nivelCliente + '}';
    }
    
    
}