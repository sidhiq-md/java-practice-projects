package com.kk;

public class Book {
static int totalNoOfBooks;
String title;
String author;
String isbn;
boolean isBorrowed;

static{       //static runs only once in a code
	totalNoOfBooks = 0;
}


{
	totalNoOfBooks++;
}

Book(String isbn, String title, String author){
	this.isbn = isbn;
	this.author = author;
	this.title = title;
}

Book(String isbn) {
	this(isbn, "unknown", "unknown");
}

static int getTotalNumberOfBooks() {
	return totalNoOfBooks;
}

void borrowBook() {
	if(isBorrowed) {
		System.out.println("book is already borrowed");
	}
	else {
		this.isBorrowed = true;
		System.out.println("enjoy thr book  " + this.title);
	}
}

void returnBook() {
	if(isBorrowed) {
		this.isBorrowed = false;
		System.out.println("thanks for returning, please leave a review");
	}
	else {
		System.out.println(" the book is already in library, how can you return");
	}
}

public static void main(String[] args) {
	Book designofThings = new Book("1234", "designOfMachine", "Sidhiq");
	System.out.println(Book.totalNoOfBooks);
	Book theoryOfMachine = new Book("12345");
	System.out.println(Book.totalNoOfBooks);
	designofThings.borrowBook();
	theoryOfMachine.borrowBook();
	designofThings.borrowBook();
	designofThings.returnBook();
	designofThings.returnBook();
}

}
