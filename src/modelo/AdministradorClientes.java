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
    private int cantidadPorRetirar;


    public AdministradorClientes(Cliente cliente, Casillero casillero, int cantidadRecibidos, int cantidadPorRetirar) {
        this.cliente = cliente;
        this.casillero = casillero;
        this.cantidadRecibidos = cantidadRecibidos;
        this.cantidadPorRetirar = cantidadPorRetirar;
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

    public int getCantidadPorRetirar() {
        return cantidadPorRetirar;
    }

    public void setCantidadPorRetirar(int cantidadPorRetirar) {
        this.cantidadPorRetirar = cantidadPorRetirar;
    }

    
    @Override
    public String toString() {        
        return "AdministradorClientes{" + "cliente=" 
                + cliente + ", casillero=" 
                + casillero + ", cantidadRecibidos=" 
                + cantidadRecibidos + '}';
    }
    
    
}
