package fr.lidodo.plane;

import java.util.Scanner;

public class PlaneMain {

    /**
     * @param args args for main function not needed
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Plane plane = new Plane(in.next());
        System.out.println(plane);
    }

}
