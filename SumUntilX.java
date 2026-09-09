import java.util.Scanner;
public class SumUntilX {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Enter a number: ");
            String n = in.next();
            if( n.equals("x") || n.equals("X")){
                break;
            }
            int num = Integer.valueOf(n);
            
            sum = sum + num;
        }
        System.out.println(sum);
        in.close();
    }
}

// import java.util.Scanner;
// public class SumUntilX {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int sum = 0;
//         while(true){
//             System.out.print("Enter a number: ");
//             String n = sc.next();
//             if(n.equals("x") || n.equals("X")){
//                 break;
//             }
//             else{
//                 sum += Integer.parseInt(n);
//                 System.out.println("Current sum: " + sum);
//             }


//         }
//     }
    
// }



