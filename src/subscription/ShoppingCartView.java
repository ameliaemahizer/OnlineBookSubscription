package subscription;

import database.dbConnect;

import javax.swing.*;

public class ShoppingCartView extends JFrame{
    private JTextArea textArea1;
    private JButton purchaseWithCardButton;
    private JPanel ShoppingCartView;
    dbConnect db = new dbConnect();

    public ShoppingCartView(){
        setContentPane(ShoppingCartView);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Shopping Cart");
        setSize(1000, 200);
        setVisible(true);
        textArea1.setEditable(false);



    }

}
