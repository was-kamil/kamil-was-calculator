package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;


public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {

        Logger.getInstance().log("SAMPLE_001");
        Logger.getInstance().log("SAMPLE_002");

        String result = Logger.getInstance().getLastLog();

        Assert.assertEquals("SAMPLE_002", result);
    }
}