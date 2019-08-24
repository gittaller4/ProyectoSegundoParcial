/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Vistas;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import proyectofinal.Constantes;
import proyectofinal.Controladores.JefeBodegaController;

/**
 *
 * @author Luis Andres
 */
public class JefeBodegaRutaView {
    
    private static Scene escena;
    
    private VBox panelP;
    private HBox pane1;
    private HBox pane2;
    private HBox pane3;
    private Label nombre;
    public static TextField nombreRuta;
    private Label desc;
    public static TextField descripcionRuta;
    private ListView<String> listView;
    private Button agregar;
    private Button regresar;
    
    public JefeBodegaRutaView(){
        inicializar();
        configurar();
    }
    
    private void inicializar(){
        panelP = new VBox();
        pane1 = new HBox();
        pane2 = new HBox();
        pane3 = new HBox();
        nombre = new Label();
        nombreRuta = new TextField();
        desc = new Label();
        descripcionRuta = new TextField();
        listView = new ListView<>();
        agregar = new Button();
        regresar = new Button();
    }
    
    private void configurar(){
        nombre.setText("Nombre Ruta:");
        nombreRuta.setPromptText("Nombre Cool");
        desc.setText("Descripcion:");
        descripcionRuta.setPromptText("DuranCity-LaJoya-Citymall");
        listView.setItems(JefeBodegaController.rutas);
        listView.getSelectionModel().selectedItemProperty().addListener(JefeBodegaController.changeListenerRutas);

        agregar.setText("Agregar");
        agregar.setOnAction(JefeBodegaController.agregarRuta);
        
        regresar.setText("Regresar");
        regresar.setOnAction(JefeBodegaController.ev);
        
        pane1.getChildren().addAll(nombre,nombreRuta);
        pane2.getChildren().addAll(desc,descripcionRuta);
        pane3.getChildren().addAll(agregar,regresar);
        panelP.getChildren().addAll(pane1,pane2,pane3,listView);
        escena = new Scene(panelP,Constantes.ANCHO,Constantes.ALTO);
    }
    
    public static Scene getEscena(){
        return escena;
    }
    
}
