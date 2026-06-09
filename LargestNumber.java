// Program to Find the Largest Number out of n Natural Numbers

import java.util.Scanner;

class LargestNumber 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms:");
        int n = sc.nextInt();

        int max = 0;

        System.out.println("Enter numbers:");

        for(int i = 1; i <= n; i++) 
        {
            int num = sc.nextInt();

            if(num > max) 
            {
                max = num;
            }
        }

        System.out.println("Largest Number = " + max);

    }
}