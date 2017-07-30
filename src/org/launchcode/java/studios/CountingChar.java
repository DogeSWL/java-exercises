package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Scanner;


public class CountingChar {
    public static void main(String args[]) {
        // Hard code String input
//        String sampleString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        // Running user input from command line
        Scanner in = new Scanner(System.in);
        System.out.println("Input your word or sentence: ");
        String sampleString = in.nextLine();

        String [] strItems = sampleString.split("");

        HashMap<String, Integer> charCount = new HashMap<>();

        for (int x = 0; x < strItems.length; x++) {
            if (charCount.containsKey(strItems[x]) == true) {
                charCount.put(strItems[x], charCount.get(strItems[x])+1);
            }
            if (charCount.containsKey(strItems[x]) == false) {
                charCount.put(strItems[x],1);
            }
        }

        System.out.println(charCount);

    }
}
