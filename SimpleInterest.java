//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of p, t, r: ");
        double p = sc.nextDouble();
        double t = sc.nextDouble();
        double r = sc.nextDouble();
        double si = (p * t * r) / 100;
        System.out.print("The simple interest is: " + si);
        sc.close();
    }
    
}
