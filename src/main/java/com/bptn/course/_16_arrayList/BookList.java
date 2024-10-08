package com.bptn.course._16_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class BookList {
	public static void main(String[] args) {
		// Create a new ArrayList called "myBooks"
		
		ArrayList<String> myBooks = new ArrayList<String>();
		// Add 3 books to the list
		myBooks.add("Book1".toLowerCase());
		myBooks.add("Book2".toLowerCase());
		myBooks.add("Book3".toLowerCase());
		
		//Display all the books
		System.out.println("All the books are: " + myBooks); 
		System.out.print("All the books are: "); 
		for(String book: myBooks) {
			System.out.print(book + " "); 
		}
		
		// Display the first book from the list
		System.out.println("The first book is: " + myBooks.getFirst());
		// Delete the second 
		myBooks.remove(1);
		System.out.println("The existing books are: " + myBooks); 
		
		// Search for a book.
		if(myBooks.contains("Book1")) {
			System.out.println("Book 1 exists.");
		}else {
			System.out.println("Book 1 doesn't exist.");
		}
		
		// Print the size of myBooks
		System.out.println("The size of myBooks is: " + myBooks.size());
		
		// Print the last element of myBooks
		System.out.println("The last element is: " + myBooks.get(myBooks.size()-1));
		
		ArrayList<String> s = new ArrayList<>();
		System.out.println("Enter you name: ");
		Scanner scanner = new Scanner(System.in);
		s.add(scanner.nextLine());
		System.out.println(s);
	}
}
