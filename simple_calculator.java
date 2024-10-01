import java.util.Scanner;
public class simple_calculator {
    public static void main(String[] args) {
        int a,b,ope;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("operation 1=>add,2=>sub,3=>mul,4=>div");
        System.out.println("Enter the number for operation:");
        ope = sc.nextInt();
        if(ope==1)
        System.out.println("the addition of the no is:"+ (a+b));
        else if (ope==2)
        System.out.println("The subtraction of the no is:"+(a-b));
        else if(ope==3)
        System.out.println("the multiplication of the number is:"+(a*b));
        else if(ope==4)
        System.out.println("the division of the no is:"+(a/b));
        else
        System.out.println("your given number is invalid");
    }
}

