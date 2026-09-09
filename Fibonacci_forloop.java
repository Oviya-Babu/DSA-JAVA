import java.util.Scanner;
public class Fibonacci_forloop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its fibonacci: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 2; i <= n; i++ ){
            int c = a+b;
            a = b;
            b = c;
        }
        System.out.println(b);  
        sc.close();    
}
    
}
