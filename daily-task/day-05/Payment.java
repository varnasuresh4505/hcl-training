public abstract class Payment 
{
    protected double amount;
    public Payment(double amount) 
    {
        if (amount <= 0) 
        {
            throw new IllegalArgumentException("Amount must be positive.");
        }
        this.amount = amount;
    }
    public abstract void pay();
    public void pay(String note) 
    {
        System.out.println("Payment note: " + note);
        pay();
    }
    public double getAmount() 
    {
        return amount;
    }
}
