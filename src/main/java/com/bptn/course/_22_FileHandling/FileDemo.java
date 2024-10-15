package com.bptn.course._22_FileHandling;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class FileDemo {
	public static void main(String[] args) {
		HashMap<String, Book> books = new HashMap<>();
		Book newBook;
		Scanner scanner = new Scanner(System.in);
		final String fileName = "src\\main\\java\\com\\bptn\\course\\_22_FileHandling\\files\\books.dat";

		System.out.println("Enter the book id: ");
		String bookID = scanner.nextLine();
		System.out.println("Enter book title: ");
		String title = scanner.nextLine();
		System.out.println("Enter book authror: ");
		String author = scanner.nextLine();
		LocalDate pubYear = LocalDate.of(2023, 03, 15);

		newBook = new Book(bookID, title, author, pubYear);

		File file = new File(fileName);

		if (file.exists() && (file.length() == 0)) {
			try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(fileName))) {
				writer.writeObject(newBook);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Book Add successfuly!");
		} else {
			try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName))) {
				Book book;
				while (true) {
					try {
						book = (Book) input.readObject();
						books.put(book.getBookID(), book);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (EOFException e) {
						break;
					}
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			for (Book book : books.values()) {
				System.out.println(book);
			}

			if (books.containsKey(bookID)) {
				System.out.println("Book already exists!");
			} else {
				// books.put(bookID, newBook);
				try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(fileName))) {
					writer.writeObject(newBook);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Book Add successfuly!");
			}

			try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName))) {
				Book book;
				while (true) {
					try {
						book = (Book) input.readObject();
						books.put(book.getBookID(), book);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (EOFException e) {
						break;
					}
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			for (Book book : books.values()) {
				System.out.println(book);
			}
		}

	}
}
