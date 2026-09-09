import java.util.Scanner;
public class While{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int n = sc.nextInt();
        int i=1;
        while(i <= n){
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}