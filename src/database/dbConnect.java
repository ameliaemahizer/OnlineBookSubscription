package database;

import java.sql.*;

public class dbConnect{
    String queryString;
    ResultSet rs;
    Connection conn;
    Statement st;


    public dbConnect() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            this.conn = DriverManager.getConnection("jdbc:ucanaccess://src/database/BookClubDatabase1.accdb");
             this.st = conn.createStatement();

        } catch (Exception ee) {
            System.out.println(ee);
        }
    }

    public ResultSet returnResult(String queryString) {
        try {
            this.queryString = queryString;
            this.rs = this.st.executeQuery(queryString);

        } catch (Exception ee) {
            System.out.println(ee);
        }
        return this.rs;
    }

    //update the database
    public int updateData(String queryString){
        int rows = 0;
        try {
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(queryString);
            rows = pstmt.executeUpdate();
        }catch (Exception ee) {
            System.out.println(ee);
        }
        return rows;
    }
}
