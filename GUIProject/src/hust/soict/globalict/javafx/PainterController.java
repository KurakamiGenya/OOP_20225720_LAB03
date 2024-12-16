package hust.soict.globalict.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class PainterController implements Initializable {
    @FXML
    private Pane drawingAreaPane;

    @FXML
    private ToggleGroup Pen_Rubber;

    @FXML
    private RadioButton penButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (penButton == null || Pen_Rubber == null) {
            System.out.println("FXML components are not properly initialized.");
            return;
        }

        // Đặt mặc định chọn Pen khi khởi chạy
        penButton.setSelected(true);
    }

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        if (Pen_Rubber == null) {
            System.out.println("Pen_Rubber is null. Check FXML configuration.");
            return;
        }

        // Kiểm tra công cụ đang được chọn
        RadioButton selectedTool = (RadioButton) Pen_Rubber.getSelectedToggle();
        if (selectedTool == null) {
            System.out.println("No tool selected.");
            return;
        }

        Color drawColor = "Eraser".equals(selectedTool.getText()) ? Color.WHITE : Color.BLACK;

        // Vẽ hình tròn tại vị trí chuột
        Circle newCircle = new Circle(event.getX(), event.getY(), 4, drawColor);
        drawingAreaPane.getChildren().add(newCircle);
    }
}
