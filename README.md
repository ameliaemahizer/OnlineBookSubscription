# OnlineBookSubscription
**IST 412 Project**<br>

## Use Cases
**To access our first use case, go to HomePageView under the OnlineBookClub and go to the main method at the bottom.** <br><be>

### Use Case 0: Login 
This use case allows users like Reader, Author, or Book Reviewer to log in using their username and passcode to access the book club's homepage. <be>

### Use Case 1: Search 
In the first use case, logged-in users can search for a book using a selected filter based on book title, author, genre, or price, with the default being searching all books without any filter. <be>

### Use Case 2: 

### Use Case 3:



## Login Usernames, Passwords, and UniqueIDs
### For Reader: 
- username: johndoe
- password: password123

### For Author:
- username: stevenking
- password: abc123

### For Book Reviewer: 
- username: alicesmith
- password: book200
  

## Books
- IT, Stephen King, 19.99, Horror
- Pride and Prejudice, Jane Austen, 12.99, Romance
- Educated: A Memoir, Author 3, 9.99, Non fiction
- Eragon,Christopher Paolini, 8.99, Fantasy
- To Kill A Mockingbird, Harper Lee, 9.99, Fiction
- Blink, Malcolm Gladwell, 17.00, Non fiction
- Harry Potter and the Chamber of Secrets, J.K. Rowling, 24.99, Fantasy
- Harry Potter and the Sorcerer's Stone, J.K. Rowling, 24.99, Fantasy
- Green Eggs and Ham, Dr. Seuss, 8.99, Children
- Northanger Abbey, Jane Austen, 6.00, Romance

## Design Patterns Implementation
mzc5994 - Mackenzie Cane: <br> 

- **Template:** Reader, Author, BookReviewer, LoginInterface
- **Input Feedback:** LoginInterface, LoginView, PurchaseBookController, PostReviewController, DiscussionBoardController, SearchView

ake5280 - Amelia Emahizer: <br> 
ajf6238 - Aidan Fitz: <br> 

- **Decorator:** PaymentDecorator, PaymentImplementation, Payment, DebitCredit, ApplePay, PayPal, ShoppingCart
- **Shopping Cart:** PurchaseBookController 

jcf5517 - Jack Fitzgerald: <br> 

jkz5262 - Ji Zhang: <be> 

- **Strategy:** BookModel, TitleSearch, AuthorSearch, Genre Search, PriceSearch, SearchBookInterface
- **Filter:** SearchBookController



## Team Involvement Log

### Implemented Use Cases 2 and 3

mzc5994 - Mackenzie Cane: <br> 

- **10%:**  Created LoginView form; Wrote LoginView code to connect the view to the database; Created OnlineBookSubscription class to call LoginController, which contains LoginView Frame; Added user information for reader, author, and book reviewer. Contributed to the README.txt file.
  
ake5280 - Amelia Emahizer: <br> 

- **10%:** Created our database and tables within; Added user and search information into the created tables; Created a HomePageView form to connect LoginView and SearchView; Wrote HomePageView code to connect LoginView and SearchView. Edited code for others. Added several books to the arraylist.

ajf6238 - Aidan Fitz: <br> 

- **30%: Created ShoppingCartView and SubscriptionView forms. Connected to database to display added shopping cart materials into the shopping cart. Allowed users to store payment info on subscription screen with add/delete/update table.
  
jcf5517 - Jack Fitzgerald: <br> 

- **30%:** 
  
jkz5262 - Ji Zhang: <br>

- **10%:** Updated SearchView form; Moved search algorithm codes into SearchController and refined them; Connected search algorithm to the book database. Edited and updated HomePageView code to seamlessly utilize functions from the Search package. Edited code for others. Contributed to the README.txt file.

### Implemented Use Case 1
mzc5994 - Mackenzie Cane: <br> 

- **30%:**  Created LoginView form; Wrote LoginView code to connect the view to the database; Created OnlineBookSubscription class to call LoginController, which contains LoginView Frame; Added user information for reader, author, and book reviewer. Contributed to the README.txt file.
  
ake5280 - Amelia Emahizer: <br> 

- **30%:** Created our database and tables within; Added user and search information into the created tables; Created a HomePageView form to connect LoginView and SearchView; Wrote HomePageView code to connect LoginView and SearchView. Edited code for others. Added several books to the arraylist.

ajf6238 - Aidan Fitz: <br> 

- **10%:** Supported team members during assignment; Will be responsible for coding one of the next use cases.
  
jcf5517 - Jack Fitzgerald: <br> 

- **10%:** Supported team members during assignment; Will be responsible for coding one of the next use cases.
  
jkz5262 - Ji Zhang: <br>

- **30%:** Created SearchView form; Wrote SearchView & SearchController code to connect the view to the list of books; Added book information that is utilized in the code. Wrote HomePageView code to connect LoginView and SearchView. Edited code for others. Added book data to the arraylist. Finalized the codes and ensured accurate functionalities. Contributed to the README.txt file.
