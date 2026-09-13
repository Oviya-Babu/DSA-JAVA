import java.util.*;
public class Average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int res = avg(arr);
        System.out.println(res);
        sc.close();
        
    }
    public static int avg(int[] arr){
        int sum = 0;
        int avg = 0;
        int n = arr.length;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        avg = sum / n;
        return avg;
        
    }
}