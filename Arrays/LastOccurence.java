import java.util.*;
public class LastOccurence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int res = last_occ(arr, target);
        System.out.println(res);   
        sc.close();
        
    }
    public static int last_occ(int[] arr, int target){
        for(int i = arr.length - 1; i>=0; i--){
            if(arr[i] == target){
              return i;
            }
        }
      return -1;
    } 
}