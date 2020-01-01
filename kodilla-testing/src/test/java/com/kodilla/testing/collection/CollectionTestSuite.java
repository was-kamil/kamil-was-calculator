package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;


public class CollectionTestSuite
{
    private OddNumbersExterminator exterm;
    int[] numbers = new int[]{1, 2, 3, 4, 5};
    int[] evenNumbers = new int[]{2, 4};


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
    }

    @Test
    public void testOddNumbersExterminatorNormalList()
    {
        reportCase("ArrayList with odds and evens as an argument");
        ArrayList<Integer> result = exterm.exterminate(new ArrayList<>());
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        Assert.assertEquals(result, evenNumbers);
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