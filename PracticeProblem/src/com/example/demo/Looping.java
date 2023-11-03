package com.example.demo;

import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Reverse sequence:");

        if (number >= 0) {
            for (int i = number; i >= 1; i--) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = number; i <= 0; i++) {
                System.out.print(i + " ");
            }
        }

       // scanner.close();
    }

}
