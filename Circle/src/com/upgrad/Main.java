package com.upgrad;

import java.util.Scanner;

class Box {
    double width;
    double height;
    double depth;

    // construct clone of an object
    Box(Box ob) { // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor used when no dimensions specified
    Box() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }
    // for cube
    Box(double len) {
        width = height = depth = len;
    }
    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

public class Main {
    public static void main(String[] args) {
        Box mybox1 = new Box(10.2, 20.4, 15);
        Box mybox2 = new Box(2.5, 3.1, 4);
        Box mybox3 = new Box(mybox1);
        Box mybox4 = new Box(10);
        System.out.println("Vol of box1 is "+mybox1.volume());
        System.out.println("Vol of box2 is "+mybox2.volume());
        System.out.println("Vol of box3 is "+mybox3.volume());
        System.out.println("Vol of box4 is "+mybox4.volume());
   }
}



