package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        int sum = 0;
        for (Rectangle rectangle : rectangles){
            sum += rectangle.area();
        }
        float average = sum/rectangles.length;
        return average;
    }
}
