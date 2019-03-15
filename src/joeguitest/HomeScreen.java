/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joeguitest;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */
public class HomeScreen {
    Stage stage;
    Scene scene;
    JoeGuiTest loginform;
    
    public HomeScreen(Stage stage){
       this.stage = stage;
    }
    
    
    public void PrepareScene(){
        
        Label welcome = new Label("Welcome");
        Button deposit = new Button("Deposit");
        Button withdraw = new Button("Withdraw");
        Button balanceinquiry = new Button("BalanceInquiry");
        Button previous = new Button("Previous");
        Button next = new Button("Next");
        Button logout = new Button("Logout");
        Label separator = new Label("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        TextField depositfield = new TextField("Enter your value here");
        TextField withdrawfield = new TextField("Enter your value here");
        Label balanceinquirylabel = new Label();
        
        
        
        GridPane grid = new GridPane();
        grid.add(welcome, 0, 0);
        grid.add(deposit, 0, 1);
        grid.add(withdraw, 0, 2);
        grid.add(balanceinquiry, 0, 3);
        grid.add(previous, 0, 4);
        grid.add(next, 0, 5);
        grid.add(separator, 0, 6);
        grid.add(logout, 0, 7);
        grid.add(depositfield, 1, 1);
        grid.add(withdrawfield, 1, 2);
        grid.add(balanceinquirylabel, 1, 3);
        
        
        
        
        logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                stage.setScene(loginform.getscene());
                
            }
        });
        
    
        
        
        
        
        scene = new Scene(grid, 600, 400);
        
        
    }
    public Scene getscene(){
        return scene;
    }

    public void setLoginform(JoeGuiTest loginform) {
        this.loginform = loginform;
    }
    
    
    
    
}
