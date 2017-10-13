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
public class A1Q10 {

    public static void main(String[] args) {
        // creating a scanner 
        Scanner in = new Scanner(System.in);

        // asking the user to enter a number between one and ten 
        System.out.println("Enter a number between one and ten: ");
        // saving the users input within an integer 
        int inputnumber = in.nextInt();

        // asterisk under a string 
        String asterisk = "*";

        // for loop
        for (int s = 0; s < inputnumber; s++) {
            for (int i = 0; 9 < inputnumber; i++) {
                System.out.print(asterisk);
            }
            // creating a line for each individual loop 
            System.out.println();
        }


    }
}
