package subscription;

import database.dbConnect;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class ShoppingCartView extends JFrame{
    private JTextArea textArea1;
    private JButton purchaseWithCardButton;
    private JPanel ShoppingCartView;
    private JButton clearCartButton;


    public ShoppingCartView(){
        setContentPane(ShoppingCartView);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Shopping Cart");
        setSize(1000, 600);
        setVisible(true);
        textArea1.setEditable(false);
        dbConnect db = new dbConnect();
        try {
            ResultSet rs = db.returnResult("select Contents from ShoppingCart");
            while (rs.next()) {
                String contents = rs.getString(1);
                textArea1.append(contents);

            }
        }catch(Exception ee) {
            System.out.println(ee);
        }


        purchaseWithCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null, "Purchase Complete!", "Confirmation", JOptionPane.CLOSED_OPTION);
            }
        });
        clearCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dbConnect db = new dbConnect();
                try{
                    String sql = "update ShoppingCart set Contents = NULL";
                    int row = db.updateData(sql);
                    if (row > 0) {
                        System.out.println("Cart contents removed successfully.");
                        textArea1.setText("");

                    }
                }catch(Exception ee){
                    System.out.println(ee);
                }
            }
        });
    }

}
