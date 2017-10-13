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
public class A1Q05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // making a scanner
        Scanner i = new Scanner(System.in);
        // asking the user to input a number between one and ten 
        System.out.println("Enter a number between 1-10: ");
        // creating an inetger for the inputted number 
        int number = i.nextInt();
        // creating a string 
        String asterisk = "*";
        // creating a for loop which encompasses the other 
        for (int x = 0; x < number; x++) {
            // printing of the appropriate amout of asterisks for the inputted number 
            for (int a = 0; a < number; a++) {
                System.out.print(asterisk);
            }
            // printing out the appropriate amount of lines according to the number of asterisks  
            System.out.println();
        }



    }
}
