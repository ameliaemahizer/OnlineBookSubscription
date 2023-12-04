package discussion;

import database.dbConnect;
import login.UserModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DiscussionReplyInterface extends JFrame {
    private JPanel DiscussionPost;
    private JTextField DiscussionPostTitleText;
    private JLabel Post;
    private JTextArea PostText;
    private JButton SubmitButton;
    private JButton ClearButton;
    private JButton HomeButton;

    private String searchTerm;
    dbConnect db = new dbConnect();
    DiscussionReplyModel dpm;

    UserModel um = new UserModel("dummy", "dummy");

    public DiscussionReplyInterface(){
        setContentPane(DiscussionPost);
        setTitle("Discussion Reply");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);

        SubmitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String discPost = PostText.getText();
                dpm = new DiscussionReplyModel(um,discPost);
                try{
                    String sql = "insert into DiscussionReply (reply) values ( '" + discPost + "')";
                    int row = db.updateData(sql);
                    if (row > 0) {
                        System.out.println("The discussion reply added successfully.");
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

        HomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public DiscussionReplyModel getDiscussionReply() {
        return dpm;
    }

}
