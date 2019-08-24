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
public class ProductoVenta {
    
    private int idProductoVenta;
    private int idProducto;
    private int idVenta;
    private int cantidadProductoVenta;

    public ProductoVenta(int idProductoVenta, int idProducto, int idVenta, int cantidadProductoVenta) {
        this.idProductoVenta = idProductoVenta;
        this.idProducto = idProducto;
        this.idVenta = idVenta;
        this.cantidadProductoVenta = cantidadProductoVenta;
    }

    public int getIdProductoVenta() {
        return idProductoVenta;
    }

    public void setIdProductoVenta(int idProductoVenta) {
        this.idProductoVenta = idProductoVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getCantidadProductoVenta() {
        return cantidadProductoVenta;
    }

    public void setCantidadProductoVenta(int cantidadProductoVenta) {
        this.cantidadProductoVenta = cantidadProductoVenta;
    }
    
    
    
}
