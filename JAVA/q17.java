import java.util.Scanner;
class q17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String s = sc.nextLine();
        s=s+" ";
        int c=0, k = s.length();
        char a, b;
        for(int i = 0; i<k-1; i++){
            a = s.charAt(i);
            b = s.charAt(i+1);
            if(a == b)
                c++;    
        }
        System.out.println(c);
    }
}