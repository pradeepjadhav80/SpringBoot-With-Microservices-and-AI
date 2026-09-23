package com.tca.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Author 
{
	@Id
	private Long aid;
	private String authorName;
	
	@ManyToMany(cascade = {
							CascadeType.PERSIST,
							CascadeType.MERGE,
							CascadeType.DETACH,
							CascadeType.REFRESH
							},
							fetch=FetchType.LAZY,
							mappedBy="authors")
	List<Book> books = new ArrayList<>();
}
