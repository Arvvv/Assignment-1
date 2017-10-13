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
public class A1Q08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a scanner 
        Scanner input = new Scanner(System.in);
        
        // savings account amount 
        System.out.println("Enter initial amount of the account");
        // creating a double for the initial amount 
        double account = input.nextDouble();
        
        // this double will be when the account initial amount is doubled 
        double doubledaccount = account * 2;
        
        // interest rate information must be given from the user
        System.out.println("Enter the applied interest rate: ");
        // creating a double for the rate 
        double intrate = input.nextDouble();
        
        // year
        int year = 2017;
        
        // increased rate 
        intrate = intrate + 1;
        
        // attaining doubled amount 
        while (account != account * 2){
            // increasing the account according to the interest rate 
            account = account * intrate;
            year = year + 1;
            if(doubledaccount <= account){
                System.out.println("The year at which the account will double is "+ year);
                break;
            }
            
        }
        
        // one million dollars
        while(account < 1000000){
            // account will continue looping until one million 
            account = account * intrate;
            year = year + 1;
        }
        // when it will reach one million 
        System.out.println("The account will reach one million in the year " + year);
        
        
        
        
        
    }
    
}
