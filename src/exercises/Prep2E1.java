package exercises;

public class Prep2E1 {
    public static void main(String args[])
    {
        int[] numArray = {1,5,2,8,7,12,9,4,21,41,10};

        int sum = sumOfEven(numArray);
        System.out.println(sum);
    }

    public static int sumOfEven(int[] numList)
    {
        int i, total = 0;

        for(i=0;i<numList.length;i++)
        {
            if(numList[i]%2 == 0)
            {
                total = total + numList[i];
            }
        }
        return total;
    }
}
