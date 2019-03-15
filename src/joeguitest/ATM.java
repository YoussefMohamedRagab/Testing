/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joeguitest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */
public class ATM extends Application{
    
    public static void main(String[] args) {
        launch(args);
    }
    
     
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        primaryStage.setTitle("ATM");
        
       JoeGuiTest loginform = new JoeGuiTest(primaryStage);
       HomeScreen homescreen = new HomeScreen(primaryStage);
       
       loginform.PrepareScene();
       homescreen.PrepareScene();
       
       loginform.setHomescreen(homescreen);
       homescreen.setLoginform(loginform);
       
        primaryStage.setScene(loginform.getscene());
        primaryStage.show();
        
        
    }
    
    
}
