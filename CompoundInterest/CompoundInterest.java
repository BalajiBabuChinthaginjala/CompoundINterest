package CompoundInterest;

import java.util.Scanner;

public class CompoundInterest {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double principle,Amount;
		double rate;
		double time;
		System.out.println("1.compound interest for yearly");
		System.out.println("2.compound interest for half yearly");
		System.out.println("3.compound interest for quarterly");
		System.out.println("4.rate of interest differ for three years");
		System.out.println("5.present worth of rs x due n years hence");
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter principle amount:");
			principle=sc.nextInt();
			System.out.println("enter rate of interest per annum");
			rate=sc.nextInt();
			System.out.println("enter time in years");
			time=sc.nextInt();
			
			double value=1+rate/100;
			Amount=principle*Math.pow(value, time);
			System.out.println(Amount);
			break;
		case 2:
			System.out.println("enter principle amount:");
			principle=sc.nextInt();
			System.out.println("enter rate of interest per annum");
			rate=sc.nextInt();
			System.out.println("enter time in half yearly");
			time=sc.nextInt();
			
			 value=1+rate/200;
			Amount=principle*Math.pow(value, 2*time);
			System.out.println(Amount);
			break;
		case 3:
			System.out.println("enter principle amount:");
			principle=sc.nextInt();
			System.out.println("enter rate of interest per annum");
			rate=sc.nextInt();
			System.out.println("enter time in quarterly");
			time=sc.nextInt();
			
			 value=1+rate/400;
			Amount=principle*Math.pow(value, 4*time);
			System.out.println(Amount);
			
			break;
		case 4:
			System.out.println("enter principle amount:");
			principle=sc.nextInt();
			System.out.println("enter rate of interest of 1st year");
			 double r1=sc.nextInt();
		    System.out.println("enter rate of interest 2nd year");
			double r2=sc.nextInt();
			System.out.println("enter rate of interest 3rd year");
			double r3=sc.nextInt();
			Amount=principle*(1+r1/100)*(1+r2/100)*(1+r3/100);
			System.out.println(Amount);
			break;
		case 5:
			System.out.println("enter amount :");
			double amount=sc.nextInt();
			System.out.println("enter Present worth");
			 double PW=sc.nextInt();
			System.out.println("enter rate of interest");
			rate=sc.nextInt();
			System.out.println("enter time in years");
			time=sc.nextInt();
			
			
			 value=1+rate/100;
			 
				 PW=amount/Math.pow(value, time);
				 System.out.println(PW);
				 		
			
			
			
		
		}
		
    
		
		
		

	}

}
