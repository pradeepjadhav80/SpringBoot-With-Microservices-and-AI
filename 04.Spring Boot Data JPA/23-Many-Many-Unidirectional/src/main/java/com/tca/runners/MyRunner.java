package com.tca.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.tca.entity.Author;
import com.tca.entity.Book;
import com.tca.service.BookService;

import jakarta.transaction.Transactional;

@Component
public class MyRunner implements ApplicationRunner
{
	@Autowired
	private BookService bookService;
	
	@Transactional
	@Override
	public void run(ApplicationArguments args) throws Exception 
	{
/*		
		//Book is saved succesfully !!
		
		Book book = new Book();
		book.setBid(1L);
		book.setBookName("Java");
		
		Author author1 = new Author();
		author1.setAid(101L);
		author1.setAuthorName("Aniket");
		
		Author author2 = new Author();
		author2.setAid(102L);
		author2.setAuthorName("Kaushal");
		
		book.setAuthors(Arrays.asList(author1,author2));
		
		bookService.saveBook(book);
		System.out.println("Book is Saved Succesfully !!");
*/
/*	
		//Fetch Author by Book
		Book book = bookService.fetchById(2L);
		System.out.println("Book Id   : "+book.getBid());
		System.out.println("Book Name : "+book.getBookName());
		System.out.println("-".repeat(50));
		
		List<Author> list = book.getAuthors();
		
		for(Author author : list)
		{
			System.out.println("Author  Id  : "+author.getAid());
			System.out.println("Author Name : "+author.getAuthorName());
			System.out.println("=".repeat(50));
		}
*/
		bookService.removeBook(2L);
		System.out.println("Book is Removed Successfully !!");
		
	}

}
