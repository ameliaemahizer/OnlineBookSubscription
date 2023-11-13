package onlinebookclub;

import search.BookModel;
import search.SearchBookController;
import search.SearchView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class HomePageView extends JDialog {
    private JPanel contentPane;
    private JButton shoppingCartButton;
    private JButton subscriptionButton;
    private JButton discussionButton;
    private JButton searchButton;
    private JLabel welcomeLabel;
    private JButton buttonOK;


    public HomePageView()  {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        setSize(1000,800);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<BookModel> bm = new ArrayList<>();
                bm.add(new BookModel("It", "Stephen King", 19.99, "Horror"));
                bm.add(new BookModel("Pride and Prejudice", "Jane Austen", 12.99, "Romance"));
                bm.add(new BookModel("Educated: A Memoir", "Author 3", 9.99, "Non fiction"));
                SearchBookController s1 = new SearchBookController(bm);
                SearchView searchView = new SearchView(s1);
                searchView.setVisible(true);
                setVisible(false);

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
