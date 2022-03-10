package karvanesafar;


public class COST_BILL_GUI 
{   
    Tour_Confirmation TOURIST;
    User CUSTOMER;

    COST_BILL_GUI(User CUSTO,Tour_Confirmation Tourist){
        this.CUSTOMER=CUSTO;
        this.TOURIST=Tourist;
        
        
        System.out.println("\n\t\tCOST FOR TOUR");

        System.out.println("Cost for vehicle :");        
        System.out.println(TOURIST.Calculate_Total_For_Vehicle());
        
        System.out.println("Cost for hotel :");
        System.out.println(TOURIST.Calculate_Total_For_Hotel());
        
        System.out.println("Combine Cost : ");
        System.out.println(TOURIST.Total_Cost_For_V_H());
        
        System.out.println("Cost After Commission :");
        System.out.println(TOURIST.Company_Charges_For_Services());
       
        System.out.println("Final Cost After Dis :");
        System.out.println(TOURIST.Final_Cost_After_Disc());

    }
}

