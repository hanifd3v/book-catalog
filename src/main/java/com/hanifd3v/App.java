package com.hanifd3v;

import com.hanifd3v.domain.Author;
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
        Author author = (Author) appContext.getBean("author");
        System.out.println(author.getId());
        System.out.println(author.getName());
    }
}
