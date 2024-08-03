package com.example.sumofnum;
import java.util.Scanner;

public class SumOfNums {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        do {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            sum += num;
            count++;
        } while (count < 10);

        System.out.println("The sum of the numbers is: " + sum);
    }
}

