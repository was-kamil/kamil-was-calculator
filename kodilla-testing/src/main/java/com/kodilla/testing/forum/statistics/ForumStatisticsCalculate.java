package com.kodilla.testing.forum.statistics;

public class ForumStatisticsCalculate {

    int averageNumberPostsPerUser;
    int averageNumberCommentsPerUser;
    int averageNumberCommentsPerPost;

    Statistics statistics;


    public ForumStatisticsCalculate(Statistics statistics) {
        this.statistics = statistics;
    }


    void calculateAdvStatistics(Statistics statistics) {

        if (statistics.usersNames().size()!=0) {
            averageNumberPostsPerUser = statistics.postsCount() / statistics.usersNames().size();
                } else { averageNumberPostsPerUser = 0; }

        if (statistics.usersNames().size()!=0) {
            averageNumberCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
                } else { averageNumberCommentsPerUser = 0; }

        if (statistics.postsCount()!=0) {
            averageNumberCommentsPerPost = statistics.commentsCount() / statistics.postsCount();
                } else { averageNumberCommentsPerPost = 0; }
    }


    void showStatistics() {

        System.out.println("Average number of posts per user: " + averageNumberPostsPerUser);
        System.out.println("Average number of comments per user: " + averageNumberCommentsPerUser);
        System.out.println("Average number of comments per post: " + averageNumberCommentsPerPost);

        System.out.println("Number of users: " + statistics.usersNames().size());
        System.out.println("Number of posts: " + statistics.postsCount());
        System.out.println("Number of comments: " + statistics.commentsCount());
    }
}