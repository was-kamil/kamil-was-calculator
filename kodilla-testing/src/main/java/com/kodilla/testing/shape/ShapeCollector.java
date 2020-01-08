package com.kodilla.testing.shape;
import java.util.ArrayList;


public class ShapeCollector {

    public ArrayList<Shape> shapeCollection = new ArrayList<>();


    public void addFigure(Shape shape) {

        shapeCollection.add(shape);
    }

    public void removeFigure(Shape shape) {

        shapeCollection.remove(shape);
    }

    public Shape getFigure(int n) {

        return shapeCollection.get(n);
    }

    public void showFigures() {

        for(Shape shape: shapeCollection)
            System.out.println(shape.getShapeName());
    }

    public int size() {
        return shapeCollection.size();
    }
}