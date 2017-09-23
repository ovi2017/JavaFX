import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import javax.swing.*;
import java.util.Optional;


//**Author: Ovidio Castillo
//Purpose: To convert cm to Feet and inches using Joptionpane and Java FX
//Date: 09/17/2017
//Contact: oc210@email.vccs.edu
//

public class JavaFX extends Application {
    public void start(Stage primaryStage) {

        //uses Joption pane to do input dialog
        String height = JOptionPane.showInputDialog("Enter Your Height in Centimeters");


        //Java Input dialog
        TextInputDialog textInputDialog = new TextInputDialog(height);
        textInputDialog.setTitle("MY CONVERTER");
        textInputDialog.setHeaderText("Convert to Feet and Inches");
        textInputDialog.setContentText("Enter Your Height In Centimeters");
        textInputDialog.setX(800);
        textInputDialog.setY(5);
        Optional<String> result = textInputDialog.showAndWait();

        //logic
        double heightInCm = Double.parseDouble(result.get());
        double heightInInches = heightInCm*0.39;
        int heightInFeet = (int) (heightInInches/12);   //casting
        int remainderHeightInInches = (int)(heightInInches%12);

        //Fx to display Info
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Height Converter");
        alert.setHeaderText("Your Height is ");
        alert.setContentText(heightInFeet + " feet " + remainderHeightInInches + " inches");
        alert.setX(800);
        alert.setY(800);
        alert.showAndWait();
    }
}