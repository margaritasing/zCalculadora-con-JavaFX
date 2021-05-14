package org.example;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class Controller {


    @FXML TextField entrada;

    @FXML private void evaluar() {
        String result = Evaluar.eval(entrada.getText());
        entrada.setText(result);
    }

    @FXML private void borrar() {
        entrada.setText("");
    }

    @FXML private void otroBoton(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String nuevaEntrada = entrada.getText() + btn.getText();
        entrada.setText(nuevaEntrada);
    }
}


