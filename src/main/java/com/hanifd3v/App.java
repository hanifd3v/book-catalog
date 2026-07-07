package com.hanifd3v;

import com.hanifd3v.domain.Author;
import com.hanifd3v.domain.Book;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
        Author author = (Author) appContext.getBean("author2");
        System.out.println(author.getId());
        System.out.println(author.getName());

        Book book = (Book) appContext.getBean("book2");
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor().getId());
        System.out.println(book.getAuthor().getName());
    }
}
