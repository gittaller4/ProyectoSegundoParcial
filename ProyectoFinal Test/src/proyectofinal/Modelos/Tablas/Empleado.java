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
public class Empleado {
    
    private int idEmpleado;
    private int idCargo;
    private int idEdificio;
    private String nombreUsuario;
    private String passUsuario;
    private String nombreEmpleado;
    private String contactoEmpleado;
    private Date fechaContratado;
    private Date fechaFinContratado;

    public Empleado() {
        this.idEmpleado = 0;
        this.idCargo = 0;
        this.idEdificio = 0;
        this.nombreUsuario = "";
        this.passUsuario = "";
        this.nombreEmpleado = "";
        this.contactoEmpleado = "";
        this.fechaContratado = null;
        this.fechaFinContratado = null;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public int getIdEdificio() {
        return idEdificio;
    }

    public void setIdEdificio(int idEdificio) {
        this.idEdificio = idEdificio;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassUsuario() {
        return passUsuario;
    }

    public void setPassUsuario(String passUsuario) {
        this.passUsuario = passUsuario;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getContactoEmpleado() {
        return contactoEmpleado;
    }

    public void setContactoEmpleado(String contactoEmpleado) {
        this.contactoEmpleado = contactoEmpleado;
    }

    public Date getFechaContratado() {
        return fechaContratado;
    }

    public void setFechaContratado(Date fechaContratado) {
        this.fechaContratado = fechaContratado;
    }

    public Date getFechaFinContratado() {
        return fechaFinContratado;
    }

    public void setFechaFinContratado(Date fechaFinContratado) {
        this.fechaFinContratado = fechaFinContratado;
    }
    
    
}
