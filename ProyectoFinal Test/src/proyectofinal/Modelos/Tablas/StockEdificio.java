/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Modelos.Tablas;

/**
 *
 * @author Luis Andres
 */
public class StockEdificio {
    
    private int idStockEdificio;
    private int idProducto;
    private int idEdificio;
    private int cantidadProductoEdificio;

    public StockEdificio(int idStockEdificio, int idProducto, int idEdificio, int cantidadProductoEdificio) {
        this.idStockEdificio = idStockEdificio;
        this.idProducto = idProducto;
        this.idEdificio = idEdificio;
        this.cantidadProductoEdificio = cantidadProductoEdificio;
    }

    public int getIdStockEdificio() {
        return idStockEdificio;
    }

    public void setIdStockEdificio(int idStockEdificio) {
        this.idStockEdificio = idStockEdificio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdEdificio() {
        return idEdificio;
    }

    public void setIdEdificio(int idEdificio) {
        this.idEdificio = idEdificio;
    }

    public int getCantidadProductoEdificio() {
        return cantidadProductoEdificio;
    }

    public void setCantidadProductoEdificio(int cantidadProductoEdificio) {
        this.cantidadProductoEdificio = cantidadProductoEdificio;
    }
    
    
}
