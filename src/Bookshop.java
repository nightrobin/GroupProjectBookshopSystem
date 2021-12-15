import java.util.Scanner;

public class Bookshop {

    // Variables = Members
    private final int numberOfBooks = 3;
    private Book books[] = new Book[numberOfBooks];

    public void addBook(){
        for (int ctr = 0; ctr < numberOfBooks; ctr++){
            String title;
            String author;
            int year;
            float price;
            int quantity;

            System.out.print("Title: ");
            Scanner scanner = new Scanner(System.in);
            title = scanner.nextLine();

            System.out.print("Author: ");
            author = scanner.nextLine();

            System.out.print("Year: ");
            year = scanner.nextInt();

            System.out.print("Price: ");
            price = scanner.nextFloat();

            System.out.print("Quantity: ");
            quantity = scanner.nextInt();

            books[ctr] = new Book();
            books[ctr].title = title;
            books[ctr].author = author;
            books[ctr].year = year;
            books[ctr].price = price;
            books[ctr].quantity = quantity;
            books[ctr].isActive = true;

            System.out.println("=========================");
        }

    }

    public void listBook(){
        for (int ctr = 0; ctr < numberOfBooks; ctr++) {
            if (books[ctr].isActive){
                System.out.println("Book ID: " + (ctr+1) + " - Title: " + books[ctr].title);
            }
        }
    }

    public void showBookInfo(){
        System.out.print("Book ID of the book you want to check: ");
        Scanner scanner = new Scanner(System.in);
        int bookID = scanner.nextInt();

        bookID--;
        if (bookID < 0){
            bookID = 0;
        }
        else if (bookID >= numberOfBooks){
            bookID = numberOfBooks - 1;
        }

        System.out.println("======================");
        System.out.println("===== BOOK INFO ======");
        System.out.println("======================");
        System.out.println("Title: " + books[bookID].title);
        System.out.println("Author: " + books[bookID].author);
        System.out.println("Year: " + books[bookID].year);
        System.out.println("Price: " + books[bookID].price);
        System.out.println("Quantity: " + books[bookID].quantity);
        if (books[bookID].isActive){
            System.out.println("Status: Active");
        }
        else{
            System.out.println("Status: Inactive");
        }
    }

    public void buyBook(){
        System.out.print("Book ID of the book you want to buy: ");
        Scanner scanner = new Scanner(System.in);
        int bookID = scanner.nextInt();

        System.out.print("How many? ");
        int quantity = scanner.nextInt();

        bookID--;
        if (bookID < 0){
            bookID = 0;
        }
        else if (bookID >= numberOfBooks){
            bookID = numberOfBooks - 1;
        }

        int existingQty = books[bookID].quantity;

        if (!books[bookID].isActive){
            System.out.println("The book is not available for purchase.");
        }
        else if (quantity <= 0){
            System.out.println("The order quantity must be at least 1.");
        }
        else if (quantity > existingQty){
            System.out.println("The order quantity: " + quantity + " is exceeding the stocks quantity: " + existingQty + ".");
        }
        else{
            books[bookID].quantity = existingQty - quantity;
            System.out.println("You have successfully purchased " + quantity + " of book " + books[bookID].title);
        }
    }

    public void deactivateBook(){
        System.out.print("Book ID of the book you want to deactivate: ");
        Scanner scanner = new Scanner(System.in);
        int bookID = scanner.nextInt();

        bookID--;
        if (bookID < 0){
            bookID = 0;
        }
        else if (bookID >= numberOfBooks){
            bookID = numberOfBooks - 1;
        }

        books[bookID].isActive = false;
        System.out.println("You have successfully deactivated book " + books[bookID].title);
    }


}
