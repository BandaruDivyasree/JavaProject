package com.bookapp.main;

import java.util.List;
import java.util.Scanner;

import com.bookapp.bean.Book;
import com.bookapp.service.BookImpl;
import com.bookapp.service.BookInter;

public class Client {


	public static void main(String[] args) {
	
		BookInter bookInter = new BookImpl();
		Scanner s=new Scanner(System.in);
		
		/*book.setAuthor("divya");
		book.setBookid(1);
		book.setTitle("java");
		book.setCategory("programming");
		book.setPrice(100);
		bookInter.addBook(book);
		book.setAuthor("Prathyu");
		book.setBookid(3);
		book.setTitle("C");
		book.setCategory("programming");
		book.setPrice(300);
		bookInter.addBook(book);
		//bookInter.getAllBooks();
		System.out.println(bookInter.getAllBooks());
		System.out.println("Search the Author Name:");
		String authorToSearch=s.next();
	*/
		for(int i=0;i<3;i++){
			Book book=new Book();
			System.out.println("Title:");
			String title=s.next();
			book.setTitle(title);
			System.out.println("Author:");
			String author=s.next();
			book.setAuthor(author);
			System.out.println("Category:");
			String category=s.next();
			book.setCategory(category);
			System.out.println("Bookid:");
			int bookId=s.nextInt();
			book.setBookid(bookId);
			System.out.println("price:");
			int price=s.nextInt();
			book.setPrice(price);
			bookInter.addBook(book);
			
			
			bookInter.getAllBooks();
			System.out.println(bookInter.getAllBooks());
			System.out.println("Search the Author Name:");
			String authorToSearch=s.next();
		}
		
	}
}




