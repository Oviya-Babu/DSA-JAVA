// 1281. Subtract the Product and Sum of Digits of an Integer

package leedcode;
class Solution {
    public int subtractProductAndSum(int n) {
        int result = 0;
        int product = 1;
        int sum = 0;
        while( n > 0){
            int rem = n % 10;
            n/=10;
            product *= rem;
            sum += rem;
        }
        result = product - sum;
        return result;
    }
}