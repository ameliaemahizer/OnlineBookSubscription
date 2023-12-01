package search;

import database.dbConnect;
import login.LoginView;
import onlinebookclub.HomePageView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SearchView extends JFrame{
    private JTextArea resultTextArea;
    private JComboBox<String> filterComboBox;
    private JTextField searchField;
    private JButton searchButton;
    private JPanel SearchPanel;
    private JTextField MessageBox;
    private JButton BackButton;
    private final SearchBookController controller;
    private SearchBookInterface searchStrategy;

    ArrayList<BookModel> bookModels= new ArrayList<>();

    public SearchView(SearchBookController controller) {
        setContentPane(SearchPanel);
        setTitle("Book Search Engine");
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);

        this.controller = controller;

        resultTextArea.setEditable(false);


        filterComboBox.addItem("Filter by Title");
        filterComboBox.addItem("Filter by Author");
        filterComboBox.addItem("Filter by Price");
        filterComboBox.addItem("Filter by Genre");


        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performSearch();
            }
        });

        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               setVisible(false);
               dispose();
               /// add something to go back home
            }
        });

    }

    // Need to change this, make it easily scalable and edited in the future
    // Implement Strategy pattern properly
    private void performSearch() {
        String searchTerm = searchField.getText();
        String selectedFilter = (String) filterComboBox.getSelectedItem();

        List<BookModel> results = new ArrayList<>();

        if (selectedFilter == null || selectedFilter.equals("Filter by Title")) {
            dbConnect db = new dbConnect();
            try {
                ResultSet rs = db.returnResult("select Title, Author, Price, Genre from Book " +
                        "where Title like '%" + searchTerm + "%'");
                while (rs.next()) {
                    String title = rs.getString(1);
                    String author = rs.getString(2);
                    double price = rs.getDouble(3);
                    int genre = rs.getInt(4);
                    String gen = String.valueOf(genre);
                    BookModel searchedBook = new BookModel(title, author, price, gen);
                    results.add(searchedBook);
                }
            }catch(Exception ee) {
                System.out.println(ee);
            }
        } else if (selectedFilter.equals("Filter by Price")) {
            try {
                double maxPrice = Double.parseDouble(searchTerm);
                results = controller.filterBooksByPrice(maxPrice);

            }catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(MessageBox,
                        "Invalid price format. Please enter a valid number.");
                return;
            }

        } else if (selectedFilter.equals("Filter by Genre")) {
            dbConnect db = new dbConnect();
            try {
                ResultSet rs = db.returnResult("select Title, Author, Price, Genre from Book " +
                        "where Genre like '%" + searchTerm + "%'");
                while (rs.next()) {
                    String title = rs.getString(1);
                    String author = rs.getString(2);
                    double price = rs.getDouble(3);
                    int genre = rs.getInt(4);
                    String gen = String.valueOf(genre);
                    BookModel searchedBook = new BookModel(title, author, price, gen);
                    results.add(searchedBook);
                }
            }catch(Exception ee) {
                System.out.println(ee);
            }
        } else if (selectedFilter.equals("Filter by Author")) {
            dbConnect db = new dbConnect();
            try {
                ResultSet rs = db.returnResult("select Title, Author, Price, Genre from Book " +
                        "where Author like '%" + searchTerm + "%'");
                while (rs.next()) {
                    String title = rs.getString(1);
                    String author = rs.getString(2);
                    double price = rs.getDouble(3);
                    int genre = rs.getInt(4);
                    String gen = String.valueOf(genre);
                    BookModel searchedBook = new BookModel(title, author, price, gen);
                    results.add(searchedBook);
                }
            }catch(Exception ee) {
                System.out.println(ee);
            }
        } else {
            results = new ArrayList<>(); // Handle unknown filter option here, for example.
        }
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
                resultTextArea.append("Genre: " + bookModel.getGenre() + "\n");
                resultTextArea.append("\n");
            }
        }
    }

    public void setSearchStrategy(SearchBookInterface searchStrategy) {
        controller.setSearchStrategy(searchStrategy);
    }

    public static void main(String[] args) {
        ArrayList<BookModel> bookModels = new ArrayList<>();
        SearchBookController controller = new SearchBookController(bookModels);
        SwingUtilities.invokeLater(() -> new SearchView(controller));
    }
}
