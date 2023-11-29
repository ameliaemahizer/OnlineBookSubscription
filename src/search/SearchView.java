package search;

import database.dbConnect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SearchView extends JFrame{
    private final JFrame frame;
    private JTextArea resultTextArea;
    private JComboBox<String> filterComboBox;
    private JTextField searchField;
    private JButton searchButton;
    private JPanel panel;
    private final SearchBookController controller;
    private SearchBookInterface searchStrategy;

    public SearchView(SearchBookController controller) {
        this.controller = controller;

        frame = new JFrame("Book Search Engine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setVisible(true);

        resultTextArea = new JTextArea(10, 30);
        resultTextArea.setEditable(false);

        searchField = new JTextField(20);
        searchButton = new JButton("Search");

        filterComboBox = new JComboBox<>();
        filterComboBox.addItem("Filter by Title");
        filterComboBox.addItem("Filter by Author");
        filterComboBox.addItem("Filter by Price");
        filterComboBox.addItem("Filter by Genre");

        JPanel panel = new JPanel();
        panel.add(searchField);
        panel.add(searchButton);
        panel.add(filterComboBox);

        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(resultTextArea), BorderLayout.CENTER);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performSearch();
            }
        });

    }

    private void performSearch() {
        String searchTerm = searchField.getText();
        String selectedFilter = (String) filterComboBox.getSelectedItem();

        List<BookModel> results = new ArrayList<>();

        dbConnect dbc = new dbConnect("select Title, Author, Price, Genre from Book " +
                "where Title like '%" + searchTerm + "%'");
        if (selectedFilter == null || selectedFilter.equals("Filter by Title")) {
            try {
                ResultSet rs = dbc.returnResult();
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
                ResultSet rs = dbc.returnResult();
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

        } else if (selectedFilter.equals("Filter by Genre")) {
            try {
                ResultSet rs = dbc.returnResult();
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
            try {
                ResultSet rs = dbc.returnResult();
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

    public JFrame getFrame() {
        return frame;
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
