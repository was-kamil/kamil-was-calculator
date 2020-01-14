package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public final class Forum {

    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(1, "Kamil", 'M', LocalDate.parse("1984-02-01"), 100));
        usersList.add(new ForumUser(2, "Kami", 'M', LocalDate.parse("1999-01-12"), 2));
        usersList.add(new ForumUser(3, "Kam", 'M', LocalDate.parse("1900-01-08"), 43));
        usersList.add(new ForumUser(4, "Joanna", 'F', LocalDate.parse("2000-05-01"), 12));
        usersList.add(new ForumUser(5, "Joann", 'F', LocalDate.parse("1984-01-01"), 1));
        usersList.add(new ForumUser(6, "Joan", 'F', LocalDate.parse("2002-01-01"), 78));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(usersList);
    }
}