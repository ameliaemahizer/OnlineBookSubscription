package review;

import database.dbConnect;
import onlinebookclub.HomePageView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    private JComboBox bookList = new JComboBox(list);;

    dbConnect db = new dbConnect();

    public ReviewView(){

        new ViewReviewController();

        setContentPane(reviews);
        setTitle("Reviews");
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);



        backToHomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                HomePageView homePageView = new HomePageView(new ArrayList<>());
                homePageView.setLoggedIn(true);
            }
        });
    }

    public void fillComboBox() {


// at constructor or a user-defined method that's called from constructor
        /*  try{
            // assume that all objects were all properly defined
            db = con.createStatement();
            db.executeQuery("SELECT * FROM cats ORDER BY catName");
            rs = s.getResultSet();
            while(rs.next()){
                //int id = rs.getInt("id");
                //list.addElement(id);

                String c = rs.getString("catName");
                list.addElement(c);
            }
        }catch(Exception err){
            System.out.println(err);
        }*/
    }

}
