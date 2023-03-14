package Testsigmabasics.Ticket;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        TicketSale ticket = new TicketSale();
        int choice = 1;
        do{
            System.out.println("Which travel do u want \n1.Bus\n2.Train\n3.Flight");
            choice = scanner.nextInt();
            switch(choice){
                case 1: ticket.display(ticket.BUS);
                    ticket.selection(ticket.BUS);
                    break;
                case 2: ticket.display(ticket.TRAIN);
                    ticket.selection(ticket.TRAIN);
                    break;
                case 3: ticket.display(ticket.FLIGHT);
                    ticket.selection(ticket.FLIGHT);
                    break;
                default: System.out.println("Enter Valid Choice");
                    break;
            }
        }while(choice<4 & choice>0);
        try {
            FileOutputStream fileOut = new FileOutputStream("src/Assignment/Ticket/ticket.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(ticket);
            out.close();
            fileOut.close();

        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
