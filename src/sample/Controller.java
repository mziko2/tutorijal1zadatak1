package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label isprintaj;

    public void say(ActionEvent actionEvent) {

        isprintaj.setText("Hello World!");
    }
}
