/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge.week2;

import java.util.Scanner;

// Status = Completed

/**
 *
 * @author Marco
 * @description Solves the Week 2 Problem: Tournament Selection
 * @date November 12, 2019
 * 
 */
public class Level1MondayWeek2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[] inputs = new String[6];
        
        int wCount = 0;
        int lCount = 0;
        int otherCount = 0;
        
        for(int i = 0; i < 6; i++) {
            inputs[i] = scan.next();
        }
        
        for (String input : inputs) {
            switch (input) {
                case "W":
                case "w":
                    wCount++;
                    break;
                case "L": 
                case "l":
                    lCount++;
                    break;
                default:
                    otherCount++;
                    break;
            }
        }
        
        System.out.println("Total wins: " + wCount + "\n" + "Total losses: " + lCount + "\n" + "Other values inputed: " + otherCount);
        
        switch(wCount) {
            case 0:
                System.out.println("--> You were eliminated");
                break;
            case 1:
            case 2:
                System.out.println("--> You were placed in Group 3");
                break;
            case 3:
            case 4:
                System.out.println("--> You were placed in Group 2");
                break;
            case 5:
            case 6:
                System.out.println("--> You were placed in Group 1");
                break;
        }
        
    }
    
}
