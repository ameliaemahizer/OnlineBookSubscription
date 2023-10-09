package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

/**
 * This class provides a method to look up books by their ISBN.
 */
public class isbnApi {

    /**
     * Looks up a book based on its ISBN.
     *
     * @param isbn The ISBN code of the book to look up.
     * @return A BookModel object representing the book found,
     * or null if no book is found.
     */
    private static final String API_KEY = "123456"; // Replace with your API key

    public static ArrayList<BookModel> searchByIsbn(String isbn) {
        ArrayList<BookModel> searchResults = new ArrayList<>();

        try {
            // Construct the API URL
            String apiUrl = "https://api2.isbndb.com/book/" + isbn;

            // Create a URL object
            URL url = new URL(apiUrl);

            // Open a connection to the URL
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            // Set the request method to GET
            con.setRequestMethod("GET");

            // Set the Authorization header with your API key
            con.setRequestProperty("Authorization", API_KEY);

            // Get the response code
            int responseCode = con.getResponseCode();

            // Check if the response code is OK
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read the response
                try (BufferedReader in = new BufferedReader(
                        new InputStreamReader(con.getInputStream()))) {
                    String inputLine;
                    StringBuilder response = new StringBuilder();

                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }

                    // Next Step: Add code to process the JSON response here and create BookModel objects
                    // Add gson JAR dependency

                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("HTTP GET request failed with response code: " + responseCode);
            }

            // Close the connection
            con.disconnect();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return searchResults;
    }
}

