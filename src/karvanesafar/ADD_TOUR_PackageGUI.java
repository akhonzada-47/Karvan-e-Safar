package karvanesafar;

import java.util.ArrayList;
import java.util.Scanner;

public class ADD_TOUR_PackageGUI 
{
    String From_Trips_CB, To_Trips_CB;
    int NoOfDays_T, Date_T,Capacity_CB, Month_CB,Year_CB, No_Room_CB;

    User CUSTOMER;
    
    Scanner input = new Scanner(System.in);

    ADD_TOUR_PackageGUI(User CUSTO)
    {

        this.CUSTOMER=CUSTO;

        System.out.print("Trip From: ");
        From_Trips_CB = input.next();
        
        System.out.print("Trip To: ");
        To_Trips_CB = input.next();
        
        System.out.print("Capacity: ");
        Capacity_CB = input.nextInt();
        
        System.out.print("Num of Days: ");
        NoOfDays_T = input.nextInt();
        
        System.out.print("Date: ");
        Date_T = input.nextInt();
        System.out.print("Month: ");
        Month_CB = input.nextInt();
        System.out.print("Year: ");
        Year_CB = input.nextInt();
        
        System.out.print("Num Of Rooms: ");
        No_Room_CB = input.nextInt();
        
     
                String FROM = From_Trips_CB;
                String To = To_Trips_CB;
                int Cap = Capacity_CB;
                int No_Of_Days = NoOfDays_T;
                int Date = Date_T;
                int Month = Month_CB;
                int Year = Year_CB;
                int Room = No_Room_CB;

                System.out.print("\n\n1. Preview Details\n 2.Next\n3.Cancel");
                int c = input.nextInt();
                if (c==1) 
                {
                    System.out.print("\nTrip FROM : " + FROM + "\nTRIP TO : " + To + "\nCapacity Rec :"
                            + Cap + "\nNo Of Days : " + No_Of_Days + "\nDate :" 
                            + Date + "/" + Month + "/" + Year + "\nNo Of Rooms :" + Room);
                }
                else if  (c==2) 
                {
                    Date DA = new Date(Date, Month, Year);
                    Destination D = new Destination(FROM, To);
                    Package P = new Package(D, Cap, No_Of_Days, DA, Room);

                    ArrayList<Vehicle> V = Vehicle.readFromFile();
                    ArrayList<Hotel> H = Hotel.readFromFile();
                    //ArrayList<Organizer> O = Organizer.readFromFile();

                    Tour_Confirmation T = new Tour_Confirmation(CUSTOMER, P, V, H);
                    Tour_Confirmation.writeToFile(T);
                    Tour_Confirmation.readFromFile();

                    System.out.println(Tour_Confirmation.displayAllData(CUSTOMER.getUserName(),CUSTOMER.getPassword()));
                    
                    Package_GUI PPPP=new Package_GUI(CUSTOMER);
                }
                else
                    System.out.print("Good Bye...");
            
    }
}
