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
                DefaultTableModel model = (DefaultTableModel) table1.getModel();
                model.addRow(new Object[]{cardNumberTextField.getText(), nameOnCardTextField.getText(), expirationDateTextField.getText(), CCVTextField.getText(), ZIPTextField.getText()});
            }
        });
    }

    private void createTable(){
        table1.setModel(new DefaultTableModel (
            null,
            new String[] {"Number", "Name", "Exp", "CCV", "ZIPCODE"}
        ));
    }


}
