import java.util.Scanner;

public class CorrectChange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How much?");
        int cents = scan.nextInt();
        int dollar = cents/100;
        int remainder = cents%100;
        int quarter = remainder/25;
        remainder = remainder%25;
        int dime = remainder/10;
        remainder = remainder%10;
        int nickel = remainder/5;
        remainder = remainder%5;
        int penny = remainder/1;
        System.out.print(dollar+" dollars, "+quarter+" quarters, "+dime+" dimes, "+nickel+" nickels, "
+penny+" pennies.");
    }
}
