package com.kodilla.patterns.factory.tasks;


public final class TaskFactory {

        public static final String SHOPPING_TASK = "SHOPPING_TASK";
        public static final String PAINTING_TASK = "PAINTING_TASK";
        public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task makeTask (final String taskClass) {

        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask ("BUY", "Something", 10.0);
            case PAINTING_TASK:
                return new PaintingTask ("PAINT", "White", "Something");
            case DRIVING_TASK:
                return new DrivingTask ("DRIVE", "There", "Bike" );
            default:
                return null;
        }
    }
}