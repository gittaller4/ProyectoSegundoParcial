/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Vistas;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import proyectofinal.Constantes;
import proyectofinal.Controladores.AdministradorController;
import proyectofinal.Controladores.VendedorController;

/**
 *
 * @author Luis Andres
 */
public class AdministradorView {
    
    private static Scene escena;
    private BorderPane panelP;
    private FlowPane panelCentral;
    
    private Label bienvenida;
    private Button op1;
    private Button op2;
    private Button op3;
    
    public AdministradorView(){
        inicializarComponentes();
        configurarComponentes();
    }
    
    private void inicializarComponentes(){
        
        panelP = new BorderPane();
        panelCentral = new FlowPane();
        
        bienvenida = new Label();
        op1 = new Button();
        op2 = new Button();
        op3 = new Button();
        
    }
    
    private void configurarComponentes(){
        
        bienvenida.setText("Bienvenido");
        op1.setText("Stocks");
        op2.setText("Precio de Venta");
        op3.setText("Productos");
        
        op1.setOnAction(AdministradorController.ev);
        op2.setOnAction(AdministradorController.ev2);
        op3.setOnAction(AdministradorController.ev3);
        
        panelCentral.getChildren().addAll(op1,op2,op3);
        
        panelP.setTop(bienvenida);
        panelP.setCenter(panelCentral);
        
        escena = new Scene(panelP,Constantes.ANCHO,Constantes.ALTO);
    }
    
    public static Scene getEscena(){
        return escena;
    }
}
