//Joshua.K.Vachachira//
//Object-Oriented//
//Payday//

import java.util.Scanner;
import java.util.Random;

public class App{
        public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        
        System.out.println("****************************");
        System.out.println("PayVol1");
        System.out.println("****************************");
        
        
        System.out.print(" Enter many hours have you worked: ");
        double hoursworked = scan.nextDouble();

        System.out.print(" Enter much is your hourly rate: $ ");
        double hourlyrate = scan.nextDouble();

        double basesalary = hoursworked * hourlyrate;
            
        System.out.print("Are you a Union member (y/n): ");

        String unionMember = scan.next().toLowerCase().trim();
        double unionDuesRate  = 0.0;
        if (unionMember.equals("y")){
            unionDuesRate = .05;
        }
        double unionDues = basesalary * unionDuesRate;
       
        System.out.print("Enter the percantage for medical savings accoutant (0-100):");

        double medicalSavingsPercantange = scan.nextDouble() / 100;
        double medicalSavings = medicalSavingsPercantange * basesalary;
        
        

        double number = rand.nextDouble();
        double incidentpay = -200 + (number * (200 - (-200)));


        double adjustgrosspay = basesalary - unionDues + incidentpay;

        double taxrate;
        if (adjustgrosspay <= 2500 ) {
            taxrate = 0.25;
        } else if(adjustgrosspay <= 1500){
            taxrate = 0.15;
        } else if ( adjustgrosspay <= 1000){
            taxrate = 0.10;
        } else {
            taxrate = 0.5;
        }
        
        double taxes = taxrate * adjustgrosspay;

        double NetPay = adjustgrosspay - taxes;
        System.out.println("****************************");
        System.out.println("PayVol1");
        System.out.println("****************************");
        System.out.println("---------PAYCHECK---------");
        System.out.printf("%s $ %.2f\n","Gross Pay",basesalary);
        System.out.printf("%s $ %.2f\n","Union Dues",unionDues);
        System.out.printf("%s $ %.2f\n","Medical Deducation",medicalSavings);
        System.out.printf("%s $ %.2f\n","Incident pay",incidentpay);
        System.out.printf("%s $ %.2f\n","Taxes",taxes);
        System.out.printf("%s $ %.2f\n","NetPay",NetPay);
        System.out.println("--------------------------");
        }
    }
    



