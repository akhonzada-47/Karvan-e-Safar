package karvanesafar;


import java.util.Scanner;

public class ADDEmployee_GUI
{
    String Fname_T, Lname_T,Email_T,PhoneNo_T, Designation_CB;
    
    Scanner input = new Scanner(System.in);

    ADDEmployee_GUI()
    {
        System.out.print("First Name :");
        Fname_T = input.next();
        
        System.out.print("last Name :");
        Lname_T = input.next();
        
        System.out.print("Email :");
        Email_T = input.next();
          
        System.out.print("Age :");
        Designation_CB = input.next();

        
                Organizer O1 = new Organizer(  Fname_T, Lname_T, Email_T, PhoneNo_T, Designation_CB);
                
                System.out.print("Employee Data Entry Successful\nUSER NAME:\n"+
                        O1.getUserName()+"\nPASSWORD:\n"+O1.getPassword());
                
                Organizer.writeToFile(O1);
                               
                System.out.println("Enter 0 for BACK and any other number to exit: ");
            int x = input.nextInt();

            if(x == 0)
            {      
                Employee_GUI M=new Employee_GUI();
            }
            else
            {
                System.out.println("Good Bye...");
            }
                
                
            
    }
}
