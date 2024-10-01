import java.util.Scanner;
public class find_max_of_three_num {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
        if(a>=b)
        {
            if(a>=c)
            System.out.println("maximum num is a"+a);
            else
            System.out.println("maximum num is c"+c);
        }
        else{
        if(b>=c)
        System.out.println("maximum num is b"+b);
        else
        System.out.println("maximum num is c "+c);
        }
        
    }
}
