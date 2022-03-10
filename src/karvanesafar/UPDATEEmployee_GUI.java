package karvanesafar;

import java.util.Scanner;

public class UPDATEEmployee_GUI
{
    String Username_T, newUsername_T,newPassword_T,Fname_T, Lname_T,Email_T,PhoneNo_T, Designation_CB;
    
    Scanner input = new Scanner(System.in);

    UPDATEEmployee_GUI()
    {

        System.out.print("Enter Username: ");
        Username_T = input.next();

                if (Organizer.SearchEmployee(Username_T)) 
                {
                    System.out.print("User found\n Update User Data,\n");

                    System.out.print("First Name :");
                    Fname_T = input.next();

                    System.out.print("last Name :");
                    Lname_T = input.next();

                    System.out.print("Email :");
                    Email_T = input.next();

                    System.out.print("Age :");
                    Designation_CB = input.next();

                    System.out.print("New Username :");
                    newUsername_T = input.next();

                    System.out.print("New Password :");
                    newPassword_T = input.next();
                    
                    Organizer O1 = new Organizer( Fname_T, Lname_T, Email_T, PhoneNo_T, Designation_CB);
                    
                    System.out.println("User Data Updated Sucessfull\n New USER NAME:\n"+
                            newUsername_T+"\n New PASSWORD:\n"+newPassword_T);
                    
                    Organizer.updateEmployee(Username_T,O1,newUsername_T,newPassword_T);
                    
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
                else 
                {
                    System.out.print("Employee not found");
                }
            
        }
    
    


           
            
                    
                   
                    
                    Employee_GUI E=new Employee_GUI();
                
            
        
    
}
