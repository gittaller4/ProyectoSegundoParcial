/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import javafx.application.Application;
import javafx.stage.Stage;
import proyectofinal.Controladores.LoginController;

/**
 *
 * @author Luis Andres
 */
public class ProyectoFinal extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Constantes.ESCENARIO = primaryStage;
        Constantes.ANCHO = 400;
        Constantes.ALTO = 350;
        LoginController loginController = new LoginController();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
