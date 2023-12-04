package discussion;

import database.dbConnect;
import login.UserModel;
import onlinebookclub.HomePageView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DiscussionBoardInterface extends JFrame {
    private JPanel DiscussionBoard;
    private JButton createADiscussionPostButton;
    private JButton replyToAPostButton;
    private JPanel DiscussionInterface;
    private JButton BackToHome;

    private DiscussionView discussionView;

    private DiscussionReplyInterface discussionReplyInterface;
    dbConnect dbc = new dbConnect();

    DiscussionPostModel dpm;

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