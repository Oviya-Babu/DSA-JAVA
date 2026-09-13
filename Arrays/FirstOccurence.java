import java.util.*;
public class FirstOccurence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int res = firstocc(arr, target);
        System.out.println(res);   
        sc.close();
        
    }
    public static int firstocc(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
              return i;
            }
        }
      return -1;
    } 
}