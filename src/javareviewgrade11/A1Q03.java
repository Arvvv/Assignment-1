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
public class A1Q03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a scanner for user input 
        Scanner i = new Scanner(System.in);

        // asking for the cost of food 
        System.out.println(" Please input the cost of food: ");
        double food = i.nextInt();
        // asking for the cost of the DJ
        System.out.println(" Please input the cost of the DJ: ");
        double DJ = i.nextInt();
        // asking for the cost of the hall
        System.out.println(" Please input the cost of the hall: ");
        double hall = i.nextInt();
        // asking for the cost of the decorations
        System.out.println(" Please input the cost of decorations: ");
        double decorations = i.nextInt();
        // asking for the cost of the wait staff
        System.out.println(" Please input the cost of the wait staff: ");
        double staff = i.nextInt();
        // asking for the cost of the miscellaneous expenses 
        System.out.println(" Please input the cost of miscellaneous expenses: ");
        double miscell = i.nextInt();
        // caluculating the total cost of all the expenses 
        double totalcost = food + DJ + hall + decorations + staff + miscell;
        // calculating the amount of tickets which need to be sold in order to break even
        double breakeven = Math.ceil(totalcost / 35);
        // telling the user the calculated total of all the expenses 
        System.out.println(" The total cost of your expenses is " + totalcost + ".");
        // telling the user how many tickets which need to be sold in order to break even 
        System.out.println(" Therefore you must sell atleast " + breakeven + " tickets in order to break even. ");

    }
}
