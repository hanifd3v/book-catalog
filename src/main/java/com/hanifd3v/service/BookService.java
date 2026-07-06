package com.hanifd3v.service;

import com.hanifd3v.domain.Author;
import com.hanifd3v.domain.Book;

public class BookService {

    private Book book;

    public BookService() {
        super();
        Author author = new Author();
        book = new Book(author);
    }
}
