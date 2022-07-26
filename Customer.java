public class customer
{
    
    public String customer_name;
    public  int customer_id;
    customer(String customer_name,int customer_id)
    {
        this.customer_name=customer_name;
        this.customer_id=customer_id;
    }
    public String toString()
    {
        return customer_id+"       "+customer_name;
    }
}
