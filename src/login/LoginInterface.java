package login;

import java.util.Scanner;

public class LoginInterface {

    /**
     * This is the default constructor for LoginInterface
     */
    public LoginInterface() {

    }

    public static void main(String[] args) {

        Reader r1 = new Reader("johndoe", "password123", 0, "John Doe",
                2023);
        Author a1 = new Author ("tarawestover", "abc123", 53243, "Tara Westover",
                "Random House");
        BookReviewer br1 = new BookReviewer("alicesmith", "book200", 34761,
                "Alice Smith", "Kirkus");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter user name: ");
        String username = s.next();
        System.out.println("Enter password: ");
        String password = s.next();
        System.out.println("Enter unique id: ");
        int uniqueID = s.nextInt();

        if (username.equals(r1.getUsername()) && password.equals(r1.getPassword())
                && uniqueID == r1.getUniqueID()){
            System.out.println("Reader Authenticated!");
        }
        else if (username.equals(a1.getUsername()) && password.equals(a1.getPassword())
                && uniqueID == a1.getUniqueID()){
            System.out.println("Author Authenticated!");
        }
        else if (username.equals(br1.getUsername()) && password.equals(br1.getPassword())
                && uniqueID == br1.getUniqueID()) {
            System.out.println("Book Reviewer Authenticated!");
        }
    }

}