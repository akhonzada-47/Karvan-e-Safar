package karvanesafar;

import java.util.ArrayList;
import java.util.Scanner;

public class UPDATECompany_GUI 
{
    
    String CNAME_T, C_MName_T,CPhoneNo_T,P_Address_T,C_Address_T;
    int O_Address_T;
    
    Scanner input = new Scanner(System.in);

    UPDATECompany_GUI()
    {
        System.out.print("Company Name :");
        CNAME_T = input.next();
        
        System.out.print("Manager Name :");
        C_MName_T = input.next();
        
        System.out.print("Phone Num :");
        CPhoneNo_T = input.next();
          
        System.out.print("Plot No. :");
        O_Address_T = input.nextInt();
        
        System.out.print("Street :");
        P_Address_T = input.next();
        
        System.out.print("City :");
        P_Address_T = input.next();
        

        
        Address A = new Address(O_Address_T,P_Address_T,C_Address_T);
        
        ArrayList <Organizer> O = Organizer.readFromFile();
        
        Company C1 = new Company(CNAME_T, C_MName_T,O, A,CPhoneNo_T);
        Company.updateFile(C1);
        System.out.println( "Updated successfully\n"+Company.Display());
                
        
        System.out.println("Enter 0 for BACK and any other number to exit: ");
        int x = input.nextInt();
        
        if(x == 0)
        {      
            Company_GUI M=new Company_GUI();
        }
        else
        {
            System.out.println("Good Bye...");
        }      
    }  
}



