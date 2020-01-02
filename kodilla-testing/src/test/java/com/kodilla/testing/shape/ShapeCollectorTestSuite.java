package com.kodilla.testing.shape;
import org.junit.*;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class ShapeCollectorTestSuite
{

    @Test
    public void testAddFigureMetod()
    {
        ShapeCollector shapeCollection = new ShapeCollector();
        shapeCollection.addFigure(new Square());

        assertEquals(1, shapeCollection.size());
    }

    @Test
    public void testRemoveFigureMetod()
    {
        ShapeCollector shapeCollection = new ShapeCollector();
        Shape square = new Square();
        shapeCollection.removeFigure(square);

        assertEquals(0, shapeCollection.size());
    }

    @Test
    public void testGetFigureMetod()
    {
        ShapeCollector shapeCollection = new ShapeCollector();
        shapeCollection.addFigure(new Square());
        String shape = shapeCollection.getFigure(0);

        assertEquals("Square", shape);
    }
}
