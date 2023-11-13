# OnlineBookSubscription
IST 412 Project<br>

**To access our first use case, go to HomeView under the OnlineBookClub and go to the main method at the bottom.**

## Login Usernames, Passwords, and UniqueIDs
### For Reader: 
- username: johndoe
- password: password123
- unique id: 0

### For Author:
- username: stevenking
- password: abc123
- unique id: 53243

### For Book Reviewer: 
- username: alicesmith
- password: book200
- unique id: 34761

## Books
- IT, Stephen King, 19.99, Horror
- Pride and Prejudice, Jane Austen, 12.99, Romance
- Educated: A Memoir, Author 3, 9.99, Non fiction
- Eragon,Christopher Paolini, 8.99, Fantasy
- To Kill A Mockingbird, Harper Lee, 9.99, Fiction
- Blink, Malcolm Gladwell, 17.00, Non fiction
- Harry Potter and the Chamber of Secrets, J.K. Rowling, 24.99, Fantasy
- Harry Potter and the Sorcerer's Stone, J.K. Rowling, 24.99, Fantasy
- Green Eggs and Ham, Dr. Seuss, 8.99, Children's
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

- **Strategy:** BookModel, TitleSearch, AuthorSearch, GenreSearch, PriceSearch, SearchBookInterface, 
- **Filter:** SearchBookController


## One Implemented Use Case (Search) 
mzc5994 - Mackenzie Cane: <br> 

- **30%:**  Created LoginView form; Wrote LoginView code to connect the view to the database; Created OnlineBookSubscription class to call LoginController, which contains LoginView Frame; Added user information for reader, author, and book reviewer. 
  
ake5280 - Amelia Emahizer: <br> 

- **30%:** Created our database and tables within; Added user and search information into the created tables; Created a HomePageView form to connect LoginView and SearchView; Wrote HomeReview code to connect LoginView to SearchView. Edited code for others. Added several books to the arraylist.

ajf6238 - Aidan Fitz: <br> 

- **10%:** Supported team members during assignment; Will be responsible for coding one of the next use cases.
  
jcf5517 - Jack Fitzgerald: <br> 

- **10%:** Supported team members during assignment; Will be responsible for coding one of the next use cases.
  
jkz5262 - Ji Zhang: <br>

- **30%:** Created SearchView form; Wrote SearchView code to connect the view to the list of books; Added book information that is utilized in the code. Created the login to home page view to search flow by editing and adding code to HomePageView, LoginView, and SearchView. Finalized the codes and ensured accurate functionalities.
