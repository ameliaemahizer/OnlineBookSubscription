package onlinebookclub;

import database.dbConnect;
import discussion.DiscussionBoardInterface;
import login.LoginView;
import login.UserModel;
import review.ReviewView;
import search.BookModel;
import search.SearchBookController;
import purchase.ShoppingCartView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class HomePageView extends JDialog {
    private JPanel contentPane;
    private JButton shoppingCartButton;
    private JButton reviewButton;
    private JButton discussionButton;
    private JButton searchButton;
    private JLabel welcomeLabel;
    private JTextField searchField;
    private JTextArea resultTextArea;
    private JComboBox filterComboBox;
    private JButton clearButton;
    private JPanel searchPanel;
    private JLabel Filter;
    private JScrollPane resultScrollPane;
    private JButton addToCartButton;
    private JButton buttonOK;
    private final ArrayList<BookModel> bookModels;
    private boolean isLoggedIn;
    private LoginView loginView;
    private dbConnect dbConnection;
    private SearchBookController searchController;

    public HomePageView(ArrayList<BookModel> bookModels) {
        this.bookModels = bookModels;
        this.dbConnection = new dbConnect();

        setContentPane(contentPane);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Online Book Club");
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);

        filterComboBox.addItem("Search All");
        filterComboBox.addItem("Filter by Title");
        filterComboBox.addItem("Filter by Author");
        filterComboBox.addItem("Filter by Price");
        filterComboBox.addItem("Filter by Genre");

        resultTextArea.setEditable(false);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performSearch();
            }
        });

        discussionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                DiscussionBoardInterface discussionBoardInterface = new DiscussionBoardInterface();
            }
        });

        reviewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                ReviewView reviewView = new ReviewView();
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

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                HomePageView homePageView = new HomePageView(new ArrayList<>());
                homePageView.setLoggedIn(true);
            }
        });

        // DOES NOT WORK PROPERLY
        addToCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cartContent = resultTextArea.getText();
                String username = UserModel.getCurrentUser().getUsername();
                dbConnect db = new dbConnect();
                try{
                    String sql = "insert into ShoppingCart (Contents) values ('" + cartContent + "')";
                    int row = db.updateData(sql);
                    if (row > 0) {
                        System.out.println("Cart contents added successfully.");
                        JOptionPane.showConfirmDialog(null, "Item added to cart!", "Notification", JOptionPane.DEFAULT_OPTION);
                    }
                }catch(Exception ee){
                    System.out.println(ee);
                }
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

    private void performSearch() {
        String searchTerm = searchField.getText();
        String selectedFilter = (String) filterComboBox.getSelectedItem();
        SearchBookController controller = new SearchBookController(dbConnection);
        List<BookModel> results = controller.performSearch(searchTerm, selectedFilter);
        displayResults(results);
    }

    private void displayResults(List<BookModel> results) {
        resultTextArea.setText("");
        if (results.isEmpty()) {
            resultTextArea.append("No results found.");
        } else {
            for (BookModel bookModel : results) {
                resultTextArea.append("Title: " + bookModel.getTitle() + "\n");
                resultTextArea.append("Author: " + bookModel.getAuthor() + "\n");
                resultTextArea.append("Price: $" + bookModel.getPrice() + "\n");
                resultTextArea.append("Genre: " + bookModel.getGenre() + "\n\n");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<BookModel> bookModels = new ArrayList<>();

        SwingUtilities.invokeLater(() -> {
            HomePageView homePageView = new HomePageView(bookModels);
            homePageView.setVisible(false);
        });
    }
}
