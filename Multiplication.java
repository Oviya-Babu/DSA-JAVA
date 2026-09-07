import java.util.Scanner;
public class Multiplication{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to view its multiplication table: ");
        int num = sc.nextInt();
        for(int i = 1; i <= 10;i++){
            int result = num * i;
            System.out.println( num  + " * " +  i + " = " + result);
        }
        
        sc.close();
    }
}