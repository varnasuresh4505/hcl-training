public class UPIPayment extends Payment implements Refundable 
{
    public UPIPayment(double amount) 
    {
        super(amount);
    }
    @Override
    public void pay() 
    {
        System.out.println("Paid Rs." + amount + " using UPI.");
    }
    @Override
    public void refund(double refundAmount) 
    {
        if (refundAmount > 0 && refundAmount <= amount) 
            System.out.println("UPI refund of Rs." + refundAmount + " processed.");
        else 
            System.out.println("Invalid refund amount.");
    }
}
