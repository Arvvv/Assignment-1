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
public class A1Q04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a scanner 
        Scanner i = new Scanner(System.in);
        // asking the user to enter a number
        System.out.println(" Please enter a number from 1 to 10: ");
        // creating an integer for the number
        int number = i.nextInt();

        //each number between one to ten will correspond to the same number of asterisks

        if (number == 10) {
            System.out.println("**********");
        }
        if (number == 9) {
            System.out.println("*********");
        }
        if (number == 8) {
            System.out.println("********");
        }
        if (number == 7) {
            System.out.println("*******");
        }
        if (number == 6) {
            System.out.println("******");
        }
        if (number == 5) {
            System.out.println("*****");
        }
        if (number == 4) {
            System.out.println("****");
        }
        if (number == 3) {
            System.out.println("***");
        }
        if (number == 2) {
            System.out.println("**");
        }
        if (number == 1) {
            System.out.println("*");
        }
    }
}
