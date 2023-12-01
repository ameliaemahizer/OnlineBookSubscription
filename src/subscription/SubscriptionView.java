package subscription;

import javax.swing.*;

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

    }

    private void displayResults(PurchaseBookController controller){

    }

}
