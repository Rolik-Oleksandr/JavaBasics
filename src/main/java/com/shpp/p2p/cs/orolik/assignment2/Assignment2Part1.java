package com.shpp.p2p.cs.orolik.assignment2;

import com.shpp.cs.a.console.TextProgram;

public class Assignment2Part1 extends TextProgram {
    public void run(){
        formulaDiscriminant();
    }

    //Scanners which accept the numbers of the equation
    double a = readDouble("a:");
    double b = readDouble("b:");
    double c = readDouble("c:");
    double root1, root2;


    private double rootOfNumber(double x){          //function which counts root of number
        return Math.sqrt(x);
    }

    //Formula discriminant
    private void formulaDiscriminant(){
        double d = (b * b) - 4 * a * c;
        if(d == 0.0){                                           //if discriminant = 0
            root1 = (b * -1) / 2 * a;                           //it means that the equation has 1 root
            println("There is one root: " + root1);
        }
        if(d > 0){                                              //if discriminant > 0
            root1 = ((b * -1) + rootOfNumber(d)) / 2 * a;        //first root = -b + rootOf D / 2a
            root2 = ((b * -1) - rootOfNumber(d)) / 2 * a;       //second root = -b - rootOf D / 2a
            println("There are two roots: " + root1  + " and " + root2);
        }
        if(d < 0){                                              //if discriminant < 0
            println("There are no real roots");                 //There are no real roots
        }
    }
}