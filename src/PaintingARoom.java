import java.util.Scanner;

public class PaintingARoom {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the length of your room in feet?");
        double length = scan.nextDouble();
        System.out.print("What is the height of your room in feet?");
        double height = scan.nextDouble();
        System.out.print("What is the width of your room in feet?");
        double width = scan.nextDouble();
        System.out.print("How many doors in your room?");
        int door = scan.nextInt();
        System.out.print("How many windows are in your room?");
        int window = scan.nextInt();
        double area = (double) 2*(length*height)+2*(width*height)+(length*width);
        final int DOORAREA = 15;
        int subtractedArea1 = door*DOORAREA;
        final int WINDOWAREA = 10;
        int subtractedArea2 = window*WINDOWAREA;
        double sqft = area-(subtractedArea1+subtractedArea2);
        final int SQFTPERGALLON = 350;
        double gallon = sqft/SQFTPERGALLON;
        double a = gallon*10;
        int b = 10;
        int solution = (int)((a+b-1)/b);
        System.out.print("You need "+solution+" gallons of paint to paint your room");











    }

}
