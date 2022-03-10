package karvanesafar;

import java.util.ArrayList;
import java.util.Scanner;

public class DELETEPackage_GUI 
{
    User CUSTOMER;
    
    DELETEPackage_GUI(User Custo)
    {
        this.CUSTOMER=Custo;
        
        ArrayList<Tour_Confirmation> T=Tour_Confirmation.readFromFile();
        
        for (Tour_Confirmation TT: T)
        {
        System.out.println(Tour_Confirmation.DeleteTourRecord(CUSTOMER.getUserName(),CUSTOMER.getPassword()));
        }
        
        Package_GUI a = new Package_GUI(CUSTOMER);

    }

}
