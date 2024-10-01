import java.util.Scanner;
public class Area_of_triangle {
    public static void main(String[] args) {
        int base,height,Area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of triangle");
        base = sc.nextInt();
        System.out.println("Enter the height of the triangle");
        height = sc.nextInt();
        Area = (base*height)/2;
        System.out.println("The Area of the triangle is: " + Area);
    }
}
