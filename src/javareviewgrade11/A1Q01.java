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
public class A1Q01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a new scanner
        Scanner i = new Scanner(System.in);

        // asking the user to input their name 
        System.out.println("Please enter your name");
        // saving the name under a string 
        String name = i.nextLine();
        // outputting the given information by greeting the user
        System.out.println("Hello " + name + ".");
    }
}
