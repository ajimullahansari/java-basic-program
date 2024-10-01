import java.util.Scanner;
public class positive_or_neg {
    public static void main(String[] args) {
        int number,pos,neg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        number = sc.nextInt();
        if(number>0)
        System.out.println("The number is positive "+ number);
        else
        System.out.println("The number is negative"+ number);
    }
}
