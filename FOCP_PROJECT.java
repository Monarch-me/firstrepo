package Focp.team66;

import java.util.*;
/*Friend List App: A java application to display Friend List where we can add update and delete the friend’s details in the list.
Create appropriate class to store person information. Create an array to store the friendship among different people.
Definition of Done:
i. The system should ask user to enter user name and password.
On successful login, System opens/Creates a Friend List for the logged user.
ii. The system should ask user to enter an option from the selected list of operations(Add, Update, Delete)
iii. The system should ask the user to enter Friend’s Name, Contact Number, Address and Date of Birth.
iv. The system should perform the desired operation on the FriendList.txt file for the logged in user (Add, Delete, Update, display).
v. The project directory structure should explain about all subdirectories and what kind of files to be kept into particular sub directory.
vi. All configuration data should be kept in properties files. It should maintainable based on different categories.*/

class Friend{
    String name,address,date_of_birth;
    String number;
    String [] friends;
    int no_of_friends;

    public Friend(String name,String address,String date_of_birth,String number){
        this.friends = new String[100];
        this.no_of_friends = 0;
        this.name=name;
        this.address=address;
        this.date_of_birth = date_of_birth;
        this.number = number;
    }
    void add_friend(String friend){
        this.friends[no_of_friends] = friend;
        no_of_friends++;
        System.out.println(friend + " Has been added to the friend list");
    }
    void delete_friend(String friend){
        this.friends[no_of_friends] = friend;
        no_of_friends--;
        System.out.println(friend + " Has been removed from the friend list");
    }

}

public class FOCP_PROJECT {
    public static void main(String[] args) {
        Friend obj = new Friend("Rishab","NCU Gurgaon","7th june","870000000000");
        obj.add_friend("Aman");
        obj.delete_friend("Amam");

        Scanner sc = new Scanner(System.in);
        String name;
        String roll;
        System.out.println("Enter your name ");
        name=sc.next();
        System.out.println("Enter your Roll No. ");
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
            else //if(!n2.equals(password))
            {
                System.out.println("enter password again");
                n2 = sc.next();
            }
            //System.out.println("n2 is "+n2);
        }
        System.out.println("successful login attempt");


    }
}