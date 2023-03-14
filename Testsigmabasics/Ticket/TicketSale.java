package Testsigmabasics.Ticket;
import java.util.*;


class TicketSale implements java.io.Serializable {
   static Map<String, Double> BUS = Map.of(
            "RedBus", 120.0,
            "YBM", 122.0,
            "MSD",126.0,
            "BYD",118.0
    );
   static Map<String, Double> TRAIN = Map.of(
            "RedRails", 50.0,
            "IRCTC", 55.0,
            "MSD",60.0,
            "BYD",57.0
    );
    static Map<String, Double> FLIGHT= Map.of(
            "RedBus", 500.0,
            "YBM", 580.0,
            "MSD",560.0,
            "BYD",540.0
    );
    void display(Map<String,Double> x){
        x.forEach((k,v) -> System.out.println(k+" "+v+"/km")
    );
    }
    void selection(Map<String,Double> temmporaryMap){
        String service;int km;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nEnter the Service Provider : ");
            service = scanner.next();
            System.out.println("Enter the km : ");
            km = scanner.nextInt();
            fareCalculator(temmporaryMap.get(service),km);
        }
        catch(NullPointerException e)
        {
            System.out.println("Enter valid Entry!");
            display(temmporaryMap);
            selection(temmporaryMap);
        }

    }
    void fareCalculator(Double amount,int km){
        System.out.println("\nYour Total Fare is : "+amount*km+"\n");
    }

}

