package com.kodilla.testing.shape;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ShapeCollectorTestSuite {


    @Test
    public void testAddFigureMetod() {

        ShapeCollector shapeCollection = new ShapeCollector();
        shapeCollection.addFigure(new Square());

        assertEquals(1, shapeCollection.size());
    }

    @Test
    public void testRemoveFigureMetod() {

        ShapeCollector shapeCollection = new ShapeCollector();
        Shape square = new Square();

        shapeCollection.addFigure(square);
        shapeCollection.removeFigure(square);

        assertEquals(0, shapeCollection.size());
    }

    @Test
    public void testGetFigureMetod() {

        ShapeCollector shapeCollection = new ShapeCollector();
        Shape square = new Square();

        shapeCollection.addFigure(square);
        Shape retrievedShape = shapeCollection.getFigure(0);

        assertEquals(square, retrievedShape);
    }

    @Test
    public void testShowFiguresMetod() {

        ShapeCollector shapeCollection = new ShapeCollector();

        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape circle = new Circle();

        shapeCollection.addFigure(square);
        shapeCollection.addFigure(triangle);
        shapeCollection.addFigure(circle);

        shapeCollection.showFigures();
    }
}