/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Modelos.Tablas;

import java.util.Date;

/**
 *
 * @author Luis Andres
 */
public class Entrega {
    
    private int idEntrega;
    private int idEmpleado;
    private int idVenta;
    private int idRuta;
    private String direccion;
    private Date fechaEntrega;
    private String novedades;

    public Entrega(int idEntrega, int idEmpleado, int idVenta, int idRuta, String direccion, Date fechaEntrega, String novedades) {
        this.idEntrega = idEntrega;
        this.idEmpleado = idEmpleado;
        this.idVenta = idVenta;
        this.idRuta = idRuta;
        this.direccion = direccion;
        this.fechaEntrega = fechaEntrega;
        this.novedades = novedades;
    }

    public int getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(int idEntrega) {
        this.idEntrega = idEntrega;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getNovedades() {
        return novedades;
    }

    public void setNovedades(String novedades) {
        this.novedades = novedades;
    }
    
    
    
}
