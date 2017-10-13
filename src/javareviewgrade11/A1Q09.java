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
public class A1Q09 {

    public static void main(String[] args) {
        // creating a scanner
        Scanner input = new Scanner(System.in);

        // array for words
        String words[] = new String[10];

        // 10 words
        System.out.println("Enter 10 words: ");
        for (int i = 0; i < 10; i++) {
            words[i] = input.nextLine();
        }
        // total words within the array 
        double totalnum = words[0].length() + words[1].length() + words[2].length()
                + words[3].length() + words[4].length()
                + words[5].length() + words[6].length()
                + words[7].length() + words[8].length()
                + words[9].length();

        // average word length being outputted 
        System.out.println(totalnum / 10);


    }
}

    

