import java.util.*;
public class SlidingWindowBrute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int res = swbrute(arr, k);
        System.out.print(res);
    }

    public static int swbrute(int arr[], int k) {

        int[] sum = new int[arr.length - k + 1];

        for (int i = 0; i <= arr.length - k; i++) {

            for (int j = 0; j < k; j++) {
                sum[i] += arr[i + j];
            }
        }

        int max = Arrays.stream(sum).max().getAsInt();

        return max;
    }
}