package karvanesafar;

import java.util.ArrayList;
import java.util.Scanner;

public class DISLAYEmployee_GUI
{
    Scanner input = new Scanner(System.in);
    DISLAYEmployee_GUI()
    {

                ArrayList<Organizer> O_DATA=Organizer.readFromFile();
                
                for (Organizer O: O_DATA)
                {
                    System.out.println(Organizer.DisplayEmployee_Record(O.getUserName()));
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
