package search;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SearchView {
    private JFrame frame;
    private JTextArea resultTextArea;
    private JComboBox<String> filterComboBox;
    private JTextField searchField;
    private JButton searchButton;
    private JPanel panel;

    private SearchBookController controller;

    public SearchView(SearchBookController controller) {
        this.controller = controller;

        frame = new JFrame("Book Search Engine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        resultTextArea = new JTextArea(10, 30);
        resultTextArea.setEditable(false);

        searchField = new JTextField(20);
        searchButton = new JButton("Search");

        filterComboBox = new JComboBox<>();
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

        frame.setVisible(true);
    }

    private void performSearch() {
        String searchTerm = searchField.getText();
        String selectedFilter = (String) filterComboBox.getSelectedItem();

        List<BookModel> results;

        if (selectedFilter.equals("Filter by Price")) {
            try {
                double maxPrice = Double.parseDouble(searchTerm);
                results = controller.filterBooksByPrice(maxPrice);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame, "Invalid price format. Please enter a valid number.");
                return;
            }
        } else if (selectedFilter.equals("Filter by Genre")) {
            results = controller.filterBooksByGenre(searchTerm);
        } else {
            results = controller.searchBooks(searchTerm);
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

    public static void main(String[] args) {
        ArrayList<BookModel> bookModels = new ArrayList<>();
        bookModels.add(new BookModel("It", "Stephen King", 19.99, "Horror"));
        bookModels.add(new BookModel("Pride and Prejudice", "Jane Austen", 12.99, "Romance"));
        bookModels.add(new BookModel("Educated: A Memoir", "Author 3", 9.99, "Non-Fiction"));

        SearchBookController controller = new SearchBookController(bookModels);
        SwingUtilities.invokeLater(() -> new SearchView(controller));
    }

}
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class SearchView extends JFrame {
//    private JTextField searchField;
//    private JButton searchButton;
//    private JPanel searchPanel;
//
//    public SearchView() {
//        setContentPane(searchPanel);
//        setSize(600, 600);
//        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//        setVisible(true);
//
//        searchButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String search = searchField.getText();
//
//                try {
//                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//                    Connection conn = DriverManager.getConnection("jdbc:ucanaccess://src/database/BookClubDatabase1.accdb");
//                    Statement st = conn.createStatement();
//                    ResultSet rs = st.executeQuery(("select Book.ID, Book.Title, " +
//                            "Genre.Genre from Book, Genre " +
//                            " where Book.Genre=Genre.ID"));
//                    while (rs.next()) {
//                        System.out.println("Book ID: " + rs.getString(1)
//                                + "; Name: " + rs.getString(2) + "; Genre: "
//                                + rs.getString(3));
//                    }
//                } catch (Exception ee) {
//                    System.out.println(ee);
//                }
//            }
//        });
//    }
//}