module me.anphu.englishquizapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens me.anphu.englishquizapp to javafx.fxml;
    exports me.anphu.englishquizapp;
}
