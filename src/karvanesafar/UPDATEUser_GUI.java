package karvanesafar;

import java.util.Scanner;


public class UPDATEUser_GUI
{
    
    String Username_T, newUsername_T,newPassword_T,Fname_T, Lname_T,Email_T,PhoneNo_T;
            int Age_T;

    Scanner input = new Scanner(System.in);
    
    public UPDATEUser_GUI() 
    {
        
        System.out.print("Username :");
        Username_T = input.next();

        if (User.SearchUser(Username_T)) 
        {
            System.out.print("User found\n Update User Data,\n");

            System.out.print("First Name :");
            Fname_T = input.next();

            System.out.print("last Name :");
            Lname_T = input.next();

            System.out.print("Email :");
            Email_T = input.next();

            System.out.print("Age :");
            Age_T = input.nextInt();

            System.out.print("New Username :");
            newUsername_T = input.next();

            System.out.print("New Password :");
            newPassword_T = input.next();

        
                    User U1 = new User( Fname_T, Lname_T, Email_T, PhoneNo_T, Age_T);
                    
                    System.out.print( "User Data Updated Sucessfull\n New USER NAME:\n"+
                            newUsername_T+"\n New PASSWORD:\n"+newPassword_T);
                    User.updateUser(Username_T,U1,newUsername_T,newPassword_T);
                    
                    System.out.println("Enter 0 for BACK and any other number to exit: ");
                    
            int x = input.nextInt();

            if(x == 0)
            {      
                 User_GUI U=new User_GUI();
            }
            else
            {
                System.out.println("Good Bye...");
            }
        } 
        else 
        {
            System.out.print("User not found");
        }
    }
        
}
          
        
