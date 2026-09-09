import java.util.Scanner;
public class CheckType{
    public static void main(String[] main){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a char: ");
       char ch = sc.next().trim().charAt(0);
        if( ch >= 'a' && ch <= 'z'){
            System.out.print("Lowercase");
        }
        else{
            System.out.print("Uppercase");
        }
    
      

       // System.out.print("Largest of 3 number is: " + max);
       sc.close();
    }
}