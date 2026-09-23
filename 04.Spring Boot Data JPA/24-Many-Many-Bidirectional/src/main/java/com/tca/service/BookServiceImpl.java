package com.tca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tca.entity.Book;
import com.tca.repository.BookRepository;

@Service("bookService")
public class BookServiceImpl implements BookService 
{
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public Book saveBook(Book book) 
	{
		return bookRepository.save(book);
		
	}

	@Override
	public Book fetchBookById(Long id) 
	{
		return bookRepository.findById(id).get();
	}

	@Override
	public void removeBookById(Long id)
	{
		bookRepository.deleteById(id);
	}

}
