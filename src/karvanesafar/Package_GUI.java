package karvanesafar;

import java.util.Scanner;

public class Package_GUI 
{
    User CUSTOMER;
    
    Scanner input = new Scanner(System.in);

    Package_GUI(User Custo)
    {
        this.CUSTOMER=Custo;
        
        System.out.println("1. ADD Package");
        System.out.println("2. Delete Package");
        System.out.println("3. Display Packages");
        System.out.println("4. Display Cost");
        System.out.println("5. Back");
        
        System.out.print("\tEnter your choice: ");
        int c = input.nextInt();
        
        switch(c)
        {            
            case 1:
                if(Tour_Confirmation.SearchUser(CUSTOMER.getUserName(),CUSTOMER.getPassword()))
                {
                    System.out.println( "Complete or Delete your previous trip to schedule another ");
                }else{
                        ADD_TOUR_PackageGUI P=new ADD_TOUR_PackageGUI(CUSTOMER);
                     }                
                break;                        
                   
            case 2:
                DELETEPackage_GUI D=new DELETEPackage_GUI(CUSTOMER);
                break;
                
            case 3:
                DISPLAY_PACKAGE_GUI DO=new DISPLAY_PACKAGE_GUI(CUSTOMER);
                break;
            
            case 4:
                if(Tour_Confirmation.SearchUser(CUSTOMER.getUserName(),CUSTOMER.getPassword()))
                {
                    COST_BILL_GUI CB=new COST_BILL_GUI(CUSTOMER,Tour_Confirmation.Display_Tour(CUSTOMER.getUserName(),CUSTOMER.getPassword()));
                }
                else
                {
                    System.out.println("No data found");
                }
                break;
            
            case 5:
                Dashboard t=new Dashboard();
                                
            default:
                System.out.println("Invalid Choice!");
                break;
        }
        
    } 
                
            
}
