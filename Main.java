/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
        public static customer[] customers= new customer[100];
        public static item[] items= new item[100];
        public static bill[] bills= new bill[1000];
        public static int customer_count=0,item_count=0,billid_count=1;
	public static void main(String[] args) 
	{
	    Scanner s = new Scanner(System.in);
        System.out.println("     Welcome A WARM GREETINGS ! ");
        while(true)
        {
        System.out.println();
        System.out.println("        1. Create item");
		System.out.println("        2. Create customer");
		System.out.println("        3. Create bill");
		System.out.println("        4. Bill List");
		System.out.println("        5. Bill details by bill number");
		System.out.println("        6. Item List");
		System.out.println("        7. Customer List");
		System.out.println("        8. No of Bills of a customer");
		System.out.println("        9. Total sales amount of a customer");
		System.out.println("        10. Exit");
		System.out.println();
		System.out.println("Select an option");
		int opt=s.nextInt();
		switch(opt)
		{
		    case 1:
		        {

		        System.out.println();
                System.out.println("Enter the item name");
		        String item_name=s.next();
                System.out.println("Enter the rate of item");
                int item_price=s.nextInt();
                items[item_count]=new item(item_name,item_count,item_price);
		        System.out.println(items[item_count].item_name);
		        item_count++;
		        break;
		        }
            case 2:
		        {

		        System.out.println();
                System.out.println("Enter your name");
		        String customer_name=s.next();
		        System.out.println("your Customer id is "+customer_count);
		        customers[customer_count]=new customer(customer_name,customer_count);
		        customer_count++;
		        break;
		        }
		    case 3: 
		        {
		        System.out.println();
		        System.out.println("Enter the customer id");
		        int customer_id=s.nextInt();
		        int total;
		        bills[billid_count]=new bill(billid_count,customers[customer_id]);
		        billid_count++;
                System.out.println(bills[billid_count-1]);
		        break;
		        }
		    case 4:
		        {

		        System.out.println();
		        for(int k=1;k<billid_count;k++)
		            {
                        System.out.println(bills[k]);
                    }
                    break;
		        }
		    case 5:
		        {

		        System.out.println();
		        System.out.println("Enter bill no");
		        int viewbill=s.nextInt();
		        for(int k=0;k<billid_count;k++)
		            {
                        if(bills[k].bill_id==viewbill)
                        {
                            System.out.println(bills[k]);
                        }
                    }
                    break;
		        }
		    case 6:
		         {

		          System.out.println();
		          System.out.println("No     Name       Rate");
                  for(int k=0;k<item_count;k++)
                    {
                        System.out.println(items[k]);
                    }
                break;
	        	}
		    case 7:
		        {

		          System.out.println();
		          System.out.println("ID       Name");
		          for(int k=0;k<customer_count;k++)
                    {
                        System.out.println(customers[k]);
                    }
                break;
	        	}
		    case 8:
		         {
		            
		          System.out.println();
		          System.out.println("Enter Customer Id");
		          int customerno=s.nextInt();
		          System.out.println("CustomerId     BillId     TotalAmount");
		          for(int k=1;k<billid_count;k++)
                    {
                        if(bills[k].customers.customer_id==customerno)
                        {
                            System.out.println(bills[k].displaylist());
                        }
                    }
		          break;  
		        }
		    case 9:
		       {
		          
		          System.out.println();
		          System.out.println("Enter Customer Id");
		          int customerno=s.nextInt();
		          int totalamt=0;
		          for(int k=1;k<billid_count;k++)
                    {
                        if(bills[k].customers.customer_id==customerno)
                        {
                            totalamt=totalamt+bills[k].totalamount;
                        }
                    }
		          System.out.println("TotalAmount = "+totalamt);
		          break;  
		        }
	        default:
	            {
	                return;
	            }
        }
        }
		
	}
}
