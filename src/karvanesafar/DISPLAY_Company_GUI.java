package karvanesafar;

import java.util.Scanner;

public class DISPLAY_Company_GUI
{
    Scanner input = new Scanner(System.in);
    
    DISPLAY_Company_GUI()
    {
        Company c=Company.readFromFile();      

        System.out.println("COMPANY NAME : "+c.getCompany_Name());
        System.out.println("MANAGER NAME : "+c.getManager());
        System.out.println("COMPANY PHONE NO : "+c.getCompany_PhoneNo());
        System.out.println("COMPANY ADDRESS :   Office No: "+c.getCompany_location().getOfficeNo());
        System.out.println(" Plaza Name : "+c.getCompany_location().getPlazaName()
                +", "+c.getCompany_location().getCity());
        
        System.out.println("Enter 0 for BACK and any other number to exi: ");
        int x = input.nextInt();
        if(x == 0)
        {      
            Company_GUI N=new Company_GUI();
        }
        else
        {
            System.out.println("Good Bye...");
        }         
        
    }
}

