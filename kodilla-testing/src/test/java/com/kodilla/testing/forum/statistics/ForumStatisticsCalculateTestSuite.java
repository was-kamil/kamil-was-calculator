package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ForumStatisticsCalculateTestSuite {

    private static int testCounter = 0;


    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Test START:  " + testCounter);
    }

    @After
    public void after() {
        System.out.println("Test END");
        System.out.println("-------------------------------------");
    }


    @Test
    public void testCalculateAdvStatisticsWhenNoPosts() {

        Statistics statisticsMock = mock(Statistics.class);

        List<String> testUsers = new ArrayList<>();
            testUsers.add("user1");
            testUsers.add("user2");
            testUsers.add("user3");
            testUsers.add("user4");
            testUsers.add("user5");

        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(100);

        ForumStatisticsCalculate forumStatistics = new ForumStatisticsCalculate(statisticsMock);

        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        Assert.assertEquals(0, forumStatistics.averageNumberPostsPerUser);
    }

    @Test
    public void testCalculateAdvStatisticsWhen1000Posts() {

        Statistics statisticsMock = mock(Statistics.class);

        List<String> testUsers = new ArrayList<>();
            testUsers.add("user1");
            testUsers.add("user2");
            testUsers.add("user3");
            testUsers.add("user4");
            testUsers.add("user5");

        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        ForumStatisticsCalculate forumStatistics = new ForumStatisticsCalculate(statisticsMock);

        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        Assert.assertEquals(1000,forumStatistics.statistics.postsCount(),0);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNoComments() {

        Statistics statisticsMock = mock(Statistics.class);

        List<String> testUsers = new ArrayList<>();
            testUsers.add("user1");
            testUsers.add("user2");
            testUsers.add("user3");
            testUsers.add("user4");
            testUsers.add("user5");

        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(123);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatisticsCalculate forumStatistics = new ForumStatisticsCalculate(statisticsMock);

        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        Assert.assertEquals(0, forumStatistics.statistics.commentsCount(),0);
    }

    @Test
    public void testCalculateAdvStatisticsWhenCommentsLessThanPosts() {

        Statistics statisticsMock = mock(Statistics.class);

        List<String> testUsers = new ArrayList<>();
            testUsers.add("user1");
            testUsers.add("user2");
            testUsers.add("user3");
            testUsers.add("user4");
            testUsers.add("user5");

        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(10);

        ForumStatisticsCalculate forumStatistics = new ForumStatisticsCalculate(statisticsMock);

        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        Assert.assertEquals(0.01, forumStatistics.averageNumberCommentsPerPost, 0.1);
    }

    @Test
    public void testCalculateAdvStatisticsWhenPostsLessThanComments() {

        Statistics statisticsMock = mock(Statistics.class);

        List<String> testUsers = new ArrayList<>();
            testUsers.add("user1");
            testUsers.add("user2");
            testUsers.add("user3");
            testUsers.add("user4");
            testUsers.add("user5");

        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        ForumStatisticsCalculate forumStatistics = new ForumStatisticsCalculate(statisticsMock);

        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        Assert.assertEquals(100, forumStatistics.averageNumberCommentsPerPost);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNoUsers() {

        Statistics statisticsMock = mock(Statistics.class);

        List<String> testUsers = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        ForumStatisticsCalculate forumStatistics = new ForumStatisticsCalculate(statisticsMock);

        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        Assert.assertEquals(0, forumStatistics.averageNumberCommentsPerUser);
    }

    @Test
    public void testCalculateAdvStatisticsWhen100Users() {

        Statistics statisticsMock = mock(Statistics.class);

        List<String> testUsers = new ArrayList<>();

            for(int i =0; i<100; i++) {
                testUsers.add("User nr " + i);
            }

        when(statisticsMock.usersNames()).thenReturn(testUsers);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        ForumStatisticsCalculate forumStatistics = new ForumStatisticsCalculate(statisticsMock);

        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        Assert.assertEquals(100, forumStatistics.statistics.commentsCount(), 0);
    }
}