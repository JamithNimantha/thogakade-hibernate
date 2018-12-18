package lk.ijse.edu.thogakade.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DashController {

    @FXML
    private Button btnCustomer;

    @FXML
    private Button btnOrder;

    @FXML
    private Button btnItem;

    @FXML
    void btnCustomerOnAction(ActionEvent event) throws IOException {
        //Stage stage = (Stage) btnCustomer.getScene().getWindow();
        Parent parent = FXMLLoader.load(this.getClass().getResource("/lk/ijse/edu/thogakade/view/Customer.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void btnItemOnAction(ActionEvent event) throws IOException {
        //Stage stage = (Stage) btnItem.getScene().getWindow();
        Parent parent = FXMLLoader.load(this.getClass().getResource("/lk/ijse/edu/thogakade/view/Item.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void btnOrderOnAction(ActionEvent event) throws IOException {
        //Stage stage= (Stage) btnOrder.getScene().getWindow();
        Parent parent =FXMLLoader.load(this.getClass().getResource("/lk/ijse/edu/thogakade/view/Order.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(parent);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.show();
    }

}
