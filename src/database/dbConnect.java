package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbConnect {
    String queryString;
    ResultSet rs;

    public dbConnect(String queryString) {
        this.queryString = queryString;
    }

    public ResultSet returnResult() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://src/database/BookClubDatabase1.accdb");
            Statement st = conn.createStatement();
            rs = st.executeQuery(queryString);

        } catch (Exception ee) {
            System.out.println(ee);
        }
        return rs;
    }
}
