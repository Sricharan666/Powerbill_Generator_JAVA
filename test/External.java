package test;
import java.util.Scanner;
public class External{
     int      ch;
     long     Consumer_number;
     String   consumer_name;
     double   units,total_bill;
     Scanner sc = new Scanner(System.in);
    
    public void m1(){
           
            System.out.println("Enter Consumer number ");
            Consumer_number = sc.nextLong();
            System.out.println("Enter Consumer name");
             consumer_name = sc.next();
            System.out.println("Enter no.of Units consumed");
             units = sc.nextDouble();
		if (units>=0 && units<=100) {
		     total_bill=25+units*2.6;
	      }else if (units>100 && units<=300) {
		     total_bill=50+units*3.35;
	      }else if (units>300 && units<=500) {
		     total_bill=75+units*5.4;
		} else {
		     total_bill=100+units*6.5;
	      }
             System.out.println("\t\t\t|\t T S N D P C L\t\t|");
             System.out.println("\t\t\t|\t\t\t\t|");
             System.out.println("\t\t\t|CONSUMER NAME:"+consumer_name+"\t\t|");
             System.out.println("\t\t\t|\t\t\t\t|");
		 System.out.println("\t\t\t|CONSUMER NUMBER:"+Consumer_number+"\t\t|");
             System.out.println("\t\t\t|\t\t\t\t|");
             System.out.println("\t\t\t|H.no:2-18/1warangal\t\t|");
             System.out.println("\t\t\t|CAT:2  SC:0   PH:3\t\t|");
             System.out.println("\t\t\t|-------------------------------|");
             System.out.println("\t\t\t|\t\t\t\t|");
             System.out.println("\t\t\t|TYPE OF CONECTION : DOMESTIC\t|");
             System.out.println("\t\t\t|\t\t\t\t|");
             System.out.println("\t\t\t|ENERGY CHARGES   :   56321.00\t|");
             System.out.println("\t\t\t|-------------------------------|");
             System.out.println("\t\t\t| READING     MONTH      STATUS |");
             System.out.println("\t\t\t|\t\t\t\t|");
             System.out.println("\t\t\t|PRES:553240  05/2022   01\t|");
             System.out.println("\t\t\t|PREV:543210  O4/2022   01\t|");
             System.out.println("\t\t\t|\t\t\t\t|");
             System.out.println("\t\t\t|TOTAL UNITS:"+units+"\t\t|");
              System.out.println("\t\t\t|\t\t\t\t|");
		 System.out.println("\t\t\t|TOTAL AMOUNT DUE :"+total_bill+"\t|");
             System.out.println("\t\t\t|\t\t\t\t|");
 }
     public void m2(){
          
            System.out.println("Enter Consumer number ");
             Consumer_number = sc.nextLong();
            System.out.println("Enter Consumer name");
             consumer_name = sc.next();
            System.out.println("Enter no.of Units consumed");
             units = sc.nextDouble();
		if (units>=0 && units<=100) {
		     total_bill=25+units*3.5;
	      }else if (units>100 && units<=300) {
		     total_bill=50+units*5.46;
	      }else if (units>300 && units<=500) {
		     total_bill=75+units*7.24;
		} else {
		     total_bill=100+units*8.2;
	      }
             System.out.println("\t\t\t|\t T S N D P C L\t\t|");
             System.out.println("\t\t\t|\t\t\t\t|");
             System.out.println("\t\t\t|CONSUMER NAME:"+consumer_name+"\t\t|");
             System.out.println("\t\t\t|\t\t\t\t|");
		 System.out.println("\t\t\t|CONSUMER NUMBER:"+Consumer_number+"\t\t|");
             System.out.println("\t\t\t|\t\t\t\t|");
             System.out.println("\t\t\t|H.no:2-18/1warangal\t\t|");
             System.out.println("\t\t\t|CAT:2  SC:0   PH:3\t\t|");
             System.out.println("\t\t\t|-------------------------------|");
             System.out.println("\t\t\t|\t\t\t\t|");
             System.out.println("\t\t\t|TYPE OF CONECTION : COMERCIAL\t|");
             System.out.println("\t\t\t|\t\t\t\t|");
             System.out.println("\t\t\t|ENERGY CHARGES   :   56321.00\t|");
             System.out.println("\t\t\t|-------------------------------|");
             System.out.println("\t\t\t| READING     MONTH      STATUS |");
             System.out.println("\t\t\t|\t\t\t\t|");
             System.out.println("\t\t\t|PRES:553240  05/2022   01\t|");
             System.out.println("\t\t\t|PREV:543210  O4/2022   01\t|");
             System.out.println("\t\t\t|\t\t\t\t|");
             System.out.println("\t\t\t|TOTAL UNITS:"+units+"\t\t|");
              System.out.println("\t\t\t|\t\t\t\t|");
		 System.out.println("\t\t\t|TOTAL AMOUNT DUE :"+total_bill+"\t|");
             System.out.println("\t\t\t|\t\t\t\t|");
}
public static void main(String args[]){

 }
}