package subscription;
import search.BookModel;
import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<BookModel> cartList = new ArrayList();
    public void addBook(BookModel book){
        cartList.add(book);
        System.out.println("Item added!");
    }
    public void removeBook(BookModel book){
        cartList.remove(book);
        System.out.println("Item removed!");
    }
    public String displayCartContents(){
        int length = cartList.size();
        String contents = "";
        for (int i = 0; i < length; i++){
            BookModel l = cartList.get(i);
            contents += l.getBookTitle() +" " + l.getBookPrice();
            contents = contents + "\n";
        }
        return contents;
    }

}
