import java.util.Scanner;
public class Fibonacci_WhileLoop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its fibonacci: ");
        int n = sc.nextInt(); 
    
        int a=0;
        int b=1;
        int count = 2;
        while(count <= n){
            int c = a+b;
            a = b;
            b = c;
            count++;
        }
        System.out.println(b);  
        sc.close();    
}
    
}
