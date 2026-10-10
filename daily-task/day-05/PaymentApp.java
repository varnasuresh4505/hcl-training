public class PaymentApp 
{
    public static void main(String[] args) 
    {
        Payment card = new CardPayment(1500);
        Payment upi = new UPIPayment(500);
        Payment cash = new CashPayment(200);
        card.pay();
        upi.pay();
        cash.pay();
        System.out.println("\nOverloaded pay() method:");
        card.pay("Online shopping");
        System.out.println("\nRefund example:");
        Refundable refundable = new CardPayment(1500);
        refundable.refund(300);
    }
}
