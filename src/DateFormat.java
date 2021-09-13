import java.util.Scanner;

public class DateFormat {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the current month?");
        String month = scan.nextLine();
        System.out.print("What is the current day of the week?");
        String day = scan.nextLine();
        System.out.print("What is the current year?");
        String year = scan.nextLine();
        System.out.print("What is the current day of the month?");
        String dayofmonth = scan.nextLine();
        System.out.println("American Format:");
        System.out.print(day);
        System.out.print(", ");
        System.out.print(month);
        System.out.print(" ");
        System.out.print(dayofmonth);
        System.out.print(", ");
        System.out.println(year);
        System.out.println("European Format:");
        System.out.print(day+ ", " + dayofmonth + " " + month+", " + year);






    }
}
