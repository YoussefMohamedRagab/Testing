/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joeguitest;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */
public class JoeGuiTest{
    Stage stage;
    Scene scene;
    TestAuthentication Authentication;
    HomeScreen homescreen;

    public JoeGuiTest(Stage stage){
        this.stage = stage;
    }
   
    
    
    public void PrepareScene(){
       Authentication = new TestAuthentication();
        
        
        // drawing...................................................
        Label usernamelabel = new Label("username: ");
        Label passwordlabel = new Label("Password: ");
        TextField usernameField = new TextField();
        PasswordField passwordfield = new PasswordField();
        Button submit = new Button("Submit");
        Label Validationlabel = new Label();
        
        
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Errpr");
                alert.setHeaderText(null);
                alert.setContentText("Wrong user name or password");
        
        GridPane grid = new GridPane();
        grid.add(usernamelabel, 0, 0);
        grid.add(passwordlabel, 0, 1);
        grid.add(usernameField, 1, 0);
        grid.add(passwordfield, 1, 1);
        grid.add(submit, 1, 2);
        grid.add(Validationlabel,1,3);
        
        
        
        // end of drawing................................................
        
        //LoginActions................................................
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                String pin= passwordfield.getText();
                boolean valid = Authentication.Validation(pin);
                if(valid){
                    Validationlabel.setText("Welcome");
                    stage.setScene(homescreen.getscene());
                }
                else
                {
                 
                    Validationlabel.setText("Wrong");
                    alert.showAndWait();
                }
                
                
            }
        });
       scene = new Scene(grid, 600, 400);
    }
    
    public Scene getscene(){
        return this.scene;
    }

    public void setHomescreen(HomeScreen homescreen) {
        this.homescreen = homescreen;
    }

    

    
    
    
}
