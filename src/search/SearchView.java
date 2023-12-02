package search;


import database.dbConnect;
import login.LoginView;
import onlinebookclub.HomePageView;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    ArrayList<BookModel> bookModels= new ArrayList<>();

    dbConnect db = new dbConnect();

    public SearchView(SearchBookController controller) {
        setContentPane(SearchPanel);
        setTitle("Book Search Engine");
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);

        this.controller = controller;

        resultTextArea.setEditable(false);

        filterComboBox.addItem("Search All");
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
                HomePageView homePageView = new HomePageView(new ArrayList<>());
                homePageView.setLoggedIn(true);
            }
        });


    }

    private void performSearch() {
        String searchTerm = searchField.getText();
        String selectedFilter = (String) filterComboBox.getSelectedItem();


        List<BookModel> results = new ArrayList<>();


        if (selectedFilter.equals("Filter by Title")) {


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
                ResultSet rs = db.returnResult("SELECT Title, Author, Price, Genre FROM Book WHERE Price <= " + maxPrice);

                while (rs.next()) {
                    String title = rs.getString(1);
                    String author = rs.getString(2);
                    double price = rs.getDouble(3);
                    int genre = rs.getInt(4);
                    String gen = String.valueOf(genre);
                    BookModel searchedBook = new BookModel(title, author, price, gen);
                    results.add(searchedBook);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for price: " + e.getMessage());
            } catch (Exception e) {
                System.out.println(e);
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
            } catch(Exception ee) {
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

    public static void main(String[] args) {
        ArrayList<BookModel> bookModels = new ArrayList<>();
        SearchBookController controller = new SearchBookController(bookModels);
        SwingUtilities.invokeLater(() -> new SearchView(controller));
    }
}


