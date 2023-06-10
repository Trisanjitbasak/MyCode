import java.util.Scanner;
class practice{
    public static void main(String args[])
    {
        int min=0, t;
        Scanner sc=new Scanner(System.in);
        int A[] = new int[4];
        System.out.println("Enter 4 numbers");
        for(int i = 0; i<=A.length-1; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i<=A.length-1; i++){
            min = i;
            for(int j = i+1; j<=A.length-1; j++){
                if(A[j] < A[min])
                    min = j;
                t = A[i];
                A[i] = A[min];
                A[min] = t;
            }
        }
        for(int i = 0; i<=A.length-1; i++){
            System.out.println(A[i]);
        }
    }
}