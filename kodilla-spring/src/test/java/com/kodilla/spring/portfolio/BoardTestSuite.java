package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        String taskToDo = "First";
        String taskInProgress = "Second";
        String taskDone = "Third";
        board.getToDoList().addTask(taskToDo);
        board.getInProgressList().addTask(taskInProgress);
        board.getDoneList().addTask(taskDone);

        Assert.assertEquals("First", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Second", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("Third", board.getDoneList().getTasks().get(0));
    }
}