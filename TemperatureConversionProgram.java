/*
   Purpose: Convert fahrenheit to celsius and kelvin
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class TemperatureConversionProgram {   
   
   public static void main(String[ ] args) {
   
      // Declarations
      
      final double CONVERSION_FACTOR = 5.0 / 9.0;
      double fahrenheit = 0.0;   // Input value in fahrenheit
      double celsius = 0.0;      // Output value, converted to celsius
      double kelvin = 0.0;       // Output value, converted to Kelvin
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat decimals = new DecimalFormat("0.00");
      
     // Enter fahrenheit temperature
     System.out.print("Enter fahrenheit temperature: ");
     fahrenheit = keyboard.nextDouble();
     
     // Convert f to c and k
     //       c = (f - 32) * 5 /9
     //       k = (f + 459.67) * 5 / 9
     
     celsius = (fahrenheit - 32.0)   * CONVERSION_FACTOR;
     kelvin  = (fahrenheit + 459.67) * CONVERSION_FACTOR;    
            
    //  Output results to a specific number of places
    
    System.out.println(fahrenheit + " degrees fahrenheit is " 
         + decimals.format(celsius) + " \ndegrees celsius and "
         + decimals.format(kelvin)  + " degrees Kelvin.");
         
   } // End main
} // End class
