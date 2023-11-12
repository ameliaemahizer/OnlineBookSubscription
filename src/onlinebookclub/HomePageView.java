package onlinebookclub;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePageView extends JDialog {
    private JPanel contentPane;
    private JButton shoppingCartButton;
    private JButton subscriptionButton;
    private JButton discussionButton;
    private JButton searchButton;
    private JLabel welcomeLabel;
    private JButton buttonOK;

    public HomePageView() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        setSize(1000,800);
        setVisible(true);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //add search view here
            }
        });

        discussionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //add discussion view here
            }
        });

        subscriptionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //add subscription view here
            }
        });

        shoppingCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //add shoppingCart view here
            }
        });
    }

    public static void main(String[] args) {
        HomePageView dialog = new HomePageView();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
