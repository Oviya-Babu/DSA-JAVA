import java.util.*;
public class RightSidedTrianglePattern{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern(n);
        in.close();
    }
    public static void pattern(int n){
        for(int i = 1; i <= n ; i++){
            for(int j = i; j <= n; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }  
    }
}