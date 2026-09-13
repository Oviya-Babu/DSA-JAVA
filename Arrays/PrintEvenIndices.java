import java.util.*;
public class PrintEvenIndices{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] res = even_indices(arr);
        System.out.println(Arrays.toString(res));   
        sc.close();
        
    }
    public static int[] even_indices(int[] arr){
        int[] res = new int[(arr.length + 1) / 2];
        for(int i = 0; i < res.length; i++){
                res[i] = arr[2 * i];
        }
      return res;
    } 
}