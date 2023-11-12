# OnlineBookSubscription
IST 412 Project<br>

## Login Usernames, Passwords, and UniqueIDs
### For Reader: 
- username: johndoe
- password: password123
- unique id: 0 (does not need one)

### For Author:
- username: tarawestover
- password: abc123
- unique id: 53243

### For Book Reviewer: 
- username: alicesmith
- password: book200
- unique id: 34761

## Books
### Book Table with Title, Author, ISBN, and Genre
![Screenshot 2023-11-12 at 5 17 50 PM](https://github.com/ameliaemahizer/OnlineBookSubscription/assets/90058612/be85e83c-2ed0-4a82-b099-4b22435a3606) <br>
![Screenshot 2023-11-12 at 5 18 13 PM](https://github.com/ameliaemahizer/OnlineBookSubscription/assets/90058612/7cab20f0-f7a3-4da7-836f-27eccaa767e6) <br>
### Genre Table
![Screenshot 2023-11-12 at 5 18 37 PM](https://github.com/ameliaemahizer/OnlineBookSubscription/assets/90058612/1a5659f2-711f-4953-9d6b-cbfd00755f3d)

## Design Patterns Implementation
mzc5994 - Mackenzie Cane: <br> 

- **Template:** Reader, Author, BookReviewer, LoginInterface
- **Input Feedback:** LoginInterface, LoginView, PurchaseBookController, PostReviewController, DiscussionBoardController

ake5280 - Amelia Emahizer: <br> 
ajf6238 - Aidan Fitz: <br> 

- **Decorator:** PaymentDecorator, PaymentImplementation, Payment, DebitCredit, ApplePay, PayPal, ShoppingCart
- **Shopping Cart:** PurchaseBookController 

jcf5517 - Jack Fitzgerald: <br> 
jkz5262 - Ji Zhang: <br> 

## One Implemented Use Case (Search) 
mzc5994 - Mackenzie Cane: <br> 

- **30%:**  Created LoginView form; Wrote LoginView code to connect the view to the database; Created OnlineBookSubscription class to call LoginController, which contains LoginView Frame; Added user information for reader, author, and book reviewer. 
  
ake5280 - Amelia Emahizer: <br> 

- **30%:** Created our database and tables within; Added user and search information into the created tables; Created a HomePageView form to connect LoginView and SearchView; Wrote HomeReview code to connect LoginView to SearchView. 

ajf6238 - Aidan Fitz: <br> 

- **10%:** Supported team members during assignment; Will be responsible for coding one of the next use cases.
  
jcf5517 - Jack Fitzgerald: <br> 

- **10%:** Supported team members during assignment; Will be responsible for coding one of the next use cases.
  
jkz5262 - Ji Zhang: <br>

- **30%:** Created SearchView form; Wrote SearchView code to connect the view to the database; Added book information that is utilized in the database.
