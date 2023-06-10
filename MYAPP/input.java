public class input extends MAIN{
    void def(){
        System.out.println("Enter your Name");
        name = sc.nextLine();
        System.out.println("Enter your Phone number");
        phn = sc.nextInt();
        System.out.println("Enter your Unique ID");
        uid = sc.nextInt();
        System.out.println("Name\tPhone Number\tUnique Id");
        System.out.println(name+"\t"+phn+"\t"+uid);
    }
}