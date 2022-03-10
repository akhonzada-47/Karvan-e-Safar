package karvanesafar;

import java.util.Scanner;


public class Employee_GUI 
{
    Scanner input = new Scanner(System.in);
    
    Employee_GUI()
    {
        System.out.println("1. ADD Employee");
        System.out.println("2. Search Employee");
        System.out.println("3. Display Employee");
        System.out.println("4. Update Employee");
        System.out.println("5. Delete Employee");
        System.out.println("6. Back");
        
        System.out.print("\tEnter your choice: ");
        int c = input.nextInt();
        
        switch(c)
        {
            case 1:
                ADDEmployee_GUI AE=new ADDEmployee_GUI();
                break;
            
            case 2:
                SEARCHEmployee_GUI S=new SEARCHEmployee_GUI();
                break;
            
            case 3:
                DISLAYEmployee_GUI D=new DISLAYEmployee_GUI();                
                break;                        
                   
            case 4:
                UPDATEEmployee_GUI U=new UPDATEEmployee_GUI();
                break;
                
            case 5:
                DELETEEmployee_GUI Del=new DELETEEmployee_GUI();
                break;
            
            case 6:
                Dashboard t=new Dashboard();
                                
            default:
                System.out.println("Invalid Choice!");
                break;
        }
    }
}
