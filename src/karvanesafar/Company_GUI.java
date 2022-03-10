package karvanesafar;

import java.util.Scanner;

public class Company_GUI 
{
    Scanner input = new Scanner(System.in);

    Company_GUI()
    {
        System.out.println("1. Display Company details");
        System.out.println("2. Update Company Details");
        System.out.println("3. Back");
        
        int c = input.nextInt();
        
        switch(c)
        {
            case 1:
                DISPLAY_Company_GUI GUI=new DISPLAY_Company_GUI();                
                break;
            
            case 2:
                UPDATECompany_GUI UC=new UPDATECompany_GUI();                
                break;
                                  
                   
            case 3:
                Dashboard t=new Dashboard();
                break;
              
                                
            default:
                System.out.println("Invalid Choice!");
                break;
        }
    }
}
