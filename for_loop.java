import java.util.Scanner;
public class for_loop {
     public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
        sc.close();
    }
    
}
