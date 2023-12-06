package review;

import database.dbConnect;
import onlinebookclub.HomePageView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReviewView extends JFrame{
    private JButton backToHomeButton;
    private JTextArea reviewTitle;
    private JTextArea reviewBody;
    private JTextArea reviewRating;
    private JPanel reviews;
    private JLabel Reviews;
    private JTextArea reviewBookName;
    private JButton writeAReviewButton;
    private JTextArea reviewDate;
    DefaultComboBoxModel list = new DefaultComboBoxModel();
    private JComboBox bookList;
    private JTextArea reviewUser;
    private JButton nextReviewButton;
    private JButton previousReviewButton;

    private dbConnect db = new dbConnect();

    public ReviewView(){

        setContentPane(reviews);
        setTitle("Reviews");
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);


        populateBookList();


        backToHomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                HomePageView homePageView = new HomePageView(new ArrayList<>());
                homePageView.setLoggedIn(true);
            }
        });

        bookList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Load corresponding review details when a book is selected
                loadReviewDetailsForSelectedBook();
            }
        });
    }

    private void populateBookList() {
        // Assuming you have a "Books" table with a column named "Title"
        String query = "SELECT Title FROM Book";
        ResultSet resultSet = db.returnResult(query);

        try {
            list.removeAllElements();

            while (resultSet.next()) {
                String title = resultSet.getString("Title");
                System.out.println("Adding book title: " + title); // Add this line for debugging
                list.addElement(title);
            }

            SwingUtilities.invokeLater(() -> {
                bookList.setModel(list);
            });
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    private void loadReviewDetailsForSelectedBook() {
        String selectedBookTitle = (String) bookList.getSelectedItem();

        String query = "SELECT * FROM Reviews WHERE BookTitle = '" + selectedBookTitle + "'";
        ResultSet resultSet = db.returnResult(query);

        try {

            while (resultSet.next()) {
                reviewTitle.setText("TITLE: " + resultSet.getString("Title"));
                reviewBody.setText(resultSet.getString("Body"));
                reviewRating.setText("RATING: " + resultSet.getString("Rating"));
                reviewBookName.setText("BOOK: " + resultSet.getString("BookTitle"));
                reviewDate.setText("DATE: " + resultSet.getString("DatePublished"));
                reviewUser.setText("PUBLISHED BY: " + resultSet.getString("Author"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

