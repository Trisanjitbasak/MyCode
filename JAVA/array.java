import java.util.Scanner;
class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int d, c=0;
        while(n>0){
            d = n%10;
            c++;
            n=n/10;
        }
        System.out.println("Total numbers "+c);
        int a[] = new int[c];
        System.out.println("The array is ");
        for(int i = 0; i<a.length; i++){
        while(n>0){
            d = n%10;
            a[i] = d;
            n=n/10;
        }
    }
    for(int i = 0; i<a.length; i++)
    System.out.print(a[i]);
    }
}