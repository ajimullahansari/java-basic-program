import java.util.Scanner;
public class find_maxi_num {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        if(a>b)
        System.out.println("max num is a"+ a);
        else
        System.out.println("maxi num is b"+ b);
    }
}
