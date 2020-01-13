package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;


public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String text = "I know that I know nothing.";

        System.out.println(poemBeautifier.beautify(text, (string) -> string.toUpperCase()));
        System.out.println(poemBeautifier.beautify(text, (string) -> "ABC " + string + " ABC"));
        System.out.println(poemBeautifier.beautify(text, (string) -> "[*] " + string + " [*]"));
        System.out.println(poemBeautifier.beautify(text, (string) -> ":-) " + string + " :-("));
    }
}