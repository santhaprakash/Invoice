public class item
{
    public String item_name;
    public  int item_no;
    public  int item_price;
    item(String item_name,int item_no,int item_price)
    {
        this.item_name=item_name;
        this.item_no=item_no;
        this.item_price=item_price;
    }
    public String toString()
    {
        return item_no+"       "+item_name+"         "+item_price;
    }
    
}
