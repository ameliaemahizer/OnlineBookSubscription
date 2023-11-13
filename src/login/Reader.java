package login;

public class Reader extends UserModel{
    String readerName;
    int yearJoined;

    public Reader(String username, String password, int uniqueID, String readerName, int yearJoined) {
        super(username, password, uniqueID);
        this.readerName = readerName;
        this.yearJoined = yearJoined;
    }

    public Reader(String username, String password, String email, int uniqueID,
                  String readerName, int yearJoined) {
        super(username, password, email, uniqueID);
        this.readerName = readerName;
        this.yearJoined = yearJoined;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public int getYearJoined() {
        return yearJoined;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }
}
