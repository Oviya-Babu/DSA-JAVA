import java.util.*;
public class SecondLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int res = secondlargest(arr);
        System.out.print(res);
    }
    public static int secondlargest(int[] arr){
        int largest = arr[0];
        int slar = Integer.MIN_VALUE;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                slar = largest;
                largest = arr[i];
            }
            else if( arr[i] < largest && arr[i] > slar ){
                slar = arr[i];
            }
        }
        return slar;
    }
    
}
