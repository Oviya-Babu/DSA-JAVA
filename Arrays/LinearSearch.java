import java.util.*;
public class LinearSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        String res = linearSearch(arr, target);
        System.out.println(res);
       
        sc.close();
        
    }
    public static String linearSearch(int[] arr, int target){
        //String ans = null;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
              // ans = "found" ;
              //  break;
                return "found";
            }
        }
      return "Not found";
    }
   
}