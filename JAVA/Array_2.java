import java.util.Scanner;
class Array_2{
    Scanner sc = new Scanner(System.in);
    double A[] = new double[5];
    double c, f;
    void input(){
        System.out.println("Enter 5 temperatures in Farenhiet");
        for(int i = 0; i<=A.length-1; i++){
            A[i] = sc.nextInt();
        }
    }
    void convert(){
        for(int i = 0; i<=A.length-1; i++){
            A[i] = f;
            c = 5*(f - 32)/9;
        }
        for(int i = 0; i<=A.length-1; i++){
            A[i] = c;
            System.out.println(A[i]);
        }
    }
    public static void main(String args[]){
        Array_2 ob = new Array_2();
        ob.input();
        ob.convert();
    }
}