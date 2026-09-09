import java.util.Scanner;
public class Largest{
    public static void main(String[] main){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 3 numbers: ");
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
        int max = 0;
        if( a > max){
            max = a;
        }
        if( c > max){
            max = c;
        }
        if (b > max){
            max = b;
        }
        System.out.print("Largest of 3 number is: " + max);
       sc.close();
    }
}