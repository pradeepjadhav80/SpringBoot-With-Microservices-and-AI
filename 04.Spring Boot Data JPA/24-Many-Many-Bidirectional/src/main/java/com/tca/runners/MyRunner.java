package com.tca.runners;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.entity.Author;
import com.tca.entity.Book;
import com.tca.service.AuthorService;
import com.tca.service.BookService;

import jakarta.transaction.Transactional;

@Component
public class MyRunner implements ApplicationRunner
{
	@Autowired
	private BookService bookService;

	@Autowired
	private AuthorService authorService;
	
	@Override
	@Transactional
	public void run(ApplicationArguments args) throws Exception 
	{
/*		
		//Adding Book
		Book book = new Book();
		book.setBid(1L);
		book.setBookName("Java");
		
		Author author1 = new Author();
		author1.setAid(101L);
		author1.setAuthorName("Pradeep");
		
		Author author2 = new Author();
		author2.setAid(102L);
		author2.setAuthorName("Aniket");
		
		book.setAuthors(Arrays.asList(author1,author2));
		bookService.saveBook(book);
*/
/*		
		//Fetch Author by book
		Book b = bookService.fetchBookById(1L);
		
		System.out.println("Book ID   :" +  b.getBid());
		System.out.println("Book Name :" +  b.getBookName());
		System.out.println("====================================================");
		
		List<Author> authors = b.getAuthors();
		
		for(Author a : authors)
		{
			System.out.println("AUTHOR ID   :" +  a.getAid());
			System.out.println("AUTHOR Name :" +  a.getAuthorName());
			System.out.println("-------------------------------------------------");
		}
*/
/*		
		//Delete Book
		bookService.removeBookById(1L);
		System.out.println("Book Removed !!");
*/
/*	
		//Save Book By Author
		Author author = new Author();
		author.setAid(104L);
		author.setAuthorName("Suyash");
		
		Book book1 = new Book();
		book1.setBid(1L);
		book1.setBookName("Java");
		
		Book book2 = new Book();
		book2.setBid(2L);
		book2.setBookName("Python");
		
		author.setBooks(Arrays.asList(book1,book2));
		authorService.saveAuthor(author);
		System.out.println("Author is Saved succesfully !!");
*/
/*
		Author author = authorService.fetchAuthorById(104L);
		System.out.println("Author Id   : "+author.getAid());
		System.out.println("Author name : "+author.getAuthorName());
		
		List<Book> list	 = author.getBooks();
		
		for(Book book : list)
		{
			System.out.println("Book Id   : "+book.getBid());
			System.out.println("Book Name : "+book.getBookName());
		}
*/
		authorService.removeAuthorById(104L);
		System.out.println("Book Removed !!");
		
	}

}
