import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String a, b;
        String ch="";
        String ch1="";
        for(int i = 0; i<str.length(); i++){
            for(int j = 0; j<str.length(); j++){
            ch = str.substring(i, j);
            }
        for(int k = str.length()-1; k>=0; k--){
            for(int m = str.length()-1; m>=0; m--){
            ch1 = str.substring(k, m);
            }
            if(ch == ch1){
                a = ch;
            }
        }
    }
    System.out.println(ch);
    }
}
