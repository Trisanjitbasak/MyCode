import java.util.Scanner;
class sumofevendigits{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s, c=0;
        while(n>0){
            s = n%10;
            if(s%2==0)
                c = c+s;
            n=n/10;
        }
        System.out.println(c);
    }
}