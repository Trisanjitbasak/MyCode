package Project;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int arr[] = new int[5];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max)
            max = arr[i];
        }
        System.out.println("Largest Element present in given array is: "+max);
    }
}
