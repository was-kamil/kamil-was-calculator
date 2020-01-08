package com.kodilla.testing.collection;

import org.junit.*;
import java.util.*;

import static org.junit.Assert.assertEquals;



public class CollectionTestSuite {

    private OddNumbersExterminator collection = new OddNumbersExterminator();


    @Before
    public void before()
    { System.out.println("Test unit BEGIN"); }

    @After
    public void after()
    { System.out.println("Test unit END" + "\n"); }


    @Test
    public void testOddNumbersExterminatorEmptyList() {

            System.out.println("Empty ArrayList as an argument");

        ArrayList<Integer> numbers = new ArrayList<>();
/*
            System.out.println(numbers.size());
*/
        Object result = collection.exterminate(numbers);

        assertEquals(numbers, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

            System.out.println("ArrayList compare");

        ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
/*
            System.out.println(numbers.size());
*/
        ArrayList<Integer> evenNumbers = new ArrayList<>();
            evenNumbers.add(2);
            evenNumbers.add(4);
/*
            System.out.println(evenNumbers.size());
*/
        Object result = collection.exterminate(numbers);

        assertEquals(evenNumbers, result);
    }
}