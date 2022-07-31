package lesson5.javafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import lesson2_classes.auto_task.Engine;

import java.io.IOException;
import java.util.Optional;

public class MainFormController {

    @FXML
    private TableView<Engine> enginesTable;
    public TableColumn<Engine, String> numberCol;
    public TableColumn<Engine, String> typeCol;
    public TableColumn<Engine, Double> powerCol;
    public TableColumn<Engine, Double> volumeCol;

    @FXML
    private void initialize() {
        numberCol.setCellValueFactory(new PropertyValueFactory<>("number"));
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        powerCol.setCellValueFactory(new PropertyValueFactory<>("power"));
        volumeCol.setCellValueFactory(new PropertyValueFactory<>("volume"));

        Engine engine = new Engine("123123", Engine.Type.PETROL, 125, 1.6);
        enginesTable.getItems().add(engine);
    }

    @FXML
    private void onAdd() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view/addCar-form.fxml"));
        stage.setScene(new Scene(loader.load()));
        MainFormController controller = loader.getController();
        stage.show();
    }

    @FXML
    private void onAddEngine() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view/addEngine-form.fxml"));

        stage.setScene(new Scene(loader.load()));
        AddEngineForm controller = loader.getController();
        controller.setEnginesTable(enginesTable);

        stage.setTitle("Двигатель");
        stage.setResizable(false);
        stage.sizeToScene();
        stage.show();
    }

    @FXML
    private void onDeleteEngine() {
        Optional<ButtonType> buttonType = new Alert(Alert.AlertType.CONFIRMATION, "Вы действительно хотите удалить запись?").showAndWait();
        if (buttonType.isPresent()) {
            if (buttonType.get() == ButtonType.OK) {
                Engine engine = enginesTable.getSelectionModel().getSelectedItem();
                if (engine != null) {
                    enginesTable.getItems().remove(engine);
                }
            }
        }
    }

    @FXML
    private void onEditEngine() throws IOException {
        Engine engine = enginesTable.getSelectionModel().getSelectedItem();
        if (engine == null) {
            return;
        }

        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view/addEngine-form.fxml"));

        stage.setScene(new Scene(loader.load()));
        AddEngineForm controller = loader.getController();
        controller.setEnginesTable(enginesTable);
        controller.setEngine(engine);

        stage.setTitle("Двигатель");
        stage.setResizable(false);
        stage.sizeToScene();
        stage.show();
    }
}
