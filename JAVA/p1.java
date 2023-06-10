import java.util.Scanner;
class Array_1{
    Scanner sc = new Scanner(System.in);
    int A[] = new int[5];
    int so=0, se=0;
    void store(){
        System.out.println("Enter 5 numbers");
        for(int i = 0; i<=A.length-1; i++){
            A[i] = sc.nextInt();
        }
    }
    void sum(){
        for(int i = 0; i<=A.length-1; i++){
            if(A[i] % 2 == 0)
                se = se+ A[i];
            if(A[i] % 2 != 0)
                so = so+ A[i];
        }
        System.out.println("Sum of Odd "+so);
        System.out.println("Sum of Even "+se);
    }
    public static void main(String args[]){
        Array_1 ob = new Array_1();
        ob.store();
        ob.sum();
    }
}