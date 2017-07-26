package exercises;

import java.util.Scanner;

public class Prep1E2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Rectangle Length: ");
        float length = in.nextFloat();
        System.out.println("Input Rectangle Width: ");
        float width = in.nextFloat();
        float area = length * width;
        System.out.println("Area of Rectangle: "+area);


    }
}
