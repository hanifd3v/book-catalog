package com.hanifd3v.config;

import com.hanifd3v.domain.Author;
import com.hanifd3v.domain.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Author author1() {
        Author author = new Author();
        author.setId(1L);
        author.setName("Karen Armstrong");
        return author;
    }

    @Bean
    public Book book1(Author author1) {
        Book book = new Book("The Lost Art of Scripture", author1);
        return book;

    }
}
