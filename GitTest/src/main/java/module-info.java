module net.angkoe.spiel.angkoe.spielinsel.gittest {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.angkoe.spiel.angkoe.spielinsel.gittest to javafx.fxml;
    exports net.angkoe.spiel.angkoe.spielinsel.gittest;
}