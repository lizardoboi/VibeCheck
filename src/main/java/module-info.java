module com.example.vibecheck {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vibecheck to javafx.fxml;
    exports com.example.vibecheck;
}