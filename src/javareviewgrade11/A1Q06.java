/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareviewgrade11;

import java.util.Scanner;

/**
 *
 * @author debia7331
 */
public class A1Q06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // making a scanner for user input 
        Scanner i = new Scanner(System.in);

        System.out.println(" Please enter a number between 50 and 100 to stop at: ");
        // creating an integer for the inputted the number
        int number = i.nextInt();
        // setting the counter at one hundred and having it minused by 5 until it reaches the number 
        for (int counter = 100; counter > number; counter -= 5) {
            System.out.println(counter);
        }

    }
}
