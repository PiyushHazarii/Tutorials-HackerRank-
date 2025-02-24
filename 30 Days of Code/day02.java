import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day2 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

    
        // Declare second integer, double, and String variables.
        int intValue;
        double doubleValue;
        String stringValue;

        // Read and save an integer, double, and String to your variables.
        intValue = scan.nextInt();
        doubleValue = scan.nextDouble();
        scan.nextLine(); // Consume the newline character left by nextDouble()
        stringValue = scan.nextLine();

        // Print the sum of both integer variables on a new line.
        System.out.println(i + intValue);

        // Print the sum of the double variables on a new line (formatted to one decimal place).
        System.out.printf("%.1f%n", d + doubleValue);

        // Concatenate and print the String variables on a new line.
        System.out.println(s + stringValue);

        scan.close();
    }
}