package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class CollectionTestSuite
{
    private OddNumbersExterminator exterm;

    @Before
    public void before()
    {
        report("Test unit BEGIN");
        exterm = new OddNumbersExterminator();
    }

    @After
    public void after()
    {
        report("Test unit END");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList()
    {
        reportCase("Empty ArrayList as an argument");
        ArrayList<Integer> result = exterm.exterminate(new ArrayList<>());
        Assert.assertNotNull(result);
        if (result != null)
        {
            Assert.assertTrue(result.isEmpty());
        }
    }

    @Test
    public void testOddNumbersExterminatorNormalList()
    {
        reportCase("ArrayList with odds and evens as an argument");
        int evensSize = 300;
        List<Integer> evenNumbers = new ArrayList<>();
        Random rand = new Random();
        while (evenNumbers.size() < evensSize+1)
        {
            //random evens
            evenNumbers.add(rand.nextInt()&-2);
            // repeated 0, -2 and 2
            evenNumbers.add(rand.nextInt(3)&-2);
            evenNumbers.add(-(rand.nextInt(3)&-2));
        }

        ArrayList<Integer> normal = new ArrayList<>();
        for(int n : evenNumbers)
        {
            normal.add(n);
            normal.add(n + 1);
        }

        ArrayList<Integer> result = exterm.exterminate(normal);
        Assert.assertArrayEquals(evenNumbers.toArray(),result.toArray());
    }

    private static void report(String msg)
    {
        System.out.println(msg);
    }

    private static void reportCase(String title)
    {
        System.out.printf("Case: %s\n", title);
    }
}