package karvanesafar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class SEARCHUser_GUI 
{
    String Username_T;
    Scanner input = new Scanner(System.in);

    public SEARCHUser_GUI() 
    {
        
        System.out.print("Enter Username: ");
        Username_T = input.next();
        
               System.out.println(User.DisplayUser_Record(Username_T));
    
            System.out.println("Enter 0 for BACK and any other number to exit: ");
                    int x = input.nextInt();

                    if(x == 0)
                    {      
                         User_GUI N=new User_GUI();
                    }
                    else
                    {
                        System.out.println("Good Bye...");
                    }
                
            
        
    }


}
