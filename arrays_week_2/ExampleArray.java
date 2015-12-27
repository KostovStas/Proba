package arrays_week_2;

import java.util.Scanner;

/**
 * Created by Stas on 21.11.2015.
 */
public class ExampleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers= new int[4];
        System.out.println("enter the first number");
        numbers[0]=sc.nextInt();
        System.out.println("enter the second number");
        numbers[1]=sc.nextInt();
        System.out.println("enter the third number");
        numbers[2]=sc.nextInt();
        System.out.println("enter the fourth number");
        numbers[3]=sc.nextInt();
        System.out.print(numbers[0]+ " " + numbers[1]+ " " +numbers[2]+ " " +numbers[3]);


    }
}
