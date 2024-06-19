import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class ControllerReloj {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cmdAdelantarHora;

    @FXML
    private Button cmdAdelantarMin;

    @FXML
    private Button cmdAdelantarSeg;

    @FXML
    private Button cmdRetrocederHora;

    @FXML
    private Button cmdRetrocederMin;

    @FXML
    private Button cmdRetrocederSeg;

    @FXML
    private ImageView imgReloj;

    @FXML
    private Label lblHoras;

    @FXML
    private Label lblMinutos;

    @FXML
    private Label lblSegundos;

    @FXML
    private Label lblTitulo;

    @FXML
    private TextField txtHoras;

    @FXML
    private TextField txtMinutos;

    @FXML
    private TextField txtSegundos;

    private Reloj reloj;

    @FXML
    void adelantarHor(ActionEvent event) {
        reloj.avanzarHorario();
        actualizarGUI();
    }

    @FXML
    void adelantarMin(ActionEvent event) {
        reloj.avanzarMinutero();
        actualizarGUI();
    }

    @FXML
    void adelantarSeg(ActionEvent event) {
        reloj.avanzarSegundero();
        actualizarGUI();
    }

    @FXML
    void retrocederHor(ActionEvent event) {
        reloj.retrocederHorario();
        actualizarGUI();
    }

    @FXML
    void retrocederMin(ActionEvent event) {
        reloj.retrocederMinutero();
        actualizarGUI();
    }

    @FXML
    void retrocederSeg(ActionEvent event) {
        reloj.retrocederSegundero();
        actualizarGUI();
    }

    private void actualizarGUI(){
        txtHoras.setText(String.valueOf(reloj.getHoras()));
        txtMinutos.setText(String.valueOf(reloj.getMinutos()));
        txtSegundos.setText(String.valueOf(reloj.getSegundos()));
    }

    @FXML
    void initialize() {
        assert cmdAdelantarHora != null : "fx:id=\"cmdAdelantarHora\" was not injected: check your FXML file 'Untitled'.";
        assert cmdAdelantarMin != null : "fx:id=\"cmdAdelantarMin\" was not injected: check your FXML file 'Untitled'.";
        assert cmdAdelantarSeg != null : "fx:id=\"cmdAdelantarSeg\" was not injected: check your FXML file 'Untitled'.";
        assert cmdRetrocederHora != null : "fx:id=\"cmdRetrocederHora\" was not injected: check your FXML file 'Untitled'.";
        assert cmdRetrocederMin != null : "fx:id=\"cmdRetrocederMin\" was not injected: check your FXML file 'Untitled'.";
        assert cmdRetrocederSeg != null : "fx:id=\"cmdRetrocederSeg\" was not injected: check your FXML file 'Untitled'.";
        assert imgReloj != null : "fx:id=\"imgReloj\" was not injected: check your FXML file 'Untitled'.";
        assert lblHoras != null : "fx:id=\"lblHoras\" was not injected: check your FXML file 'Untitled'.";
        assert lblMinutos != null : "fx:id=\"lblMinutos\" was not injected: check your FXML file 'Untitled'.";
        assert lblSegundos != null : "fx:id=\"lblSegundos\" was not injected: check your FXML file 'Untitled'.";
        assert lblTitulo != null : "fx:id=\"lblTitulo\" was not injected: check your FXML file 'Untitled'.";
        assert txtHoras != null : "fx:id=\"txtHoras\" was not injected: check your FXML file 'Untitled'.";
        assert txtMinutos != null : "fx:id=\"txtMinutos\" was not injected: check your FXML file 'Untitled'.";
        assert txtSegundos != null : "fx:id=\"txtSegundos\" was not injected: check your FXML file 'Untitled'.";

        reloj= new Reloj();
        actualizarGUI();
    }

}
