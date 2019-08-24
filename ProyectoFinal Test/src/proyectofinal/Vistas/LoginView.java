/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Vistas;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import proyectofinal.Constantes;
import proyectofinal.Controladores.LoginController;

/**
 *
 * @author Luis Andres
 */
public class LoginView{
    
    private static Scene escena;
    
    private BorderPane s;
    private HBox hBoxTitulo;
    private VBox vBoxFormulario;
    
    Button btn;
    private Label titulo;
    private Label user;
    private Label pass;
    public static TextField userField;
    public static PasswordField passField;

    public LoginView() {
        inicializarComponentes();
        configurarComponentes();
    }
    
    private void inicializarComponentes(){
        btn = new Button();
        s = new BorderPane();
        titulo = new Label();
        hBoxTitulo = new HBox();
        vBoxFormulario = new VBox();
        user = new Label();
        pass = new Label();
        userField = new TextField();
        passField = new PasswordField();
        
    }
    
    private void configurarComponentes(){
        hBoxTitulo.getChildren().add(titulo);
        hBoxTitulo.setSpacing(10);
        titulo.setText("Inicio de Sesion");
        
        s.setTop(hBoxTitulo);
        
        user.setText("Usuario: ");
        pass.setText("Contraseña: ");
        userField.setPromptText("Usuario007");
        passField.setPromptText("123456");
        vBoxFormulario.getChildren().addAll(user,userField,pass,passField,btn);
        vBoxFormulario.setSpacing(10);
        
        s.setCenter(vBoxFormulario);
        
        btn.setText("Ingresar");
        btn.setOnAction(LoginController.ev);
        
        escena = new Scene(s, Constantes.ANCHO, Constantes.ALTO);
    }
    
    public static Scene getEscena(){
        return escena;
    }
    
    
}
