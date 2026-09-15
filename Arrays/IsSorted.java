import java.util.*;
public class IsSorted{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        boolean res = Sorted(arr);
        System.out.print(res);
        in.close();
    }
    public static boolean Sorted(int[] arr){
         for(int i = 1; i < arr.length - 1; i++){
             if(arr[i] > arr[i+1]){
                 return false;
             }
         }
        return true;
    }
   
}