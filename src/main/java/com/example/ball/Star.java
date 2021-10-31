package com.example.ball;

import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

import java.util.ArrayList;


public class Star {
    public double x;
    public double y;
    public Color color = Color.WHITESMOKE;
    public Color outline = Color.STEELBLUE;
    public int points;
    public ArrayList pointsArray = new ArrayList<Double>();
    public int radius;
    public Polygon star = new Polygon();

//    This takes an x and a y and uses the points and radius to
//    determine the positions of each point in this star
    public Star(double x, double y, int points, int radius) {
        this.updateValues(x, y, points, radius);

    }

//    Update the points to the class
    public void updateValues(double x, double y, int points, int radius) {
        this.x = x;
        this.y = y;
        this.points = points;
        this.radius = radius;

        this.createPoints(points);
        this.star.getPoints().addAll(this.pointsArray);
        this.star.setStroke(this.color);
        this.star.setFill(this.outline);

    }

//    This takes the points and using the radius and the x and y position
//    it will create the points needed to make the star.
//    It doubles the amount of points given because of the indents of the star.
    public void createPoints(int points) {
        float rotate = 1;
        float angle = 0;
        for (float i = 0; i < points*2; i += 1) {

            if (i%2 == 0) {
                double px = (Math.cos(angle + Math.PI * rotate) * this.radius) + this.x;
                this.pointsArray.add(px);
                double py = (Math.sin(angle + Math.PI * rotate) * this.radius) + this.y;
                this.pointsArray.add(py);
            }
            else {
                double px = (Math.cos(angle + Math.PI * rotate) * this.radius/2) + this.x;
                this.pointsArray.add(px);
                double py = (Math.sin(angle + Math.PI * rotate) * this.radius/2) + this.y;
                this.pointsArray.add(py);

            }
            angle += Math.PI/(points);
        }
    }

}
