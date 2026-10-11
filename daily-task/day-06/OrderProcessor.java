public class OrderProcessor 
{
    public void processOrder(int quantity, int availableStock) throws InsufficientStockException 
    {
        try 
        {
            if (quantity <= 0) 
            {
                throw new InvalidQuantityException("Quantity must be greater than zero.");
            }
            try 
            {
                checkStock(quantity, availableStock);
            } 
            catch (IllegalStateException e) 
            {
                throw new InsufficientStockException("Order failed because stock is insufficient.", e);
            }
            System.out.println("Order processed successfully. Quantity: " + quantity);

        } 
        finally 
        {
            System.out.println("Audit: Order processing attempt completed.");
        }
    }
    private void checkStock(int quantity, int availableStock) 
    {
        if (quantity > availableStock) 
        {
            throw new IllegalStateException("Requested " + quantity + " items, but only " + availableStock + " are available.");
        }
    }
}