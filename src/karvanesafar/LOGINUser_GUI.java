package karvanesafar;

import java.util.ArrayList;
import java.util.Scanner;

public class LOGINUser_GUI 
{
    String Username_T,Password_T;
    
    Scanner input = new Scanner(System.in);

    LOGINUser_GUI()
    {
        System.out.print("Enter Username: ");
        Username_T = input.next();
        
        System.out.print("Enter Password: ");
        Password_T = input.next();
        
                if (User.SearchUser(Username_T)) 
                {
                    ArrayList<User> list = User.readFromFile();
                    
                    for(User Customer:list)
                    {
                        if(Customer.getUserName().equalsIgnoreCase(Username_T) && Customer.getPassword().equalsIgnoreCase(Password_T)){
                            System.out.println( "\nUser Found \nPlease select an operation,\n");
                            
                            Package_GUI P=new Package_GUI(Customer);
                        }
                        else if (Customer.getUserName().equalsIgnoreCase(Username_T) && !Customer.getPassword().equals(Password_T)){
                            System.out.println("Password/Username Incorrect");
                        }
                    }
                } else {
                    System.out.println("User not found");


                }
    }


}
