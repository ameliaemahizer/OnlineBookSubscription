package subscription;
import java.util.Scanner;
public class PurchaseBookInterface {
    public PurchaseBook book1 = new PurchaseBook();
    public PurchaseBook displayBook(){
        Scanner s = new Scanner (System.in);
        System.out.println("enter book name: ");
        String bookName = s.next();
        book1.setBookTitle(bookName);

        System.out.println("Book to purchase: " + book1.getBookTitle());
        return book1;
    }
}
