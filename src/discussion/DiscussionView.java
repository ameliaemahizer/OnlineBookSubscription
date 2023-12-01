package discussion;

import database.dbConnect;
import login.UserModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiscussionView extends JFrame {
    private JPanel DiscussionPost;
    private JLabel DiscussionPostTitle;
    private JTextField DiscussionPostTitleText;
    private JLabel Post;
    private JTextArea PostText;
    private JButton SubmitButton;
    private JButton ClearButton;
    private JButton ViewPostsButton;
    private JButton HomeButton;

    dbConnect db = new dbConnect();
    DiscussionPostModel dpm;

    UserModel um = new UserModel("dummy", "dummy");

    public DiscussionView(){
        setContentPane(DiscussionPost);
        setTitle("Discussion Post");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);

        SubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String discTitle = DiscussionPostTitleText.getText();
                String discPost = PostText.getText();
                dpm = new DiscussionPostModel(um,discTitle,discPost);
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

        ClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              dispose();
            }
        });

        ViewPostsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        HomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}
