import java.util.*;
public class FindNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] res = num(arr);
        System.out.println("Positive: " + res[0]);
        System.out.println("Negative: " + res[1]);
        System.out.println("Zero: " + res[2]);
        sc.close();
        
    }
    public static int[] num(int[] arr){
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                a++;
            }
            if(arr[i] < 0) {
                b++;
            }
            if(arr[i] == 0){
                c++;
            }
        }
        return new int[]{a, b, c};
    }
}