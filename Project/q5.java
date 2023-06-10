package Project;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        double t = Math.sqrt(num);
        System.out.println("The SquareRoot of "+num+" is: "+t);
    }
}
