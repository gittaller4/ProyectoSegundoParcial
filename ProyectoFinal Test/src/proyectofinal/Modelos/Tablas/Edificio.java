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
public class Edificio {
    
    private int idEdificios;
    private int idCategoriasEdificios;
    private String direccionEdificios;

    public Edificio(int idEdificios, int idCategoriasEdificios, String direccionEdificios) {
        this.idEdificios = idEdificios;
        this.idCategoriasEdificios = idCategoriasEdificios;
        this.direccionEdificios = direccionEdificios;
    }

    public int getIdEdificios() {
        return idEdificios;
    }

    public void setIdEdificios(int idEdificios) {
        this.idEdificios = idEdificios;
    }

    public int getIdCategoriasEdificios() {
        return idCategoriasEdificios;
    }

    public void setIdCategoriasEdificios(int idCategoriasEdificios) {
        this.idCategoriasEdificios = idCategoriasEdificios;
    }

    public String getDireccionEdificios() {
        return direccionEdificios;
    }

    public void setDireccionEdificios(String direccionEdificios) {
        this.direccionEdificios = direccionEdificios;
    }
    
    
    
}
