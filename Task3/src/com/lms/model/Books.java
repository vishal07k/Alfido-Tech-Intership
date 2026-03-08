package com.lms.model;

public class Books {

	private int bookId;
	private String bookTitle;
	private String author;
	private String category;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookTitle=" + bookTitle + ", author=" + author + ", category=" + category
				+ "]";
	}
	
	
}
