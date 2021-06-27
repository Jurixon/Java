package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    public Button btnMain;
    public int LicznikKlik;
    public TextField Licznik;

    public static void onMainBtnAction(ActionEvent actionEvent) {
        LicznikKlik++;
        if(LicznikKlik == 1){
            btnMain.setText("I jeszcze raz!");
        }
        txtLicznik.setText("Kliknięto: " + clickCounter + " razy");
    }