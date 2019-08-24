/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Controladores;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import proyectofinal.Constantes;
import proyectofinal.Vistas.GerentePermisosView;
import proyectofinal.Vistas.GerenteTodoView;
import proyectofinal.Vistas.GerenteView;
import proyectofinal.Vistas.ProductoView;

/**
 *
 * @author Luis Andres
 */
public class GerenteController {
    
    private GerenteView gerenteView;
    private static GerenteTodoView todo;
    private static ProductoView productos;
    private static GerentePermisosView permisos;
    
    public GerenteController(){
        gerenteView = new GerenteView();
        todo = new GerenteTodoView();
        productos = new ProductoView();
        permisos = new GerentePermisosView();
        
        Constantes.ESCENARIO.setTitle("Gerente");
        Constantes.ESCENARIO.setScene(gerenteView.getEscena());
        Constantes.ESCENARIO.show();
    }
    
    public static final EventHandler<ActionEvent> ev = (ActionEvent event) -> {
        System.out.println("Entrando a Todo por Gerente");
        Constantes.ESCENARIO.setTitle("Gerente");
        Constantes.ESCENARIO.setScene(todo.getEscena());
        Constantes.ESCENARIO.show();
    };
    
    public static final EventHandler<ActionEvent> ev2 = (ActionEvent event) -> {
        System.out.println("Entrando a Productos por Gerente");
        Constantes.ESCENARIO.setTitle("Gerente");
        Constantes.ESCENARIO.setScene(productos.getEscena());
        Constantes.ESCENARIO.show();
    };
    
    public static final EventHandler<ActionEvent> ev3 = (ActionEvent event) -> {
        System.out.println("Entrando a Permisos por Gerente");
        Constantes.ESCENARIO.setTitle("Gerente");
        Constantes.ESCENARIO.setScene(permisos.getEscena());
        Constantes.ESCENARIO.show();
    };
    
    public static ObservableList<String> opciones = FXCollections.observableArrayList();
    public static ChangeListener changeListener = (ChangeListener<String>) (ObservableValue<? extends String> ov, String old_val, String new_val) -> {
        System.out.println("Diste click en algun item");
    };
    
    
}
