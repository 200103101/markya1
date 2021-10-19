import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class EX146 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle rectangle = new Rectangle(i*30,j*30,30, 30);
                if ((i + j) % 2 == 0)
                    rectangle.setFill(Color.WHITE);
                pane.getChildren().add(rectangle);
            }
        }
        Scene scene = new Scene(pane, 240, 240);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}