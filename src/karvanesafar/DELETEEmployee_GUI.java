package karvanesafar;

import java.util.Scanner;


public class DELETEEmployee_GUI 
{
    
    String Username_T;
    Scanner input = new Scanner(System.in);

    DELETEEmployee_GUI()
    {
        System.out.print("Enter Username: ");
        Username_T = input.next();
    
        System.out.println(Organizer.DeleteEmployee_Record(Username_T));
                
        System.out.println("Enter 0 for BACK and any other number to exit: ");
        int x = input.nextInt();

            if(x == 0)
            {      
                Employee_GUI m=new Employee_GUI();
            }
            else
            {
                System.out.println("Good Bye...");
            }
    }
}
