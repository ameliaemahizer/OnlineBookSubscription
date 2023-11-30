package onlinebookclub;

import login.LoginView;
import search.BookModel;
import search.SearchView;
import search.SearchBookController;
import subscription.SubscriptionView;
import subscription.PurchaseBookController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;

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

    public HomePageView(ArrayList<BookModel> bookModels) {
        this.bookModels = bookModels;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Online Book Club");
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Add components to the contentPane
        contentPane = new JPanel();
        contentPane.setLayout(new FlowLayout());
        welcomeLabel = new JLabel("Welcome to Online Book Club!");

        contentPane.add(welcomeLabel);
        searchButton = new JButton("Search Books");
        contentPane.add(searchButton);

        // Shopping Cart button
        shoppingCartButton = new JButton("Shopping Cart");
        contentPane.add(shoppingCartButton);

        // Subscription button
        subscriptionButton = new JButton("Subscription");
        contentPane.add(subscriptionButton);


        // Discussion button
        discussionButton = new JButton("Discussion");
        contentPane.add(discussionButton);

        // Handle the search button click
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Load book data to the SearchBookController
                setVisible(false);
                dispose();
                SearchBookController controller = new SearchBookController(bookModels);
                SearchView searchView = new SearchView(controller);

            }
        });

        discussionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add code to open the discussion view here
            }
        });

        subscriptionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                PurchaseBookController pbc = new PurchaseBookController();
                SubscriptionView subscriptionView = new SubscriptionView(pbc);
            }
        });

        shoppingCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add code to open the shopping cart view here
            }
        });

        // Add the contentPane to the frame
        getContentPane().add(contentPane, BorderLayout.CENTER);

        isLoggedIn = false;
        loginView = new LoginView(this); // Create the login view
    }

    public void setLoggedIn(boolean loggedIn) {
        this.isLoggedIn = loggedIn;
        // Enable access to homepage once user logged in
        if (loggedIn) {
            // Close the LoginView
            loginView.dispose();
            // Enable access to home page view
            this.setVisible(true);
            // HomePageView homePageView = new HomePageView(bookModels);
            // homePageView.setVisible(true);
        }
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public static void main(String[] args) {
        ArrayList<BookModel> bookModels = new ArrayList<>();
        bookModels.add(new BookModel("It", "Stephen King", 19.99, "Horror"));
        bookModels.add(new BookModel("Pride and Prejudice", "Jane Austen", 12.99, "Romance"));
        bookModels.add(new BookModel("Educated: A Memoir", "Tara Westover", 9.99, "Non fiction"));
        bookModels.add(new BookModel("Eragon","Christopher Paolini", 8.99, "Fantasy"));
        bookModels.add(new BookModel("To Kill A Mockingbird", "Harper Lee", 9.99, "Fiction"));
        bookModels.add(new BookModel("Blink","Malcolm Gladwell", 17.00, "Non fiction"));
        bookModels.add(new BookModel("Harry Potter and the Chamber of Secrets", "J.K. Rowling", 24.99, "Fantasy"));
        bookModels.add(new BookModel("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 24.99, "Fantasy"));
        bookModels.add(new BookModel("Green Eggs and Ham", "Dr. Seuss", 8.99, "Children"));
        bookModels.add(new BookModel("Northanger Abbey", "Jane Austen", 6.00, "Romance"));

        SwingUtilities.invokeLater(() -> {
            HomePageView homePageView = new HomePageView(bookModels);
            // hide the HomePageView before login
            homePageView.setVisible(false);
        });
    }
}
