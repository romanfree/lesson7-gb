module com.geekbrains.lesson7gb {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.geekbrains.lesson7gb to javafx.fxml;
    exports com.geekbrains.lesson7gb;
}