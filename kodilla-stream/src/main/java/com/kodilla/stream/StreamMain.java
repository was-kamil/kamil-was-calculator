package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.person.People;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {


        //Book
        BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);


        //Book_1
            /*
            BookDirectory theBookDirectory = new BookDirectory();
             */
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
            theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


        //Book_2
            /*
            BookDirectory theBookDirectory = new BookDirectory();
             */
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);


        //People
        People.getList().stream()
                .map(s -> s.toUpperCase())
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);


        //PoemBeautifier
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String text = "I know that I know nothing.";

        System.out.println(poemBeautifier.beautify(text, (string) -> string.toUpperCase()));
        System.out.println(poemBeautifier.beautify(text, (string) -> "ABC " + string + " ABC"));
        System.out.println(poemBeautifier.beautify(text, (string) -> "[*] " + string + " [*]"));
        System.out.println(poemBeautifier.beautify(text, (string) -> ":-) " + string + " :-("));


        //NumbersGenerator
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);


    }


}