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
public class A1Q02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        // creating an array 
        Double[] number = new Double[3];

        // ask user for three numbers 
        System.out.println(" Please input three numbers: ");
        number[0] = i.nextDouble();
        number[1] = i.nextDouble();
        number[2] = i.nextDouble();
        // calculating and outputting the product of the numbers 
        double product = number[0] * number[1] * number[2];
        System.out.println(" The product of the numbers is " + product + ".");
        // calculating and outputting the square root of the product
        double squareroot = Math.pow(product, 2);
        System.out.println(" The square of the product is " + squareroot + ".");
        // calculating and outputting the square of the product 
        double square = Math.sqrt(product);
        System.out.println(" The square root of the product is " + square + ".");




    }
}
