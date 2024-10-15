package com.bptn.course._22_FileHandling;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {
	private String bookID;
	private String title;
	private String author;
	private LocalDate date;

	public Book(String bookID, String title, String author, LocalDate date) {
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getBookID() {
		return bookID;
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", title=" + title + ", author=" + author + ", date=" + date + "]";
	}
}
