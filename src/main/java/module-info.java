module com.example.coverageimpossibile {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.coverageimpossibile to javafx.fxml;
    exports com.example.coverageimpossibile;
}