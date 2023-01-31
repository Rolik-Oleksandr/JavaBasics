package com.shpp.p2p.cs.orolik.assignment2;

import acm.graphics.GOval;
import acm.graphics.GRect;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

public class Assignment2Part2 extends WindowProgram {
    public void run(){
        buildCircles(2);
        buildRect(1, 1);

    }


    public static final int DIAMETER = 20;
    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;
    public static final int SIZE_CIRCLE = 100;

    private void buildRect(int width, int height) {
        GRect rect = new GRect(width * APPLICATION_WIDTH, height * APPLICATION_HEIGHT);
        rect.setColor(Color.BLACK);
        rect.setFilled(true);
        rect.setFillColor(Color.white);
        add(rect);
    }
    private void buildCircles(int radius){
        GOval circle = new GOval(radius * SIZE_CIRCLE, radius * SIZE_CIRCLE);
        circle.setColor(Color.BLACK);
        circle.setFilled(true);
        circle.setFillColor(Color.BLACK);
        add(circle);

        GOval circleNorthEast = new GOval(radius * SIZE_CIRCLE, radius * SIZE_CIRCLE, 200, 200);
        circleNorthEast.setColor(Color.BLACK);
        circleNorthEast.setFilled(true);
        circleNorthEast.setFillColor(Color.BLACK);
        add(circleNorthEast);
    }

}
