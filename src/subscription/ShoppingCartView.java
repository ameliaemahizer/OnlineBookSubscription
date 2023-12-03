package subscription;

import database.dbConnect;
import java.sql.ResultSet;
import search.BookModel;

import javax.swing.*;

public class ShoppingCartView extends JFrame{
    private JTextArea textArea1;
    private JButton purchaseWithCardButton;
    private JPanel ShoppingCartView;


    public ShoppingCartView(){
        setContentPane(ShoppingCartView);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Shopping Cart");
        setSize(1000, 200);
        setVisible(true);
        textArea1.setEditable(false);
        dbConnect db = new dbConnect();
        try {
            ResultSet rs = db.returnResult("select Title, Author, Price, Genre from Book " +
                    "where Title like '%" + "potter" + "%'");
            while (rs.next()) {
                String title = rs.getString(1);
                String author = rs.getString(2);
                double price = rs.getDouble(3);
                int genre = rs.getInt(4);
                String gen = String.valueOf(genre);
                BookModel searchedBook = new BookModel(title, author, price, gen);
                textArea1.append("Title: " + searchedBook.getTitle() + "\n");
                textArea1.append("Author: " + searchedBook.getAuthor() + "\n");
                textArea1.append("Price: $" + searchedBook.getPrice() + "\n");
                textArea1.append("Genre: " + searchedBook.getGenre() + "\n");
                textArea1.append("\n");

            }
        }catch(Exception ee) {
            System.out.println(ee);
        }


    }

}
