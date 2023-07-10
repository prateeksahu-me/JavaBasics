import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of following subjects");
        System.out.println("Maths");
        float marks1 = sc.nextFloat();
        System.out.println("English");
        float marks2 = sc.nextFloat();
        System.out.println("Physics");
        float marks3 = sc.nextFloat();
        System.out.println("Chemistry");
        float marks4 = sc.nextFloat();
        System.out.println("Computer Science");
        float marks5 = sc.nextFloat();

        float sum = marks1+marks2+marks3+marks4+marks5;
        float percent = (sum/500)*100;
        System.out.println("\n\nTotal Marks are = "+sum+"\n Percentage is = "+percent);

    }
}
