package com.kodilla.stream.forumuser;

import java.time.LocalDate;


public final class ForumUser {

        private final int userID;
        private final String userName;
        private final char userSex;
        private final LocalDate birthDate;
        private final int postsQuantity;

    public ForumUser(final int userID, final String userName, final char userSex, final LocalDate birthDate, final int postsQuantity) {

        this.userID = userID;
        this.userName = userName;
        this.userSex = userSex;
        this.birthDate = birthDate;
        this.postsQuantity = postsQuantity;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", birthDate=" + birthDate +
                ", postsQuantity=" + postsQuantity +
                '}';
    }
}