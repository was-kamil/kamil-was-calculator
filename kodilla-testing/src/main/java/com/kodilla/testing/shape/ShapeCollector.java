package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector
{
    public ArrayList<Shape> shapeCollection = new ArrayList<Shape>();

    public ShapeCollector()
    {
    }

    public void addFigure(Shape shape)
    {
        shapeCollection.add(shape);
    }

    public void removeFigure(Shape shape)
    {
        shapeCollection.remove(shape);
    }

    public String getFigure(int n)
    {
        return shapeCollection.get(n).getShapeName();
    }

    public void showFigures()
    {
    }

    public int size()
    {
        return shapeCollection.size();
    }
}
