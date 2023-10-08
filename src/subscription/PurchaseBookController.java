package subscription;


public class PurchaseBookController {
    /**
     * This is the default constructor for the PurchaseBookController class
     */
    private PurchaseBook book;
    private PurchaseBookInterface pbi;
    private UserFinanceData userFinanceData;

    public PurchaseBookController(){
        this.pbi = new PurchaseBookInterface();
        book = pbi.displayBook();
        userFinanceData.updateFinanceInfo();

    }
}
