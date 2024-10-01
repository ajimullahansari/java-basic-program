import java.util.Scanner;
public class area_peri_of_rectangle {
    public static void main(String[] args) {
        int len,br,area,peri;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of rectangle:");
        len = sc.nextInt();
        System.out.println("Enter the breath of rectangle:");
        br = sc.nextInt();
        area = (len*br);
        peri = 2*(len+br);
        System.out.println("The area of rectangle is :" + area );
        System.out.println("The peri of rectangle is :" + peri );
    }
}
