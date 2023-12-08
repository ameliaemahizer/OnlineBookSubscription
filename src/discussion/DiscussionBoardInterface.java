package discussion;

import database.dbConnect;
import login.UserModel;
import onlinebookclub.HomePageView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DiscussionBoardInterface extends JFrame {
    private JPanel DiscussionBoard;
    private JButton createADiscussionPostButton;
    private JButton replyToAPostButton;
    private JPanel DiscussionInterface;
    private JButton BackToHome;
    private JComboBox CBdiscussionPosts;
    private JTextArea discussionPostsDisplay;
    private JTextArea discussionReplysDisplay;

    private DiscussionView discussionView;

    private DiscussionReplyInterface discussionReplyInterface;
    dbConnect dbc = new dbConnect();

    DiscussionPostModel dpm;


    /**
     * This is the default constructor for the DiscussionBoard class
     **/
    public DiscussionBoardInterface (){
        setContentPane(DiscussionInterface);
        setTitle("Discussion Board");
        setSize(850, 850);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);

        try {
            String sql = "SELECT dp.Post, dp.Title FROM DiscussionPost dp";
            ResultSet rs = dbc.returnResult(sql);

            while (rs.next()) {
                String post = rs.getString(1);
                String title = rs.getString(2);
                discussionPostsDisplay.append(title + " : " + post + "\n");
            }
        } catch (Exception ee){
            System.out.println(ee);
        }

        try {
            String sql = "SELECT dr.Reply, dp.Title, dp.ID FROM " +
                    "DiscussionReply dr, DiscussionPost dp";
            ResultSet rs = dbc.returnResult(sql);

            while (rs.next()) {
                String reply = rs.getString(1);
                String title = rs.getString(2);
                discussionReplysDisplay.append( title + " : " + reply + "\n");
            }
        } catch (Exception ee){
            System.out.println(ee);
        }

        createADiscussionPostButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                discussionView = new DiscussionView();
                discussionView.getDiscussionPost();
            }
        });

        replyToAPostButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                discussionReplyInterface = new DiscussionReplyInterface();
                discussionReplyInterface.getDiscussionReply();
            }
        });

        BackToHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                HomePageView homePageView = new HomePageView(new ArrayList<>());
                homePageView.setLoggedIn(true);
            }
        });
    }

    public DiscussionPostModel getDiscussionBoard() {
        return dpm;
    }

}