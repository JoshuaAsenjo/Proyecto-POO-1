/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import vista.*;


/**
 *
 * @author luisf
 */
public class Controlador implements ActionListener{
    private Controlador singlenton;
    
    //Vistas
    public Principal p;
    public CreacionCounter vista_counter; 
    public vista.AdministradorClientes vista_AdminClientes = new vista.AdministradorClientes(); 
    public Interfaz vista_interfaz = new Interfaz();
    public TablaCounters vista_tablaCounter = new TablaCounters();
    
    //Modelos           
    public Counter model_counter;   
    public modelo.AdministradorClientes model_AdminClientes;
    
    
    private ArrayList<Cliente> listaClientes;
    private String Venta;
    private String Compra;
    
    public Web_Service service = new Web_Service();
    
    /*
    *Este metodo retorna la instancia del controlador
    *@return singlenton: retorna la instancia
    */
    
    /*
    public Controlador getInstance(){
        if(singlenton == null){
            singlenton = new Controlador();
            return singlenton;
        }
        return singlenton;
    }
    */
    
    public Controlador(Principal p,CreacionCounter vista_counter, Counter model_counter){
        this.p = p;
        this.model_counter = model_counter;
        this.vista_counter = vista_counter;
    }
    
    /*
    *Este metodo registra un counter al programa
    *@param pNombre : Nombre del counter
    *@param pId : Identificacion del counter a crear
    *@param pDireccion : Direccion fisica del counter
    *@param pCantCasilleros : Numero de casilleros del counter
    *@return true: Si el counter se agrego correctamente
    *@return false: Si el counter ya existia, no se agrega
    */
    
    public void Iniciar(){
        this.vista_counter.setTitle("Creación Counter");
        this.vista_counter.setLocationRelativeTo(null);
        this.vista_counter.jButtonCrearCounter.addActionListener(this);
        this.vista_tablaCounter.jButton1.addActionListener(this);     
        this.p.jButton1.addActionListener(this); 
    }
    
    public void actionPerformed(ActionEvent e){
        //Evento para mostrar la vista tabla counter 
        if(e.getSource() == p.jButton1){
            vista_tablaCounter.show();
        }
        
        // Vista Creacion, al dar clic al boton CREAR se aplica la accion siguiente
        if(e.getSource() == vista_counter.jButtonCrearCounter){
            String nombre = vista_counter.txt_nombre.getText();
            int cedula = Integer.parseInt(vista_counter.txt_CedulaJuridica.getText());
            String dir = vista_counter.txt_Dir.getText();
            int cantidad = Integer.parseInt(vista_counter.txt_cantidad.getText());                

            model_counter.InsertarCounter(new Counter(nombre, cedula, dir, cantidad,null,null)); 

            vista_interfaz = new Interfaz();
            vista_interfaz.txt_titulo.setText(nombre);
            vista_interfaz.show();
        }
               
        //Evento de la vista tabla counter boton Buscar para mostrar la informacion en la tabla
        if(e.getSource() == vista_tablaCounter.jButton1){
            Tabla_tablaCounter(vista_tablaCounter.tabla_counter);
            System.out.println("hoal buscar");
        }
        
        
    }        
    
    //Metodo para llenar la tabla de la vista Tablas_Counters
    public void Tabla_tablaCounter(JTable table){
        String filas [][] = new String[model_counter.lista_counter.size()][4];
        
        for(int i = 0; i < model_counter.lista_counter.size();i++){
            filas[i][0] = model_counter.lista_counter.get(i).getNombre();
            filas[i][1] = String.valueOf(model_counter.lista_counter.get(i).getCedulaJuridica());
            filas[i][2] = model_counter.lista_counter.get(i).getDireccion();
            filas[i][3] = String.valueOf(model_counter.lista_counter.get(i).getCantCasilleros());
        }
        
        table.setModel(new javax.swing.table.DefaultTableModel(
            filas,
            new String [] {
                "Nombre", "Cédula Juridica", "Dirección", "Casilleros Disponibles"
            }
        ));
    }
    
    public ArrayList<Counter> MostrarCounter(){
        
        return model_counter.lista_counter;
        
    }
    
    public void Inicar_Mostrar_Counter(){
        vista_tablaCounter = new TablaCounters();
        vista_tablaCounter.show();
        
    }
    
    public void Iniciar_Mostrar_AdminClientes(){
        
        model_AdminClientes = new modelo.AdministradorClientes();
        this.vista_AdminClientes = new vista.AdministradorClientes();
        this.vista_AdminClientes.Registrar.addActionListener(this);
        vista_AdminClientes.show();
        
        
    }
    /*
    *Este metodo registra un cliente en el programa
    *@param pId: Identificacion del cliente
    *@param pNombre: Nombre del cliente
    *@param pCorreo: Correo del cliente
    *@param pTelefono: Telefono del cliente
    *@param pDireccion: Direccion del cliente
    *@param esMujer: Si la persona es mujer
    *@param fechaDeNacimiento: Fecha de nacimiento de persona
    *@return true: El cliente se registro correctamente
    *@return false: El cliente no se pudo registrar porque ya existe
    */
    public boolean registrarCliente(int pId, String pNombre, String pCorreo,
            int pTelefono, int pDireccion, boolean esMujer, String fechaDeNacimiento){
       
        
        Cliente posible = new Cliente(pId,pNombre,pCorreo,pTelefono,pDireccion,esMujer,fechaDeNacimiento);
        for(int i = 0; i < listaClientes.size();i++){
            if(posible.equals(listaClientes.get(i))){
                return false;
            }
        }
        listaClientes.add(posible);
        return true;
    }
    /*
    *Este metodo valida que el formato del numero de telefono sea correcto
    *@param pTelefono: Numero de telefono a verificar
    *@return true: Si el numero tiene 8 digitos
    *@return false: Si el numero no tiene 8 digitos
    */
    private boolean validarTelefono(int pTelefono){
        return ((9999999 < pTelefono) && (pTelefono< 100000000));
    }
    /*
    *Metodo en desarrollo
    */
    private boolean validarCorreo(String pCorreo){
        return true;
        
        
    }
    /*
    *Este metodo modifica el correo de un cliente
    *@param pId: Es el ID del cliente a modificar
    *@param pCorreo: Es el nuevo correo del cliente
    *@return true: En caso de modificar correctamente los datos
    *@return false: En caso de no modificar los datos debido a que no se encontro
    *el ID
    */
    public boolean modificarCorreoCliente(int pId, String pCorreo){
        for(int i = 0; i<listaClientes.size();i++){
            if(listaClientes.get(i).getpId() == pId){
                listaClientes.get(i).setpCorreo(pCorreo);
                return true;
            }
        }
        return false;
    }
    /*
    *Este metodo modifica la direccion de un cliente
    *@param pId: Es el ID del cliente a modificar
    *@param pDireccion: Es la nueva direccion del cliente
    *@return true: En caso de modificar correctamente los datos
    *@return false: En caso de no modificar los datos debido a que no se encontro
    *el ID
    */
    public boolean modificarDireccionCliente(int pId, String pDireccion){
        for(int i = 0; i<listaClientes.size();i++){
            if(listaClientes.get(i).getpId() == pId){
                listaClientes.get(i).setpDireccion(pDireccion);
                return true;
            }
        }
        return false;
    }
    /*
    *Este metodo modifica el telefono de un cliente
    *@param pId: Es el ID del cliente a modificar
    *@param pTelefono: Es el nuevo telefono del cliente
    *@return true: En caso de modificar correctamente los datos
    *@return false: En caso de no modificar los datos debido a que no se encontro
    *el ID
    */
    public boolean modificarTelefonoCliente(int pId, int pTelefono){
        for(int i = 0; i<listaClientes.size();i++){
            if(listaClientes.get(i).getpId() == pId){
                //listaClientes.get(i).setpTelefono(pTelefono);
                return true;
            }
        }
        return false;
    }
    /*
    *Este metodo consulta los datos de un cliente especifico
    *@param pId: Es el ID de la persona a consultar
    *@return : Retorna un string con los datos del cliente o retorna null si
    *no se encuentra el cliente
    */
    public String consultarDatosCliente(int pId){
        for(int i = 0; i<listaClientes.size();i++){
            if(listaClientes.get(i).getpId() == pId){
                return listaClientes.get(i).toString();
            }
        }
        return null;
        
    }
    /*
    *Este metodo elimina un cliente
    *@param pId: La identificacion del cliente a eliminar
    *@return true: En caso de eliminar correctamente 
    *@return false: En caso de no encontrar al cliente a eliminar
    */
    public boolean eliminarCliente(int pId){
        for(int i = 0; i<listaClientes.size();i++){
            if(listaClientes.get(i).getpId() == pId){
                listaClientes.remove(i);
                return true;
                
            }
        }
        return false;
    }
    /*
    *Este metodo retorna los clientes registrados
    *@return listaClientes: Lista de clientes registrados
    */
    public ArrayList<Cliente> obtenerClientesRegistrados(){
        return listaClientes;
    }

    /**
     * @return the Venta
     */
    public String getVenta() {
        
        return service.Send_Request_Soap("318", getDate(), getDate(), "Venta");
    }

    /**
     * @return the Compra
     */
    public String getCompra() {
        return service.Send_Request_Soap("317", getDate(), getDate(), "Compra");
    }
    
    public String getDate(){
        
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");        
        
        return formatter.format(date);
    }
  
}
