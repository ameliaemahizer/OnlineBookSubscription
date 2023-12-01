package subscription;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubscriptionView extends JFrame {
    private JTextArea resultTextArea;
    private PurchaseBookController controller;
    private JPanel SubscriptionView;
    private JTextField textField1;
    private JTextArea textArea1;
    private JButton payPalButton;
    private JButton addCardButton;
    private JButton removeCardButton;

    public SubscriptionView(){
        setContentPane(SubscriptionView);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Subscription");
        setSize(1000, 800);
        setVisible(true);

        textArea1.setEditable(false);

        addCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        removeCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        payPalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void displayResults(PurchaseBookController controller){

    }

}
