/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.ArrayList;


public class Counter {
    
    
    private String nombre;
    private int cedulaJuridica;
    private String direccion;
    private int cantCasilleros;
    private ArrayList<Casillero> listaCasillero;
    private ArrayList<AdministradorClientes> listaAdmi;


    public Counter() {
    }

    public Counter(String nombre, int cedulaJuridica, String direccion, int cantCasilleros, ArrayList<Casillero> listaCasillero, ArrayList<AdministradorClientes> listaAdmi) {
        this.nombre = nombre;
        this.cedulaJuridica = cedulaJuridica;
        this.direccion = direccion;
        this.cantCasilleros = cantCasilleros;
        this.listaCasillero = listaCasillero;
        this.listaAdmi = listaAdmi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(int cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantCasilleros() {
        return cantCasilleros;
    }

    public void setCantCasilleros(int cantCasilleros) {
        this.cantCasilleros = cantCasilleros;
    }

    public ArrayList<Casillero> getListaCasillero() {
        return listaCasillero;
    }

    public void setListaCasillero(ArrayList<Casillero> listaCasillero) {
        this.listaCasillero = listaCasillero;
    }

    public ArrayList<AdministradorClientes> getListaAdmi() {
        return listaAdmi;
    }

    public void setListaAdmi(ArrayList<AdministradorClientes> listaAdmi) {
        this.listaAdmi = listaAdmi;
    }

    public void annadirAdmiCliente(AdministradorClientes cliente){
        for (int i = 0; i < listaAdmi.size(); i++) {
            AdministradorClientes sacado = listaAdmi.get(i);
            if (sacado.getCliente().getpId()== cliente.getCliente().getpId()){
                System.out.println("No pudo ser ingresado");
             }
        }   
        listaAdmi.add(cliente);
        System.out.println("Ingresado al inventario");
    }
 
    public void buscarCliente( int id){
       
      for (int i = 0; i < listaAdmi.size(); i++) {
            AdministradorClientes buscado = listaAdmi.get(i);
            if (buscado.getCliente().getpId() == id){
                
                System.out.println("Encontrado: ");
                System.out.println(buscado);
                return;
            }
               
        }
                
            System.out.println("No se encontro cliente solicitado");
    }
    
    public boolean quitarAdmiCliente( int id){
       
        for (int i = 0; i < listaAdmi.size(); i++) {
            AdministradorClientes buscado = listaAdmi.get(i);
            if (buscado.getCliente().getpId() == id){
                listaAdmi.remove(i);
                return true;
            }
        }
                
         System.out.println("No se encontro Cliente solicitado");
         return false; 
    }
    
        public String mostrarClientes() {
        for(int i=0; i<listaAdmi.size();i++){
            AdministradorClientes imprimir= listaAdmi.get(i);
            System.out.println("\n"+imprimir);
        }
        return "";
    }
    
    public boolean registrarEntregable(Entregable entrega){
        String duenno= entrega.getRemitente();

        for (int i = 0; i < listaAdmi.size(); i++) {
            AdministradorClientes sacado = listaAdmi.get(i);
            if (sacado.getCliente().getpId()== entrega.getIdRemitente()){
               
               sacado.getCasillero().annadirEntregable(entrega);
               //AQUI VA LA FUNCION PARA ENVIAR EL CORREO
               return true;
             }
        }   
        return false;
        
    }

    @Override
    public String toString() {
        return "Counter{" + "nombre=" + nombre + ", cedulaJuridica=" + cedulaJuridica + ", direccion=" + direccion + ", cantCasilleros=" + cantCasilleros + ", listaCasillero=" + listaCasillero + ", listaAdmi=" + listaAdmi + '}';
    }
    
    
    
}
        
        

    


    
        

