import java.util.Scanner;

class SmartCity
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("\t**********Smart City Utility Menu********");
        System.out.println("1. Electricity Bill");
        System.out.println("2. Water Bill");
        System.out.println("3. Internet Plan");
        System.out.println("4. Exit");

        System.out.println("Choose any one bill option:");
        int bill=sc.nextInt();

        if(bill==1)
        {
            System.out.println("\t****Electricity bill****");
			System.out.println("1. less than or equal 100 unit");
			System.out.println("2. less than or equal 101-299 unit");
			System.out.println("3. greater than or equal 300 unit");
            System.out.print("enter   Electricity unit :");
			int unit=sc.nextInt();
			if(unit<=100)
			{
			   System.out.println("you have been chose the /n /n****1****1 option that is less the __100 unit__****");
				System.out.println("your current bill is less than/n/n <<100 so cost is $2>> ");
				System.out.println("Enter the Payment");
				int cost=sc.nextInt();
				if(cost==2)
				{
				System.out.println(" your payment successfull");
				}
				else
				{
				System.out.println(" your payment  can't successfull");
				}
			}
			else if((unit>=101)&&(unit<=299))
			{
				System.out.println("you have been chose the ****2 option that is greater the __101 to 299 unit__****");
				System.out.println("your current bill is less than <<101 to 299 unit so cost is $3>> ");
				System.out.println("Enter the Payment");
				int cost=sc.nextInt();
				if(cost==3)
				{
				System.out.println(" your payment successfull");
				}
				else
				{
				System.out.println(" your payment  can't successfull");
				}
			}
			else if(unit>=300)
			{
				System.out.println("you have been chose the ****3 option that is greater the __ 300 unit__****");
				System.out.println("your current bill is greater than  300 unit so cost is $5>> ");
				System.out.println("Enter the Payment");
				int cost=sc.nextInt();
				if(cost==5)
				{
				System.out.println(" your payment successfull");
				}
				else
				{
				System.out.println(" your payment  can't successfull");
				}
				
			}
	    }
		
        else if (bill==2)
        {
			System.out.println("\t**** Water Bill ****");
            System.out.println("1. apartment house PLAN");
            System.out.println("2. individual house PLAN");
            System.out.println("what is your type of apartment or individual chose only ");
		     int bil=sc.nextInt();

        if(bil==1)
        {
            System.out.println("\t****Water bill****");
			System.out.println(" you have chose the apartment type");
			System.out.println("cost is $300");
            System.out.print("enter payment :");
			int cost=sc.nextInt();
			if(cost==300)
			{
			   
				System.out.println(" your payment successfull");
				}
				else
				{
				System.out.println(" your payment  can't successfull");
				}
			}
			 else if(bil==2)
        {
            System.out.println("\t****Water bill****");
			System.out.println(" you have chose individual type");
			System.out.println("cost is $500");
            System.out.print("enter payment :");
			int cost=sc.nextInt();
			if(cost==500)
			{
			   
				System.out.println(" your payment successfull");
				}
				else
				{
				System.out.println(" your payment  can't successfull");
				}
			}
		
		}	

            //house type apartment  monthly charge 300 
			// individual house monthly charge500 water bill 
        

        else if (bill==3)
        {
            System.out.println("\t**** You clicked INTERNET PLAN ****");
            System.out.println("1. BASIC PLAN");
            System.out.println("2. STANDARD PLAN");
            System.out.println("3. PREMIUM PLAN");

            System.out.println("Choose any one plan:");
            int plan=sc.nextInt();

            if(plan==1)
            {
                System.out.println("You selected BASIC PLAN");
                System.out.println("Cost is 399");
                System.out.println("Enter payment:");

                int pay=sc.nextInt();

                if(pay==399)
                {
                    System.out.println("Recharge SUCCESSFUL - BASIC PLAN");
                }
                else
                {
                    System.out.println("Payment failed for BASIC PLAN");
                }
            }

            else if(plan==2)
            {
                System.out.println("You selected STANDARD PLAN");
                System.out.println("Cost is 699");
                System.out.println("Enter payment:");

                int pay=sc.nextInt();

                if(pay==699)
                {
                    System.out.println("Recharge SUCCESSFUL - STANDARD PLAN");
                }
                else
                {
                    System.out.println("Payment failed for STANDARD PLAN");
                }
            }

            else if(plan==3)
            {
                System.out.println("You selected PREMIUM PLAN");
                System.out.println("Cost is 999");
                System.out.println("Enter payment:");

                int pay=sc.nextInt();

                if(pay==999)
                {
                    System.out.println("Recharge SUCCESSFUL - PREMIUM PLAN");
                }
                else
                {
                    System.out.println("Payment failed for PREMIUM PLAN");
                }
            }
        }

        else
        {
            System.out.println("Exit");
        }
    }
}