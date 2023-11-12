package subscription;

public class PurchaseBook {
    private String bookTitle;
    private double bookPrice;
    private String isbn;
    private String purchaseMethod;

    /**
     * default constructor for the PurchaseBook class
     */
    public PurchaseBook(){

    }

    /**
     * returns title of book to be purchased
     * @return a string representing the title of the book
     */
    public String getBookTitle(){
        return bookTitle;
    }

    public void setBookTitle(String name){
        this.bookTitle = name;
    }

    /**
     * returns the price of a book to be purchased
     * @return a double representing the price of the book
     */
    public double getBookPrice(){
        return bookPrice;
    }

    /**
     * returns the ISBN number of a book to be purchased
     * @return a string representing the ISBN number for a book to be purchased
     */
    public String getISBN(){
        return isbn;
    }

    /**
     * returns the purchase method when checking out a book
     * @return a string representing the purchase method
     */
    public String getPurchaseMethod(){
        return purchaseMethod;
    }

    /**
     * sets the purchase method desired for purchasing a particular book
     * @param purchaseMethod sets the purchase method.
     */
    public void setPurchaseMethod(String purchaseMethod){
        this.purchaseMethod = purchaseMethod;
    }

}
