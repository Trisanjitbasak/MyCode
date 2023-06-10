package Project;

import java.util.Scanner;

class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n;
        int num = sc.nextInt();
        num = Math.abs(num);
        n = num;
        int es = 0; 
        int ms = 0;
        while(n!=0){
            if(n == num || n<10){
                es = es+n%10;
            }
            else
                ms = ms+n%10;
            n=n/10;    
        }
        System.out.println("Sum of extreme digits: "+es);
        System.out.println("Sum of mean digits: "+es);
        if(es==ms){
            System.out.println("It is a Xylem Number");
        }
        else{
            System.out.println("It is a phloem Number");
        }
    }
}
