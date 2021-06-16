import java.util.Scanner;

public class username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        String roll;
        System.out.println("enter name and roll no.");
        name=sc.next();
        roll=sc.next();
        String password= name+"20csu"+roll; //aman20csu336
        String user=name+"20csu"+roll+"@ncuindia.edu"; //aman20csu336@ncuindia.edu

        System.out.println("enter username");
        String n1= sc.next();
        System.out.println("enter your password");
        String n2 = sc.next();

        while(!n2.equals(password) || !n1.equals(user) )
        {
            if(!n1.equals(user)) {
                System.out.println("enter username again");
                n1 = sc.next();
            }
            else
            {
                System.out.println("enter password again");
                n2 = sc.next();
            }
            
        }
        System.out.println("successful login attempt");

    }

}
