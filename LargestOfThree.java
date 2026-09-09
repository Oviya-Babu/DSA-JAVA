import java.util.Scanner;
public class LargestOfThree{
    public static void main(String[] main){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 3 numbers: ");
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int max = a;
        if( b > max){
            max = b;
        }
        if( c > max){
            max = c;
        }
        System.out.print("Largest of 3 number is: " + max);
       sc.close();
    }
}