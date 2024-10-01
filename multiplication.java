import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        int a,b,mult;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        mult = a*b;
        System.out.println("The multiplication of number is " + mult);
    
    }
}
