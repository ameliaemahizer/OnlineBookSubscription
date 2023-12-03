package subscription;

import onlinebookclub.HomePageView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

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
    private JButton updateInfoButton;
    private JButton BackButton;

    public SubscriptionView(){
        setContentPane(SubscriptionView);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Subscription");
        setSize(1000, 400);
        setVisible(true);

        createTable();

        addCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) table1.getModel();
                model.addRow(new Object[]{cardNumberTextField.getText(), nameOnCardTextField.getText(), expirationDateTextField.getText(), CCVTextField.getText(), ZIPTextField.getText()});
                cardNumberTextField.setText("");
                nameOnCardTextField.setText("");
                expirationDateTextField.setText("");
                CCVTextField.setText("");
                ZIPTextField.setText("");
            }
        });
        removeCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) table1.getModel();
                int i = table1.getSelectedRow();
                if(i >= 0){
                    model.removeRow(i);
                }else{
                    System.out.println("Delete Error");
                }
                cardNumberTextField.setText("");
                nameOnCardTextField.setText("");
                expirationDateTextField.setText("");
                CCVTextField.setText("");
                ZIPTextField.setText("");
            }
        });

        table1.addMouseListener(new MouseAdapter(){
           @Override
           public void mouseClicked(MouseEvent e){
               DefaultTableModel model = (DefaultTableModel) table1.getModel();

               int i = table1.getSelectedRow();
               cardNumberTextField.setText(model.getValueAt(i,0).toString());
               nameOnCardTextField.setText(model.getValueAt(i,1).toString());
               expirationDateTextField.setText(model.getValueAt(i,2).toString());
               CCVTextField.setText(model.getValueAt(i,3).toString());
               ZIPTextField.setText(model.getValueAt(i,4).toString());
           }
        });


        updateInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) table1.getModel();
                int i = table1.getSelectedRow();
                if(i >= 0) {
                    model.setValueAt(cardNumberTextField.getText(), i, 0);
                    model.setValueAt(nameOnCardTextField.getText(), i, 1);
                    model.setValueAt(expirationDateTextField.getText(), i, 2);
                    model.setValueAt(CCVTextField.getText(), i, 3);
                    model.setValueAt(ZIPTextField.getText(), i, 4);
                }else{
                    System.out.println("Update Error");
                }
                cardNumberTextField.setText("");
                nameOnCardTextField.setText("");
                expirationDateTextField.setText("");
                CCVTextField.setText("");
                ZIPTextField.setText("");
            }
        });

        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                HomePageView homePageView = new HomePageView(new ArrayList<>());
                homePageView.setLoggedIn(true);
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
