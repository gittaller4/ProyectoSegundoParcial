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
public class Venta {
    
    private int idVenta;
    private int idEmpleado;
    private int idCliente;
    private int idFormaPago;
    private int idEdificio;
    private Date fechaVenta;
    private Date fechaFactElectronica;

    public Venta() {
        this.idVenta = 0;
        this.idEmpleado = 0;
        this.idCliente = 0;
        this.idFormaPago = 0;
        this.idEdificio = 0;
        this.fechaVenta = null;
        this.fechaFactElectronica = null;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdFormaPago() {
        return idFormaPago;
    }

    public void setIdFormaPago(int idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

    public int getIdEdificio() {
        return idEdificio;
    }

    public void setIdEdificio(int idEdificio) {
        this.idEdificio = idEdificio;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Date getFechaFactElectronica() {
        return fechaFactElectronica;
    }

    public void setFechaFactElectronica(Date fechaFactElectronica) {
        this.fechaFactElectronica = fechaFactElectronica;
    }
    
    
    
}
