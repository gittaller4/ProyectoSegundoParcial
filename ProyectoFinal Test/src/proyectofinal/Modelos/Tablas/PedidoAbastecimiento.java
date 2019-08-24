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
public class PedidoAbastecimiento {
    
    private int idPedidoAbastecimiento;
    private int idEmpleado;
    private int idEdificio;
    private Date fechaPedidoAbastecimiento;

    public PedidoAbastecimiento(int idPedidoAbastecimiento, int idEmpleado, int idEdificio, Date fechaPedidoAbastecimiento) {
        this.idPedidoAbastecimiento = idPedidoAbastecimiento;
        this.idEmpleado = idEmpleado;
        this.idEdificio = idEdificio;
        this.fechaPedidoAbastecimiento = fechaPedidoAbastecimiento;
    }

    public int getIdPedidoAbastecimiento() {
        return idPedidoAbastecimiento;
    }

    public void setIdPedidoAbastecimiento(int idPedidoAbastecimiento) {
        this.idPedidoAbastecimiento = idPedidoAbastecimiento;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdEdificio() {
        return idEdificio;
    }

    public void setIdEdificio(int idEdificio) {
        this.idEdificio = idEdificio;
    }

    public Date getFechaPedidoAbastecimiento() {
        return fechaPedidoAbastecimiento;
    }

    public void setFechaPedidoAbastecimiento(Date fechaPedidoAbastecimiento) {
        this.fechaPedidoAbastecimiento = fechaPedidoAbastecimiento;
    }
    
    
}
