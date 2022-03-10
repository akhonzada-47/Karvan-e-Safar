package karvanesafar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class ADDUser_GUI 
{
    String Fname_T, Lname_T,Email_T,PhoneNo_T;
    int Age_T;

    Scanner input = new Scanner(System.in);
    
    public ADDUser_GUI()
    {
        System.out.print("First Name :");
        Fname_T = input.next();
        
        System.out.print("last Name :");
        Lname_T = input.next();
        
        System.out.print("Email :");
        Email_T = input.next();
          
        System.out.print("Age :");
        Age_T = input.nextInt();
        

            User U1 = new User( Fname_T, Lname_T, Email_T, PhoneNo_T, Age_T );
            User.writeToFile(U1);
            
            System.out.print("User Data Entry Successful\nUSER NAME: "+
                    U1.getUserName()+"\nPASSWORD: "+U1.getPassword());          
           
            
            
        
    }
}
