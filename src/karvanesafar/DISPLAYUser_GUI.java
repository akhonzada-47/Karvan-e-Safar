package karvanesafar;

import java.util.ArrayList;
import java.util.Scanner;

public class DISPLAYUser_GUI
{
    Scanner input = new Scanner(System.in);

    DISPLAYUser_GUI()
    {
        ArrayList<User> U_DATA=User.readFromFile();
        
        for (User U: U_DATA)
        {
            System.out.println(User.DisplayUser_Record(U.getUserName()));
        }
        
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
}

