package karvanesafar;

import java.util.ArrayList;
import java.util.Scanner;

public class DISPLAY_PACKAGE_GUI
{

    User CUSTOMER;
    
    Scanner input = new Scanner(System.in);
    DISPLAY_PACKAGE_GUI(User Custo)
    {
        this.CUSTOMER=Custo;        

                ArrayList<Tour_Confirmation> T=Tour_Confirmation.readFromFile();
                
                System.out.print(Tour_Confirmation.displayAllData(CUSTOMER.getUserName(),CUSTOMER.getPassword()));
            
            System.out.println("Enter 0 for BACK and any other number to exi: ");
            int x = input.nextInt();
            if(x == 0)
            {      
                Package_GUI b = new Package_GUI(CUSTOMER);
            }
            else
            {
                System.out.println("Good Bye...");
            }              
            
        

    }
}
