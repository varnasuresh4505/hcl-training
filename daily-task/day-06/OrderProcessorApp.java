public class OrderProcessorApp 
{
    public static void main(String[] args) 
    {
        OrderProcessor processor = new OrderProcessor();
        System.out.println("---- Test 1: Insufficient Stock ----");
        try 
        {
            processor.processOrder(10, 5);
        } 
        catch (InsufficientStockException | InvalidQuantityException e) 
        {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("\n---- Test 2: Invalid Quantity ----");
        try 
        {
            processor.processOrder(-2, 10);
        } 
        catch (InsufficientStockException | InvalidQuantityException e) 
        {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("\n---- Test 3: Successful Order ----");
        try 
        {
            processor.processOrder(3, 10);
        } 
        catch (InsufficientStockException | InvalidQuantityException e) 
        {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}