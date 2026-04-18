import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class pr35 extends Application {
    public void start(Stage stage) {
        HBox root = new HBox(20);
        root.setAlignment(Pos.CENTER);

        root.getChildren().add(createBar("Projects — 20%", 20, Color.RED));
        root.getChildren().add(createBar("Quizzes — 10%", 10, Color.BLUE));
        root.getChildren().add(createBar("Midterm — 30%", 30, Color.GREEN));
        root.getChildren().add(createBar("Final — 40%", 40, Color.ORANGE));

        Scene scene = new Scene(root, 500, 400);

        stage.setTitle("Grade Distribution Chart");
        stage.setScene(scene);
        stage.show();
    }

    private VBox createBar(String text, int percentage, Color color) {
        double height = percentage * 5;

        Rectangle rect = new Rectangle(50, height);
        rect.setFill(color);

        Label label = new Label(text);

        VBox box = new VBox(10);
        box.setAlignment(Pos.BOTTOM_CENTER);

        box.getChildren().addAll(rect, label);

        return box;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
