import com.sun.xml.internal.ws.addressing.WsaTubeHelperImpl;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class ex1411 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(200,200,100, Color.TRANSPARENT);
        circle.setStroke(Color.BLACK);
        Ellipse ellipse = new Ellipse(160,160,20,15);
        ellipse.setFill(Color.BLACK);
        Ellipse ellipse1 = new Ellipse(240,160,20,15);
        ellipse1.setFill(Color.BLACK);
        Circle circle1 = new Circle(160,160,10);
        circle1.setStroke(Color.BLACK);
        Circle circle2 = new Circle(240,160,10);
        circle2.setStroke(Color.BLACK);
        Arc arc = new Arc(250,240,80,20,10,20);
        arc.setFill(Color.BLACK);
        Pane pane = new Pane(circle,ellipse,ellipse1,circle1,circle2);
        Scene scene = new Scene(pane,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
