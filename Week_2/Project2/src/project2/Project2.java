/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.util.Scanner;

/**
 *
 * @author William
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the program! ");
        Scanner scan = new Scanner(System.in);
        while (!scan.nextLine().equals("Exit")){
            System.out.println("Please type Exit to quit");
        }
    }
    
}
