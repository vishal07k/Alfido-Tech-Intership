package com.lms;

import java.util.*;

import com.lms.model.Books;
import com.lms.service.LibraryManagerService;

public class LibraryManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {

            System.out.println("\n--------------------");
            System.out.println("  Welcome to LMS !");
            System.out.println("--------------------");
            System.out.println("1. Add Book");
            System.out.println("2. Show Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Borrowed Books");
            System.out.println("6. Exit");
            System.out.println("--------------------");

            try {

                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(sc.nextLine());

                if(choice < 1 || choice > 6) {
                    throw new InputMismatchException("Choice must be between 1 and 6");
                }

                switch(choice) {

                    case 1:

                        System.out.print("Enter number of books to add: ");
                        int n = Integer.parseInt(sc.nextLine());

                        for(int i = 0; i < n; i++) {

                            Books book = new Books();

                            book.setBookId(1000 + i);

                            System.out.print("Enter book name: ");
                            book.setBookTitle(sc.nextLine());

                            System.out.print("Enter author name: ");
                            book.setAuthor(sc.nextLine());

                            System.out.print("Enter category: ");
                            book.setCategory(sc.nextLine());

                            LibraryManagerService.books.add(book);
                            LibraryManagerService.categories.add(book.getCategory());
                        }

                        System.out.println("Books added successfully!");
                        break;

                    case 2:

                        System.out.println("\nAvailable Books:");

                        for(Books b : LibraryManagerService.books) {
                            System.out.println(b);
                        }

                        break;

                    case 3:

                        System.out.print("Enter member name: ");
                        String member = sc.nextLine();

                        System.out.print("Enter book title: ");
                        String bookTitle = sc.nextLine();

                        LibraryManagerService.borrowedBooks
                                .computeIfAbsent(member, k -> new ArrayList<>())
                                .add(bookTitle);

                        System.out.println("Book borrowed successfully!");

                        break;

                    case 4:

                        System.out.print("Enter member name: ");
                        String m = sc.nextLine();

                        System.out.print("Enter book title to return: ");
                        String returnBook = sc.nextLine();

                        if(LibraryManagerService.borrowedBooks.containsKey(m)) {

                            LibraryManagerService.borrowedBooks
                                    .get(m)
                                    .remove(returnBook);

                            System.out.println("Book returned successfully!");
                        }
                        else {
                            System.out.println("Member not found.");
                        }

                        break;

                    case 5:

                        System.out.print("Enter member name: ");
                        String name = sc.nextLine();

                        if(LibraryManagerService.borrowedBooks.containsKey(name)) {
                            System.out.println("Borrowed Books: " +
                                    LibraryManagerService.borrowedBooks.get(name));
                        }
                        else {
                            System.out.println("No books borrowed.");
                        }

                        break;

                    case 6:

                        System.out.println("Exiting LMS...");
                        return;
                }

            }
            catch(InputMismatchException e) {
                System.out.println(e.getMessage());
            }
            catch(NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
            catch(Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        }
    }
}