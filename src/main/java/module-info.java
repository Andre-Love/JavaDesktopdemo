module com.example.javadesktopdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javadesktopdemo to javafx.fxml;
    exports com.example.javadesktopdemo;
}