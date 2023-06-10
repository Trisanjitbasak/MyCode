import java.util.*;
public class MAIN{
    int phn, uid;
    String name;
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        input ob = new input();
        System.out.println("Enter 1 for Adding a new customer");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                ob.def();
        }
    }
}