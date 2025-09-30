package com.looping.simpleadder;
import java.util.Scanner;

public class SimpleAdder {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        for (int x = 0; x < 10; x++) {
            System.out.println("Please enter integer #" + (x+1));
            int input = scan.nextInt();
            // Ignore negative numbers, proceed to next iteraction
            if(input < 0){
                continue;
            }
            // Exit the program if 0 is entered
            if(input == 0){
                break;
            }
            sum += input;
        }
        System.out.println("The sum is " + sum);
        scan.close();

    }
}
