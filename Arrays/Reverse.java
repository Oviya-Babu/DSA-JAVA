import java.util.*;
public class Reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = sc.nextInt();
        }
        int[] Reverse = rev(arr);
        System.out.print(Arrays.toString(Reverse));
    }
    public static int[] rev(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        for(int i = 0; i < arr.length -1 ; i++){
            swap(arr, left, right);
            left ++;
            right--;
        }
        return arr;
    }
    public static void swap(int arr[], int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}