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
public class Entregable {
    private int id;
    private TipoEntregable tipo;
    private boolean estado; //F para No entregado V Para entregado
    private String descripcion;
    private String remitente;
    private int idRemitente;
    private String fechaIngreso;
    private String fechaRetiro;
    private long peso;
    private Sobre sobre;
    private Paquete paquete;
    private Revista revista;
    private long costoArticulo;

    public Entregable() {
    }

    public Entregable(int id, TipoEntregable tipo, boolean estado, String descripcion, String remitente, String fechaIngreso, String fechaRetiro, long peso, Sobre sobre, Paquete paquete, Revista revista, long costoArticulo) {
        this.id = id;
        this.tipo = tipo;
        this.estado = estado;//TRUE SI NO HA SIDO RETIRADO, FALSE SI YA SE RETIRO
        this.descripcion = descripcion;
        this.remitente = remitente;
        this.fechaIngreso = fechaIngreso;
        this.fechaRetiro = fechaRetiro;
        this.peso = peso;
        this.sobre = sobre;
        this.paquete = paquete;
        this.revista = revista;
        this.costoArticulo = costoArticulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoEntregable getTipo() {
        return tipo;
    }

    public void setTipo(TipoEntregable tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdRemitente() {
        return idRemitente;
    }

    public void setIdRemitente(int idRemitente) {
        this.idRemitente = idRemitente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(String fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public long getPeso() {
        return peso;
    }

    public void setPeso(long peso) {
        this.peso = peso;
    }

    public Sobre getSobre() {
        return sobre;
    }

    public void setSobre(Sobre sobre) {
        this.sobre = sobre;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    public long getCostoArticulo() {
        return costoArticulo;
    }

    public void setCostoArticulo(long costoArticulo) {
        this.costoArticulo = costoArticulo;
    }

    @Override
    public String toString() {
        return "Entregable{" 
                + "id=" + id 
                + ", tipo=" + tipo 
                + ", estado=" + estado 
                + ", descripcion=" + descripcion 
                + ", remitente=" + remitente 
                + ", fechaIngreso=" + fechaIngreso 
                + ", fechaRetiro=" + fechaRetiro 
                + ", peso=" + peso 
                + ", sobre=" + sobre 
                + ", paquete=" + paquete 
                + ", revista=" + revista 
                + ", costoArticulo=" + costoArticulo + '}';
    }
 
    
}