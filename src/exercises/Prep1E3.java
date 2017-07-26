package exercises;

import java.util.Scanner;

public class Prep1E3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input miles driven: ");
        float miles = in.nextFloat();
        System.out.println("Input gas consumed: ");
        float gas = in.nextFloat();
        float mpg = miles / gas;
        System.out.println("Miles per gallon: "+mpg);
    }
}
