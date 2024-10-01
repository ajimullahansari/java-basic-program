import java.util.Scanner;
public class subtraction{
    public static void main(String[] args) {
        int a,b,subt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        subt = a-b;
        System.out.println("The subtraction of number is " + subt);
    }
}