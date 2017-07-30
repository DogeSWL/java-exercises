package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String args[]) {

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter radius: ");
//        float radiusC = in.nextFloat();
//        double area = 3.14 * radiusC * radiusC;
//
//        System.out.println("The area of a circle of radius "+radiusC+" is: "+area);


        // bonus section

        float radiusC = -1;

        while(radiusC < 0) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter radius: ");
            radiusC = in.nextFloat();

            if(radiusC < 0) {
                System.out.println("Negative number not accepted");
            }
        }

        double area = 3.14 * radiusC * radiusC;
        System.out.println("The area of a circle of radius "+radiusC+" is: "+area);


    }
}
