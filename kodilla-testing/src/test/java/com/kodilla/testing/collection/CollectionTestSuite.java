package com.kodilla.testing.collection;

import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;


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

        ArrayList<Integer> emptyList = new ArrayList<>();
        ArrayList<Integer> result = collection.exterminate(emptyList);

            assertNotNull(result);
            assertTrue(result.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

    System.out.println("ArrayList compare");

        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);

        ArrayList<Integer> evenList = new ArrayList<Integer>();
        evenList.add(2);
        evenList.add(4);

        ArrayList<Integer> result = collection.exterminate(normalList);

        assertNotNull(result);
        assertEquals(evenList, result);
        assertTrue(result.contains(evenList));

    }
}