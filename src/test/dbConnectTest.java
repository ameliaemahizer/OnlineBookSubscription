package test;

import static org.junit.jupiter.api.Assertions.*;

import database.dbConnect;
import java.sql.ResultSet;
import org.junit.Test;
import static org.junit.Assert.*;

public class dbConnectTest {

    @Test
    public void testConnection() {
        dbConnect db = new dbConnect();
        ResultSet rs = null;
        try {
            rs = db.returnResult("SELECT 1");
            assertTrue("Connection failed: ResultSet is empty", rs.next());
            assertEquals("Connection failed: Unexpected query result", 1, rs.getInt(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());

        } try {
            if (rs != null) {
                rs.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}