import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        int a,b,Divi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        Divi = a/b;
        System.out.println("The Division  of number is " + Divi);
    
    }
}
