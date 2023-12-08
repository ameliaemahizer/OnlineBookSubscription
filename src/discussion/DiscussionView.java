package discussion;

import database.dbConnect;
import login.UserModel;
import onlinebookclub.HomePageView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DiscussionView extends JFrame {
    private JPanel DiscussionPost;
    private JLabel DiscussionPostTitle;
    private JTextField DiscussionPostTitleText;
    private JLabel Post;
    private JTextArea PostText;
    private JButton SubmitButton;
    private JButton ClearButton;
    private JButton ViewPostsButton;
    private JButton BackButton;

    private String searchTerm;
    dbConnect db = new dbConnect();
    DiscussionPostModel dpm;

    UserModel um = new UserModel("dummy", "dummy");

    public DiscussionView(){
        setContentPane(DiscussionPost);
        setTitle("Discussion Post");
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);

        SubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String discTitle = DiscussionPostTitleText.getText();
                String discPost = PostText.getText();
                String user = UserModel.getCurrentUser().getUsername();
                dpm = new DiscussionPostModel(user,discTitle,discPost);
                try{
                    String sql = "insert into DiscussionPost (Title, Post) values ('"+ discTitle + "', '"
                            + discPost + "')";
                    int row = db.updateData(sql);
                    if (row > 0) {
                        System.out.println("The discussion post added successfully.");
                    }
                }catch(Exception ee){
                    System.out.println(ee);
                }
            }
        });

        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        });

        ClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              PostText.setText("");
              DiscussionPostTitleText.setText("");
            }
        });

    }

    public DiscussionPostModel getDiscussionPost() {
        return dpm;
    }

}
