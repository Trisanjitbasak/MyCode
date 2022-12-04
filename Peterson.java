 import java.util.Scanner;
class Peterson{
    public static void main(){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int i,fact=1, s=0;
        int sum=0;
        while(n>0){
            int number=n%10;  
            for(i=1;i<=number;i++){    
                fact=fact*i;    
            } 
            fact=s;
            sum = fact +s;
        }
        if(sum==n)
        System.out.println("Peterson"); 
    }
}