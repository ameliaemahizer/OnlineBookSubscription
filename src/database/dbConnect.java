package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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

    // Insert a new review into the Reviews table
    public void insertReview(String bookTitle, String title, String body, String rating, String author) {
        try {
            String query = "INSERT INTO Reviews (BookTitle, Title, Body, Rating, Author, DatePublished) VALUES (?, ?, ?, ?, ?, ?)";


            System.out.println("Preparing sql statement");
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, bookTitle);
            pstmt.setString(2, title);
            pstmt.setString(3, body);
            pstmt.setString(4, rating);
            pstmt.setString(5, author);

            java.util.Date currentDate = new java.util.Date();
            java.sql.Date sqlDate = new java.sql.Date(currentDate.getTime());

            pstmt.setDate(6, sqlDate); // Set the date parameter

            pstmt.executeUpdate();


            System.out.println("Executing SQL Query: " + pstmt.toString());

            pstmt.executeUpdate();


            conn.commit();
            System.out.println("Review posted successfully!");

        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }

}
