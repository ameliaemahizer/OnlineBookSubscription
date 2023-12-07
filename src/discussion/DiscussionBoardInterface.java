package discussion;

import database.dbConnect;
import login.UserModel;
import onlinebookclub.HomePageView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class DiscussionBoardInterface extends JFrame {
    private JPanel DiscussionBoard;
    private JButton createADiscussionPostButton;
    private JButton replyToAPostButton;
    private JPanel DiscussionInterface;
    private JButton BackToHome;
    private JComboBox CBdiscussionPosts;

    private DiscussionView discussionView;

    private DiscussionReplyInterface discussionReplyInterface;
    dbConnect dbc = new dbConnect();

    DiscussionPostModel dpm;

    ArrayList<DiscussionPostModel> dps = new ArrayList<>();

    UserModel um = new UserModel("dummy", "dummy");

    /**
     * This is the default constructor for the DiscussionBoard class
     **/
    public DiscussionBoardInterface (){
        setContentPane(DiscussionInterface);
        setTitle("Discussion Board");
        setSize(600, 600);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        try {
            String sql = "select dp.ID, dp.UserID, cu.CustomerUsername, dp.Post, dp.Title, dp.PostDate, " +
                    "dp.ParentPostID from DiscussionPost dp, Accounts cu where dp.UserID = cu.ID";

            ResultSet rs = dbc.returnResult(sql);

            while (rs.next()) {
                int dpID = rs.getInt(1);
                int userID = rs.getInt(2);
                String username = rs.getString(3);
                String post = rs.getString(4);
                String title = rs.getString(5);
                Date postdate = rs.getDate(6);
                int parentPostID = rs.getInt(7);
                DiscussionPostModel dp = new DiscussionPostModel(um, title, post);
                dps.add(dp);
                CBdiscussionPosts.addItem(title);

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