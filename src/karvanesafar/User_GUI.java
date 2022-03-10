package karvanesafar;

import java.util.Scanner;


public class User_GUI 
{
    Scanner input = new Scanner(System.in);

    public User_GUI()
    {       
        System.out.println("\n1. ADD USER");
        System.out.println("2. Search USER");
        System.out.println("3. Display USER");
        System.out.println("4. Update USER");
        System.out.println("5. Delete USER");
        System.out.println("6. Back");
        
        System.out.print("\tEnter your choice: ");
        int c = input.nextInt();
        
        switch(c)
        {
            case 1:
                ADDUser_GUI AU=new ADDUser_GUI();
                
                break;
            
            case 2:
                SEARCHUser_GUI S=new SEARCHUser_GUI();
                
                break;
            
            case 3:
                DISPLAYUser_GUI D=new DISPLAYUser_GUI();
                
                break;
                        
                   
            case 4:
                UPDATEUser_GUI U=new UPDATEUser_GUI();
                break;
                
            case 5:
                DELETEUser_GUI Del = new DELETEUser_GUI();
                break;
            
            case 6:
                Dashboard t=new Dashboard();
                                
            default:
                System.out.println("Invalid Choice!");
                break;
        }
    }
}
