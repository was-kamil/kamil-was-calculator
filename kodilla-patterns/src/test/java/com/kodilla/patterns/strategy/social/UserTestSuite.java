package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.*;
import org.junit.Assert;
import org.junit.Test;


public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //Given
        User millenials = new Millenials("Howard");
        User yGeneration = new YGeneration("Sheldon");
        User zGeneration = new ZGeneration("Leonard");

        //When
        String snapchat = millenials.sharePost();
            System.out.println(millenials.getUserName() + ", prefers Snapchat to communicate.");
        String twitter = yGeneration.sharePost();
            System.out.println(yGeneration.getUserName() + ", prefers Twitter to communicate.");
        String facebook = zGeneration.sharePost();
            System.out.println(zGeneration.getUserName() + ", prefers Facebook to communicate.");

        //Then
        Assert.assertEquals("Snapchat", snapchat);
        Assert.assertEquals("Twitter", twitter);
        Assert.assertEquals("Facebook", facebook);
    }

    @Test
    public void testIndividualSharingStrategy() {

        //Given
        User millenials = new Millenials("Howard");
        millenials.setSocialPublisher(new FacebookPublisher());

        //When
        String facebook = millenials.sharePost();
            System.out.println (" ");
            System.out.println (millenials.getUserName() + ", used " + facebook + " as backup solution.");

        //Then
        Assert.assertEquals("Facebook", facebook);
    }
}