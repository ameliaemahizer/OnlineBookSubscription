package subscription;

import search.SearchBookController;

import javax.swing.*;
import java.awt.*;

public class SubscriptionView extends JFrame {
    private JTextArea resultTextArea;
    private PurchaseBookController controller;
    public SubscriptionView(PurchaseBookController controller){
        this.controller = controller;

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Search");
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        resultTextArea = new JTextArea(10, 30);
        resultTextArea.setEditable(false);

    }

    private void displayResults(PurchaseBookController controller){

    }

    public static void main(String[] args) {
        PurchaseBookController controller = new PurchaseBookController();
        SwingUtilities.invokeLater(() -> new SubscriptionView(controller));
    }

}
