package core_Java.LogicalPrograms;

import java.util.Scanner;

/**
 * output :0 1 1 2 3 5 8 13.....
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        int firstNum = 0,secondNum = 1, thirdNum,i;
        Scanner input = new Scanner(System.in);
        System.out.println("The Fibonacci Series");
        System.out.print("Enter The Maximum Limit To Print :");
        int count = input.nextInt();
        System.out.println("Entered Number:"+count);
        System.out.print(firstNum+" "+secondNum);
        for (i=3;i<=count;i++){
            thirdNum=firstNum+secondNum;
            System.out.print(" "+thirdNum);
            firstNum = secondNum;
            secondNum = thirdNum;
        }

    }

}
