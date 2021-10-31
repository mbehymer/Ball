package com.example.ball;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        int WIDTH = 500;
        int HEIGHT = 500;
        Color backgroundColor = Color.BLACK;

        Group root =  new Group();
        Scene scene = new Scene(root,WIDTH, HEIGHT, backgroundColor);
        Canvas canvas = new Canvas(WIDTH, HEIGHT);

        Star myStar1 = new Star(WIDTH/10,HEIGHT/10,5, WIDTH/10);
        Star myStar2 = new Star(WIDTH/5,HEIGHT - HEIGHT/10,6, WIDTH/9);
        Star myStar3 = new Star(WIDTH/2,HEIGHT/2,5, WIDTH/8);
        Star myStar4 = new Star(WIDTH/2 + WIDTH/5,HEIGHT/2 + HEIGHT/5,7, WIDTH/10);
        Star myStar5 = new Star(WIDTH - WIDTH/10,HEIGHT/2,6, WIDTH/9);

        root.getChildren().add(myStar1.star);
        root.getChildren().add(myStar2.star);
        root.getChildren().add(myStar3.star);
        root.getChildren().add(myStar4.star);
        root.getChildren().add(myStar5.star);
        stage.setScene(scene);
        stage.show();
    }
}