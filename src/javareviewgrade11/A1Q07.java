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
public class A1Q07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a scanner 
        Scanner input = new Scanner(System.in);

        // population 
        double population = 6;

        // making a counter to count increases
        int count = 1999;

        while (population <= 10) {
            // rate at which it will increase 
            population = population + 1.04;
            // increase count 
            count = count + 1;
        }
        // outputting when the population will exceed 10 billion to the user 
        System.out.println("The population will exceed 10 billion in " + count);
    }
}
