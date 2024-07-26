/*
 * AP CSA Prerequisite Project
 * Persistence of a Number
 * Finished 7/26/2024
*/

package summerwork;

// import scanner package
import java.util.Scanner;

public class persistence
{
    public static void main (String[] args)
    {
        // creates scanner object 
        Scanner scan = new Scanner (System.in);

        // formatting variables 
        String line = "-------------------------------";
        String bar =  "           - - - - -";

        System.out.println(line);

        // ask user for number 
        System.out.println("Enter desired number: ");
        int userInput = scan.nextInt();

        System.out.println(bar);

        // call on method to calculate the persistence 
        int persistence = NumberProcessor(userInput, 0);

        // print out the result
        System.out.println("The persistence of " + userInput + " is " + persistence);
        System.out.println(line);
    }

    // calculates the persistence of the desired number
    static int NumberProcessor (int num, int persistence)
    {

        // cast from int to string
        String numStr = String.valueOf(num);

        // find number of places in user's number 
        int length = numStr.length();

        // if number has one digit left
        if (length == 1)
        {
            return persistence;
        }

        // if number has more than one digit
        else
        {
            // define product variable
            int product = 1; 

            // loop through each digit of number
            for (int i = 0; i < length; i++)
            {
                // take each digit
                String digit_str = numStr.substring(i, i+1);

                // cast from string to integer
                int digit_int = Integer.valueOf(digit_str);

                // multiply digit to the running product
                product *= digit_int;
            }
            
            // increment persistence count 
            persistence++;

            // recursion
            return NumberProcessor(product, persistence);
        }
    }
}