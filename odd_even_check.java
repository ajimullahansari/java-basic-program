import java.util.Scanner;
public class odd_even_check {
    public static void main(String[] args) {
        int a,odd,even;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        if(a % 2==0)
        System.out.println("The number is even"+ a);
        else
        System.out.println("The number is odd"+ a);
    }
}
