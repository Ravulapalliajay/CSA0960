package com.example.squareroot;
import java.util.Scanner;
public class SquareRoot {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int number;
	        do {
	            System.out.print("Type a non-negative integer: ");
	            number = scanner.nextInt();
	            if (number < 0) {
	                System.out.println("Invalid number, try again:");
	            }
	        } while (number < 0);

	       
	        double squareRoot = Math.sqrt(number);
	        System.out.println("The square root of " + number + " is " + squareRoot);
	    }
	}

	
	


