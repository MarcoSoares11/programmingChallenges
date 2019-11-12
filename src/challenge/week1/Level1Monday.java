
package challenge.week1;

import java.util.Scanner;

public class Level1Monday 
{

    public static void main(String[] args) {
        // Creates a user input Scanner
        Scanner input = new Scanner(System.in);     
        
        // Scans user input into variable of type String line
        String line = input.nextLine();
        
        // Parse String line to Integer line
        int totalCases = Integer.parseInt(line);
        
        // Makes an array out of the totalCases
        String[] outputs = new String[totalCases];
 
        // Iterates through the array to determine number of test cases
        for (int testCase = 1; testCase <= totalCases; testCase++) {
            
            // Scans the total number of test cases line
            line = input.nextLine();
            
            // Splits the values into an array according to spaces
            String[] values = line.split("[ ]");
            
            // Gets the indexes of the array to store the different values
            double tP = (double)Integer.parseInt(values[0]);
            double tR = (double)Integer.parseInt(values[1]);
            double k  = Double.parseDouble(values[2]);
            double q  = (double)Integer.parseInt(values[3]);
            double m  = (double)Integer.parseInt(values[4]);
            
            // Processes math
            double temperature = m * q;
            
             double rate = calculateRate(m, tP, k, tR);
            
            // Format for the outputs defined
            outputs[testCase-1] = "Case #" + testCase + " " + Math.abs(temperature - rate);
        }
        
        // Outputs final results
        for (String output : outputs) {
            System.out.println(output);
        }
    }
    public static double calculateRate(double n, double tP, double k, double tR) {
        if(n < 1) {
            double result = 0;
            return result;
        } else {
            double result = (tP - (k * (tP - tR)));
            return result;
        }
    }
        
}
