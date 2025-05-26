package com.main3;

import com.book.Book;
import com.publisher.Publisher;

public class Main3 {
	
	public static void main(String[] args) {
		Publisher publisherObject=Publisher.getPublisherObject("Suraj", "Delhi", "PUB12345");
		Book bookObject=Book.getBookObject("Novel", "Pankaj", publisherObject, 800);
		
		if(bookObject==null && publisherObject==null) {
			System.out.println("Book Creation is failed due to invalid data");
		}
		else {
			System.out.println(publisherObject);
			System.out.println(bookObject);
		}
	}
}