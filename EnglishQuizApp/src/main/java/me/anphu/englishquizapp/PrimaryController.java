package me.anphu.englishquizapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import me.anphu.themes.ThemeTypes;
import me.anphu.utils.MyAlert;

public class PrimaryController implements Initializable {
    @FXML private ComboBox<ThemeTypes> cbThemes; // @FXML danh dau doi tuong combobox da tao va chi su dung
    
    //Goi khi giao dien hien len de nap gia tri vao combobox chinh nen
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.cbThemes.setItems(FXCollections.observableArrayList(ThemeTypes.values()));
    }
    
    public void managesQuestions(ActionEvent e) {
        MyAlert.getInstance().showAlert("Coming soon...");
    }
    
    public void practices(ActionEvent e) {
        MyAlert.getInstance().showAlert("Coming soon...");
    }
    
    public void exams(ActionEvent e) {
        MyAlert.getInstance().showAlert("Coming soon...");
    }

    public void changeTheme(ActionEvent e) {
        switch (this.cbThemes.getSelectionModel().getSelectedItem()) {
            case DARK:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("darkstyles.css").toExternalForm());
                break;
            case LIGHT:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("lightstyles.css").toExternalForm());
                break;
            default:
                this.cbThemes.getScene().getRoot().getStylesheets().clear();
                this.cbThemes.getScene().getRoot().getStylesheets().add(App.class.getResource("defaultstyles.css").toExternalForm());
        }
    }
}
