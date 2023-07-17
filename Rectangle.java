import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = sc.nextDouble();
        System.out.println("Enter height: ");
        double height = sc.nextDouble();

        double perimeter = 2 * (width + height);
        double area = width * height;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}