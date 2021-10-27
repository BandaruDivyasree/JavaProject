package com.bookapp.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bookapp.bean.Book;
import com.bookapp.exception.AuthorNotFoundException;
import com.bookapp.exception.CategoryNotFoundException;

public class BookImpl implements BookInter{

	List<Book> bookList = new ArrayList<>();
	
	@Override
	public void addBook(Book book) {
		bookList.add(book);
	}

	@Override
	public List<Book> getAllBooks() {
		Collections.sort(bookList, (book1,book2)->{
			return book1.getTitle().compareTo(book2.getTitle());
		});
		return bookList;
	}

	@Override
	public List<Book> getBookbyAuthor(String author) throws AuthorNotFoundException {
		// TODO Auto-generated method stub
		/*List<Book> bookList=TotalBooks();
		List<Book> bookAuthor=new ArrayList<>();
		*/
		try {
			for(Book book:bookList) {
				if(book.getAuthor().equals(author)) {//it checks from getAuthor to given user input if it matches
					                                 //it will add if not throw exception.
					bookList.add(book);
				}else {
					throw new AuthorNotFoundException();
				}
			}
		}
		catch(AuthorNotFoundException e) {
			System.out.println(e.getMessage());
		}
		Collections.sort(bookList,(book1,book2)->{
			return book1.getAuthor().compareTo(book2.getAuthor());
		});
		return bookList;

	
	}

	@Override
	public List<Book> getBookbycategory(String category) throws CategoryNotFoundException {
		// TODO Auto-generated method stub
		
		try {
			for(Book book:bookList) {
				if(book.getCategory().equals(category)) {//it checks from getCategory to given user input if it matches
					                                 //it will add if not throw exception.
					bookList.add(book);
				}else {
					throw new CategoryNotFoundException();
				}
			}
		}
		catch(CategoryNotFoundException e) {
			System.out.println(e.getMessage());
		}
		Collections.sort(bookList,(book1,book2)->{
			return book1.getAuthor().compareTo(book2.getAuthor());
		});
		return bookList;
	}

	
	
	

	

}


