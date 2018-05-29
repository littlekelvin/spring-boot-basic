package com.example.demo.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibnacciCounterTest {

    @Test
    public void should_return_negative_1_when_given_negative_num() throws Exception {
        int fibnacci = FibnacciCounter.getFibnacci(-1);

        Assert.assertTrue(fibnacci == -1);
    }

    @Test
    public void should_return_1_when_given_1() throws Exception {
        int fibnacci = FibnacciCounter.getFibnacci(1);

        Assert.assertTrue(fibnacci == 1);
    }

    @Test
    public void should_return_1_when_given_2() throws Exception {
        int fibnacci = FibnacciCounter.getFibnacci(2);

        Assert.assertTrue(fibnacci == 1);
    }

    @Test
    public void should_return_2_when_given_3() throws Exception {
        int fibnacci = FibnacciCounter.getFibnacci(3);

        Assert.assertTrue(fibnacci == 2);
    }

    @Test
    public void should_return_3_when_given_4() throws Exception {
        int fibnacci = FibnacciCounter.getFibnacci(4);

        Assert.assertTrue(fibnacci == 3);
    }

    @Test
    public void should_return_5_when_given_5() throws Exception {
        int fibnacci = FibnacciCounter.getFibnacci(5);

        Assert.assertTrue(fibnacci == 5);
    }
}