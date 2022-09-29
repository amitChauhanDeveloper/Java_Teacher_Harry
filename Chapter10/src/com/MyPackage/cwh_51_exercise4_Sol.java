package com.MyPackage;

class Library // Create library class
{
    String[] book;
    int no_of_book;
    Library() // create default constructor
    {
        this.book = new String[100];
        this.no_of_book = 0;
    }

    void addBook(String book) // Create addBook Method
    {
        this.book[no_of_book] = book;
        no_of_book++;
        System.out.println(book+ " has been added! ");
    }

    void showAvailableBook() // Create showAvailableBook method
    {
        System.out.println("Available Books are: ");
        for(String book : this.book)
        {
            if (book == null)
            {
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void issueBook(String book) // Create issueBook method
    {
        for (int i=0;i<this.book.length;i++)
        {

            if (this.book[i].equals(book))
            {
                System.out.println(book + " book has been issued! ");
                this.book [i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }
    void returnBook(String book) // create returnBook Method
    {
        addBook(book);
    }
}
public class cwh_51_exercise4_Sol {
    public static void main(String[] args) {
        // You have implement a library using Java class Library
        // Methods: addBook, issueBook, returnBook, showAvailableBook
        // Properties: Array to store the available book,
        // Array to store the issued book

        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Java for Beginner");
        centralLibrary.addBook("C++");
        centralLibrary.addBook("Python");
        centralLibrary.addBook("C");

        centralLibrary.issueBook("C++");
        centralLibrary.showAvailableBook();
        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBook();
        System.out.println("Thank You For Online Library Application ! ");
    }
}
