package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Setcase {

	public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         int a=0,b = 0,c=0,d=0,e=0;int i=1;int n;
         double total;
         ArrayList list=new ArrayList();
         HashSet set=new HashSet();
         Booking[] bo=new Booking[20];
         do {
        	 System.out.println("Menu");
        	 System.out.println("1.Book\n2.Check Status\n3.Exit");
        	 System.out.println("Enter the choice");
            n=s.nextInt();
        	 if(n==1)
        	 {
        		 System.out.println("Check:");
        		 System.out.println("Please choose the service required");
        		 System.out.println("AC/non-AC(AC/nAC)");
        		 String ac=s.next();
        		 if(ac.equals("Ac")==true)
					{
        			 a=1500;
						}
        		 else
        		 {
        			 a=700;
        		 }
        		 System.out.println("cot(Single/Double)");
        		 String cot=s.next();
        		 if(cot.equals("s")==true)
        		 {
        			 b=50;
        		 }
        		 else
        		 {
        			 b=100;
        		 }
        		 System.out.println("with cable/without cable(c/nc)");
        		 String nc=s.next();
        		 if(nc.equals("c")==true)
        		 {
        			 c=50;
        		 }
        		 else
        		 {
        			 c=0;
        		 }
        		 System.out.println("wifi connection(w/nw)");
        		 String wifi=s.next();
        		 if(wifi.equals("w")==true)
        		 {
        			 d=200;
        		 }
        		 else
        		 {
        			 d=0;
        		 }
        		 System.out.println("Laundary service is required or not(L/nL");
        		 String l=s.next();
        		 if(l.equals("L")==true)
        		 {
        			 e=50;
        		 }             
        		 else
        		 {
        			 e=100;
        		 }
        		 
        	 }
        	 total=a+b+c+d+e;
    		 System.out.println("Total charge is"+total);
    		 System.out.println("Do you want to proceed(yes/no)");
    		 String str=s.next();
    		 if(str.equals("yes"))
    		 {
    			 System.out.println("Thank you for booking.your room number is"+i);
    			 i++;
    		 }
    		 if(n==2)
    		 {
    			 System.out.println("Check status");
    			 System.out.println("Enter the room number");
    			 int room=s.nextInt();
    			 if(room==i)
    			 {
    				 System.out.println("room"+i+"is booked");
    			 }
    			 else
    			 {
    				 System.out.println("room is not booked");
    			 }
    			 }
         }while(n!=0);
         

	}

}
