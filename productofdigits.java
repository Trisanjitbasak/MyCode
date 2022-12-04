import java.util.Scanner;
class productofdigits{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s, c=1, d;
        while(n>0){
            s = n%10;
            c=c*s;
            n=n/10;
        }
        System.out.println(c);
    }
}