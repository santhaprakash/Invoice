import java.util.*;
public class bill extends Main
{
    Scanner s=new Scanner(System.in);
    public static int bill_itemno=0;
    public int bill_id;
    public customer customers;
    billitems[] buyitems= new billitems[100];
    public int totalamount=0;
    bill(int bill_id,customer customers)
    {
        this.bill_id=bill_id;
        this.customers=customers;
        while(true)
        {
            System.out.println();
            System.out.println("Enter the item no :");
            int itemno=s.nextInt();
            System.out.println("Enter the quantity:");
            int quantity=s.nextInt();
            buyitems[bill_itemno]=new billitems(items[itemno],quantity);
            bill_itemno++;
            System.out.println("If you want to purchase another item press 1");
            int in=s.nextInt();
            if(in!=1)
            {
                break;
            }
        }
        for(int k=0;k<bill_itemno;k++)
            {
                this.totalamount=this.totalamount+buyitems[k].amount;
            }
    }
    public String toString()
    {   
        System.out.println("heyyyyyy");
        // System.out.println(bill_itemno);
        System.out.println();
        System.out.println("BillName -" +customers.customer_name);
        System.out.println("Billid - "+ this.bill_id);
        System.out.println("Customerid - "+customers.customer_id);
        // System.out.println(buyitems.length);
        System.out.println("Itemname     Rate     Quantity     Amount");
        for(int i=0;i<bill_itemno;i++){
            System.out.println(buyitems[i]);
        }
        System.out.println("Total Bill Amount   "+totalamount);
        System.out.println();
        return "";
    }
    public String displaylist()
    {
        return this.customers.customer_id+"               "+this.bill_id+"            "+this.totalamount;
    }

}
