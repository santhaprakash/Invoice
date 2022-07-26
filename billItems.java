import java.util.*;
public class billitems extends Main
{
    public int product_id;
    public int product_quantity;
    public int amount;
    public item items;
    billitems(item items,int product_quantity)
    {
        this.items=items;
        // System.out.println(items.item_name+items.item_price);
        this.product_id=product_id;
        this.product_quantity=product_quantity;
        this.amount=items.item_price*this.product_quantity;
    }
    public String toString()
    {
        return items.item_name+"          "+items.item_price+"          "+product_quantity+"            "+amount;
    }

    
}
