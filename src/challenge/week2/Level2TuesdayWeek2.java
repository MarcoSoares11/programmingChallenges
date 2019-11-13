/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge.week2;

import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class Level2TuesdayWeek2 {
    
    int result = 0;
    
    static void findDivisors(int n) {
        for(int i = 1; i < Math.sqrt(n); i++) {
            if(n % i == 0) {
                if(n / i == i) {
                    System.out.printf("%d ", i);
                }
                else {
                    System.out.printf("%d %d", i, (n/i));
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter lower limit of range");
        int lowerLimit;
        lowerLimit = scan.nextInt();
        
        System.out.println("Enter the higher limit of range");
        int higherLimit;
        higherLimit = scan.nextInt();
        
        int[] range;
        range = new int[2];
        range[0] = lowerLimit;
        range[1] = higherLimit;
        
        for(int i : range) {
            findDivisors(range[i]);
        }
        
        System.out.println("The number of RSA numbers between " + range[0] + " and " + range[1] + " is " + result);
        
    }
}
