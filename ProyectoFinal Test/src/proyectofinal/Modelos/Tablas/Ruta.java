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
public class Ruta {
    
    private int idRuta;
    private String nombreRuta;
    private String descripcionRuta;

    public Ruta() {
        this.idRuta = 0;
        this.nombreRuta = "";
        this.descripcionRuta = "";
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getNombreRuta() {
        return nombreRuta;
    }

    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }

    public String getDescripcionRuta() {
        return descripcionRuta;
    }

    public void setDescripcionRuta(String descripcionRuta) {
        this.descripcionRuta = descripcionRuta;
    }
    
    
    
    
}
