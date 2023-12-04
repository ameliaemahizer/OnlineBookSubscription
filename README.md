# OnlineBookSubscription
IST 412 Project<br>

**To access our first use case, go to HomePageView under the OnlineBookClub and go to the main method at the bottom.** <br><br>
The first use case allows users (Reader, Author, or Book Reviewer) to log in and access the book club's homepage. They can search for a book using a selected filter based on book title, author, genre, or price. <br>

**Filter by Title: try searching Harry Potter or "and"** <br>
**Filter by Author: try searching Jane or Rowling or king** <br>
**Filter by Price: try searching for 8.99 or 20** <br>
**Filter by Genre: try searching for Romance, Fiction, or Fantasy** <br>

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


## One Implemented Use Case (Search) 
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
