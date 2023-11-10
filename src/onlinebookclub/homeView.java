package onlinebookclub;

import javax.swing.*;

public class homeView extends JDialog {
    private JPanel contentPane;
    private JButton shoppingCartButton;
    private JButton subscriptionButton;
    private JButton discussionButton;
    private JButton searchButton;
    private JLabel welcomeLabel;
    private JButton buttonOK;

    public homeView() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        homeView dialog = new homeView();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
