package com.tca.service;

import com.tca.entity.Author;

public interface AuthorService 
{
	public Author saveAuthor(Author author);
	public Author fetchAuthorById(Long id);
	public void removeAuthorById(Long id);
}
