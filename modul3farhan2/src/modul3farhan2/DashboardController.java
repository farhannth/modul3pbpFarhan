/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package modul3farhan2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Irvan Nur Rohman
 */
public class DashboardController implements Initializable {
    
    @FXML 
    private Button buttonLogout;
    
    @FXML
    private void handleButtonLogoutAction(ActionEvent event) throws Exception {
        
         Main main = new Main();
         main.changeScene("Main.fxml");
         
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
