import java.util.Scanner;
class sumofsqofdigits{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s, c=0, d;
        while(n>0){
            s = n%10;
            c= (int)Math.pow(s,2)+c;
            n=n/10;
        }
        System.out.println(c);
    }
}