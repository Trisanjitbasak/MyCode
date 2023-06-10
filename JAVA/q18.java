import java.util.Scanner;
class q18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = sc.next();
        s=" "+s;
        String w="", k="";
        for(int i = s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if(ch == ' '){
                String m = "";
                char v = s.charAt(i);
                char c = s.charAt(0);
                for(int j = w.length()-1; j>=0; j--){
                    m = m+w.charAt(j);
                }
                if(w.equalsIgnoreCase(m)){
                    System.out.println(m+" is a Palindrome Word as well as a Special Number");
                }
                else if(v == c){
                    System.out.println("It is only a Special Number");
                }
                w="";
            }
            else
                w=w+ch;
        }
        
    }
}