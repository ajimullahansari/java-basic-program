import java.util.Scanner;

/**
 * first
 */
class Addition {

    public static void main(String[] args) {
        int a,b,sum;
        System.out.println("Enter the first number:");
        Scanner sc=new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter the Second number:");
        b = sc.nextInt();
        sum = a+b;
        System.out.println("Sum of the number =" +sum);
    }
}