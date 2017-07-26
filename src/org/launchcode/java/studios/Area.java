package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius: ");
        float radiusC = in.nextFloat();
        double area = 3.14 * radiusC * radiusC;

        System.out.println("The area of a circle of radius "+radiusC+" is: "+area);

    }
}
