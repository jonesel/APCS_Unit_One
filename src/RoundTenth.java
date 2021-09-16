import java.util.Scanner;

public class RoundTenth {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a positive decimal number:");
        double decimal = scan.nextDouble();
        double multiplied = decimal*10;
        double roundedNum = (int)(multiplied+.5);
        double answer = (double)(roundedNum/10);
        System.out.print(decimal + " rounded to the nearest tenth is " + roundedNum);

        // Create a Scanner object

        // Prompt the user for a positive decimal number


        /*Use an expression to calculate
         * the rounded value and assign
         * that value to a variable named
         * rounded.*/


        // Print the output in the form:
        // 11.487 rounded to the nearest tenth is 11.5


    }
}
