package discussion;


public class DiscussionBoardInterface {

    private DiscussionBoard username;
    private DiscussionBoardController discussionBoardController;

    /**
     * This is the default constructor for the DiscussionBoard class
     **/
    public DiscussionBoardInterface (){
    
    }

    /**
     * This displays all contents of the discussion board by username
     */
    public void displayDiscussionBoard(DiscussionBoard user){
        System.out.println("Discussion Board: \n" +

                "Username: "  + user.getUserName() + "\n"
                + "Posts: " + user.
                + "\n Test Passed");
    }
}