    import java.util.Scanner;
    public class OccurenceOf3{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number to find the Occurence of 3: ");
            int n = sc.nextInt();
            int count = 0;
            while(n!=0){
                int temp = n % 10;
                if(temp == 3){
                    count++;
                }
                n/=10;
            }
            System.out.println(count);
            sc.close();    
    }
        
    }
