package subscription;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubscriptionView extends JFrame {
    private JTextArea resultTextArea;
    private PurchaseBookController controller;
    private JPanel SubscriptionView;
    private JTextField ZIPTextField;
    private JTextField cardNumberTextField;
    private JTextField nameOnCardTextField;
    private JTextField expirationDateTextField;
    private JTextField CCVTextField;
    private JTextArea textArea1;
    private JButton payPalButton;
    private JButton addCardButton;
    private JTable table1;
    private JButton removeCardButton;

    public SubscriptionView(){
        setContentPane(SubscriptionView);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Subscription");
        setSize(1000, 800);
        setVisible(true);

        createTable();

        addCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void createTable(){
        Object[][] data = {{"12345678910", "Aidan", "11/2027", "013", "56001"}};
        table1.setModel(new DefaultTableModel (
            data,
            new String[] {"Number", "Name", "Exp", "CCV", "ZIPCODE"}
        ));
    }


}
