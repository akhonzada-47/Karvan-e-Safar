package karvanesafar;

import java.util.Scanner;

public class Dashboard  
{
    public Dashboard()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Travel and Tourist Managment System\n\n\t\t\t ----- ***  KARVAN-E-SAFAR  *** -----\n");
        System.out.println("\t\t\t\t    > DASHBOARD <\n");
        
        
        
        
        System.out.println("1. Customer");
        System.out.println("2. Admin");
        
        System.out.print("\tEnter your choice: ");
        int c = input.nextInt();
        
        switch(c)
        {
            case 1:
                System.out.println("1. LogIn");
                System.out.println("2. SignUp"); 
                int x = input.nextInt();
                if(x ==1){
                    LOGINUser_GUI G=new LOGINUser_GUI();}
                else if(x==2){
                    ADDUser_GUI AU=new ADDUser_GUI(); 
                    LOGINUser_GUI G=new LOGINUser_GUI();}                    
                break;
            
            case 2:
                System.out.println("1. Customer Panel");
                System.out.println("2. Employee Panel"); 
                System.out.println("3. Company Details");
                int y = input.nextInt();
                if(y ==1){
                    User_GUI G=new User_GUI();}
                else if(y==2){
                    Employee_GUI AU=new Employee_GUI();}
                else if(y==3){
                    Company_GUI AU=new Company_GUI();}
                break;
            
            default:
                System.out.println("Invalid Choice!");
                break;
        }   
            
    }
    

}
