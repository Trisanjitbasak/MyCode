package Project;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("After reversing the String is: ");
        for(int i=s.length(); i>0; --i){
            System.out.print(s.charAt(i-1));
        }
    }
}
