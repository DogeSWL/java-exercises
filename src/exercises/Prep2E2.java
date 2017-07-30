package exercises;

public class Prep2E2 {
    public static void main(String args[])
    {
        String[] wordArray = {"master", "lucky", "visit", "letter", "Sammy"};
        printWordFive(wordArray);

    }

    public static String printWordFive(String[] wordArray)
    {
        for(int i=0; i < wordArray.length; i++)
        {
            if (wordArray[i].length() == 5)
            {
                System.out.println(wordArray[i]);
            }
        }
        return null;
    }
}
