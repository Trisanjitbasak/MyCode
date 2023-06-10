import java.util.Scanner;
class linear_Search{
    Scanner sc = new Scanner(System.in);
    int A[] = new int[4];
    int n;
    void input(){
        System.out.println("Enter the numbers");
        for(int i = 0; i<=A.length-1; i++){
            A[i] = sc.nextInt();
        }
    }
    void search(){
        System.out.println("Enter the number to be searched");
        n = sc.nextInt();
        for(int i = 0; i<=A.length-1; i++){
            if(A[i] == n)
            System.out.println("The number is present");
        }
        System.out.println("Search Successful");
    }
    public static void main(){
        linear_Search ob = new linear_Search();
        ob.input();
        ob.search();
    }
}