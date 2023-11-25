import test.External;
import java.util.Scanner;

class Power_bill{

public static void main(String args[]){

int ch;
Scanner sc = new Scanner(System.in);
External SR = new External();

do{

System.out.println("Enter type of connection(1.Domestic or 2.Commercial)");

ch = sc.nextInt();

switch(ch){
case 1 :
        SR.m1();
break;
case 2 :
        SR.m2();   
break;
default :
System.out.println("Invalid");
break;
}
}while(ch<3);
}
}