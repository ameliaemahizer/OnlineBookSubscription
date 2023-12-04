package onlinebookclub;

import database.dbConnect;
import discussion.DiscussionView;
import login.LoginView;
import search.BookModel;
import search.SearchView;
import search.SearchBookController;
import subscription.ShoppingCartView;
import subscription.SubscriptionView;
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
    private final ArrayList<BookModel> bookModels;
    private boolean isLoggedIn;
    private final LoginView loginView;

    private dbConnect dbConnection;

    public HomePageView(ArrayList<BookModel> bookModels) {
        this.bookModels = bookModels;
        setContentPane(contentPane);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Online Book Club");
        setSize(1000, 800);
        setLocationRelativeTo(null);

        this.dbConnection = new dbConnect(); // Initialize the dbConnect object

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                SearchBookController controller = new SearchBookController(dbConnection); // Pass dbConnection here
                SearchView searchView = new SearchView(controller);
            }
        });

        discussionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                DiscussionView discussionView = new DiscussionView();
            }
        });

        subscriptionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                SubscriptionView subscriptionView = new SubscriptionView();
                // Add code to open the subscription view here
            }
        });

        shoppingCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                ShoppingCartView shoppingCartView = new ShoppingCartView();
            }
        });

        isLoggedIn = false;
        loginView = new LoginView(this);
    }

    public void setLoggedIn(boolean loggedIn) {
        this.isLoggedIn = loggedIn;
        if (loggedIn) {
            loginView.dispose();
            this.setVisible(true);
        }
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public static void main(String[] args) {
        ArrayList<BookModel> bookModels = new ArrayList<>();

        SwingUtilities.invokeLater(() -> {
            HomePageView homePageView = new HomePageView(bookModels);
            homePageView.setVisible(false);
        });
    }
}
