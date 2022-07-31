package lesson5.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lesson2_classes.auto_task.Engine;

public class AddEngineForm {

    public TextField numberField;
    public TextField powerField;
    public TextField volumeField;
    @FXML
    private ComboBox<Engine.Type> typeComboBox;

    private TableView<Engine> enginesTable;

    private Engine engine;

    @FXML
    private void initialize() {
        for (Engine.Type type : Engine.Type.values()) {
            typeComboBox.getItems().add(type);
        }
        typeComboBox.getSelectionModel().select(0);
    }

    @FXML
    private void onSave() {
        String numberFieldText = numberField.getText();
        if (!checkNumber(numberFieldText)) {
            new Alert(Alert.AlertType.WARNING, "Номер должен состоять только из цифр и латинских букв").showAndWait();
            return;
        }

        double power;
        try {
            power = Double.parseDouble(powerField.getText());
        } catch (NumberFormatException ex) {
            new Alert(Alert.AlertType.WARNING, "Мощность должна быть числом").showAndWait();
            return;
        }

        double volume;
        try {
            volume = Double.parseDouble(volumeField.getText());
        } catch (NumberFormatException ex) {
            new Alert(Alert.AlertType.WARNING, "Объем должна быть числом").showAndWait();
            return;
        }

        Engine.Type type = typeComboBox.getValue();

        if (engine != null) {
            engine.setNumber(numberFieldText);
            engine.setPower(power);
            engine.setType(type);
            engine.setVolume(volume);
            enginesTable.refresh();
        } else {
            Engine engine = new Engine(numberFieldText, type, power, volume);
            enginesTable.getItems().add(engine);
        }

        Stage stage = (Stage) numberField.getScene().getWindow();
        stage.close();
    }

    private boolean checkNumber(String number) {
        for (char c : number.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public void setEnginesTable(TableView<Engine> enginesTable) {
        this.enginesTable = enginesTable;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
        numberField.setText(engine.getNumber());
        volumeField.setText(String.valueOf(engine.getVolume()));
        powerField.setText(String.valueOf(engine.getPower()));
        typeComboBox.getSelectionModel().select(engine.getType());
    }
}
