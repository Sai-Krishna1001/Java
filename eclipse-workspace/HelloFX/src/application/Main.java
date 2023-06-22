package application;

import javafx.scene.shape.Rectangle;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.ColorInput;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Stage stage = new Stage();
		Group root = new Group();
		Scene scene = new Scene(root,600,600,Color.BLACK);
		
		Image icon = new Image("C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\HelloFX\\\\images\\\\eagel.png");
		
		
		Text text = new Text();
		text.setText("WHOOOOOA!!");
		text.setX(50);
		text.setY(50);
		text.setFont(Font.font("Verdana",50));
		text.setFill(Color.LIMEGREEN);
		
		Line line = new Line();
		line.setStartX(200);
		line.setStartY(200);
		line.setEndX(500);
		line.setEndY(200);
		line.setStrokeWidth(5);
		line.setStroke(Color.RED);
		line.setOpacity(0.5);
		line.setRotate(90);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setX(100);
		rectangle.setY(100);
		rectangle.setWidth(200);
		rectangle.setHeight(100);
		rectangle.setFill(Color.BLUE);
		rectangle.setStrokeWidth(5);
		rectangle.setStroke(Color.RED);
		
		Polygon triangle = new Polygon();
		triangle.getPoints().setAll(
				200.0,200.0,
				300.0,300.0,
				200.0,300.0
				);
		triangle.setFill(Color.YELLOW );
		
		Circle circle = new Circle();
		circle.setCenterX(350);
		circle.setCenterY(350);
		circle.setRadius(50);
		circle.setFill(Color.MAGENTA);
		
		Image image = new Image("C:\\Users\\admin\\eclipse-workspace\\Java GUI\\images\\smile.png");
		ImageView imageView = new ImageView(image);
		imageView.setX(400);
		imageView.setY(400);
		
		root.getChildren().add(imageView);
		root.getChildren().add(circle);
		root.getChildren().add(triangle);
		root.getChildren().add(rectangle);
		root.getChildren().add(line);
		root.getChildren().add(text);
		
		stage.setTitle("Drawing Stuff");
		stage.getIcons().add(icon);
		stage.setScene(scene);
		stage.show();
		
		
	}
}
