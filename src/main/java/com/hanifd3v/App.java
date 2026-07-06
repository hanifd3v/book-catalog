package com.hanifd3v;

import com.hanifd3v.domain.Author;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        Author author = new Author();
        author.setId(1L);
        author.setName("Karen Armstrong");
    }
}
