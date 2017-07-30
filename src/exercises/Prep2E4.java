package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prep2E4 {
    public static void main(String args[]) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String studentName;

        System.out.println("Input ID of student (or Enter to finish) ");

        do {
            System.out.println("Student Name: ");
            studentName = in.nextLine();

            if (!studentName.equals("")) {
                System.out.println("Student ID: ");
                Integer studentID = in.nextInt();
                studentMap.put(studentID, studentName);

                in.nextLine();
            }
        } while (!studentName.equals(""));

        System.out.println("Student List:");

        for (Map.Entry<Integer, String> student : studentMap.entrySet()) {
            System.out.println("ID: "+student.getKey() + "  Name: " + student.getValue());
        }
    }
}
