package search;

import database.dbConnect;
import onlinebookclub.HomePageView;
import login.UserModel;


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
    private JButton addToCartButton;

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

        addToCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cartContent = resultTextArea.getText();
                String username = UserModel.getCurrentUser().getUsername();
                dbConnect db = new dbConnect();
                try{
                    String sql = "insert into ShoppingCart (CustomerUsername, Contents) values ('" + username + "', '" + cartContent + "')";
                    int row = db.updateData(sql);
                    if (row > 0) {
                        System.out.println("Cart contents added successfully.");
                        JOptionPane.showConfirmDialog(null, "Item added to cart!", "Notification", JOptionPane.CLOSED_OPTION);
                    }
                }catch(Exception ee){
                    System.out.println(ee);
                }
            }
        });
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

    private void performSearch() {
        String searchTerm = searchField.getText();
        String selectedFilter = (String) filterComboBox.getSelectedItem();
        List<BookModel> results = controller.performSearch(searchTerm, selectedFilter);
        displayResults(results);
        SearchBookController controller = new SearchBookController(db);
    }

//    public static void main(String[] args) {
//        dbConnect db = new dbConnect();
//        SearchBookController controller = new SearchBookController(db);
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                new SearchView(controller).setVisible(true);
//            }
//        });
//    }
}


