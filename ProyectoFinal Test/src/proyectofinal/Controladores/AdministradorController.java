/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Controladores;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import proyectofinal.Constantes;
import proyectofinal.Vistas.AdministradorPVPView;
import proyectofinal.Vistas.AdministradorStocksView;
import proyectofinal.Vistas.AdministradorView;
import proyectofinal.Vistas.ProductoView;

/**
 *
 * @author Luis Andres
 */
public class AdministradorController {
    
    private AdministradorView administradorView;
    private static AdministradorStocksView stocks;
    private static AdministradorPVPView pvp;
    private static ProductoView productos;
    
    public AdministradorController(){
        
        administradorView = new AdministradorView();
        stocks = new AdministradorStocksView();
        pvp = new AdministradorPVPView();
        productos = new ProductoView();
        
        Constantes.ESCENARIO.setTitle("Administrador");
        Constantes.ESCENARIO.setScene(administradorView.getEscena());
        Constantes.ESCENARIO.show();
    }
    
    public static final EventHandler<ActionEvent> ev = (ActionEvent event) -> {
        System.out.println("Entrando a stocks por Administrador");
        Constantes.ESCENARIO.setTitle("Administrador - Stocks");
        Constantes.ESCENARIO.setScene(stocks.getEscena());
        Constantes.ESCENARIO.show();
    };
    
    public static final EventHandler<ActionEvent> ev2 = (ActionEvent event) -> {
        System.out.println("Entrando a Precio Venta por Administrador");
        Constantes.ESCENARIO.setTitle("Administrador - Precio Venta");
        Constantes.ESCENARIO.setScene(pvp.getEscena());
        Constantes.ESCENARIO.show();
    };
    
    public static final EventHandler<ActionEvent> ev3 = (ActionEvent event) -> {
        System.out.println("Entrando a Productos por Administrador");
        Constantes.ESCENARIO.setTitle("Administrador - Productos");
        Constantes.ESCENARIO.setScene(productos.getEscena());
        Constantes.ESCENARIO.show();
    };

}
