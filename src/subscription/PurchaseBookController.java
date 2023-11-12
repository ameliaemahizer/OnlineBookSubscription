package subscription;


public class PurchaseBookController {
    /**
     * This is the default constructor for the PurchaseBookController class
     */
    private PurchaseBook book;
    private PurchaseBookInterface pbi;
    private UserFinanceData userFinanceData = new UserFinanceData();

    public PurchaseBookController(){
        this.pbi = new PurchaseBookInterface();
        System.out.println("Original balance: " + userFinanceData.getCash());
        book = pbi.displayBook();
        userFinanceData.updateFinanceInfo();

        System.out.println("New Balance: " + userFinanceData.getCash());

        System.out.println("Purchase completed!");

    }
}
