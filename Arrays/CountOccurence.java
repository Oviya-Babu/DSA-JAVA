import java.util.*;
public class CountOccurence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int res = count(arr, target);
        System.out.println(res);
       
        sc.close();
        
    }
    public static int count(int[] arr, int target){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
              count++;
            }
        }
      return count;
    } 
}