package com.tca.service;

import com.tca.entity.Book;

public interface BookService 
{
	public Book saveBook(Book book);
	public Book fetchBookById(Long id);
	public void removeBookById(Long id);
}
