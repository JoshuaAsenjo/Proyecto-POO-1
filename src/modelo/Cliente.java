/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.Date;
/**
 *
 * @author Gerson
 */
public class Cliente {
    private int pId;
    private String pNombre;
    private String pCorreo;
    private int pTelefono;
    private String pDireccion;
    private boolean pSexo;
    private Date fechaNacimiento;

    public Cliente() {
    }

    public Cliente(int pId, String pNombre, String pCorreo, int pTelefono, String pDireccion, boolean pSexo, Date fechaNacimiento) {
        this.pId = pId;
        this.pNombre = pNombre;
        this.pCorreo = pCorreo;
        this.pTelefono = pTelefono;
        this.pDireccion = pDireccion;
        this.pSexo = pSexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Cliente(int pId, String pNombre, String pCorreo, int pTelefono, int pDireccion, boolean pSexo, String fechaDeNacimiento) {
        
    }

    public int getpId() {
        return pId;
    }

    public String getpNombre() {
        return pNombre;
    }

    public String getpCorreo() {
        return pCorreo;
    }

    public int getpTelefono() {
        return pTelefono;
    }

    public String getpDireccion() {
        return pDireccion;
    }

    public boolean getpSexo() {
        return pSexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public void setpNombre(String pNombre) {
        this.pNombre = pNombre;
    }

    public void setpCorreo(String pCorreo) {
        this.pCorreo = pCorreo;
    }

    public void setpTelefono(int pTelefono) {
        this.pTelefono = pTelefono;
    }

    public void setpDireccion(String pDireccion) {
        this.pDireccion = pDireccion;
    }

    public void setpSexo(boolean psexo) {
        this.pSexo = psexo;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaNacimiento = fechaDeNacimiento;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return this.pId == other.pId;
    }

    
    
    
    
    
}