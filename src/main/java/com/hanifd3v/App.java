package com.hanifd3v;

import com.hanifd3v.config.AppConfig;
import com.hanifd3v.domain.Author;
import com.hanifd3v.domain.Book;
import com.hanifd3v.service.AuthService;
import com.hanifd3v.service.impl.EmailServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {

        System.out.println( "Hello World!" );
//        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
//        Author author = (Author) appContext.getBean("author2");
//        System.out.println(author.getId());
//        System.out.println(author.getName());
//
//        Book book = (Book) appContext.getBean("book2");
//        System.out.println(book.getTitle());
//        System.out.println(book.getAuthor().getId());
//        System.out.println(book.getAuthor().getName());
//         EmailServiceImpl emailService = (EmailServiceImpl) appContext.getBean("emailService");
//         emailService.sendEmail("destination@gmail.com", "Your OTP", "Your OTP is 134625");134625
         ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//         Author author = (Author) ctx.getBean("author1");
//         System.out.println(author.getName());
//         System.out.println(author.getId());
         Book book1 = (Book) ctx.getBean("book1");
         System.out.println(book1.getTitle());
         System.out.println(book1.getAuthor().getName());
    }
}
