package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GenerateParenthesisTest {

    private GenerateParenthesis generateParenthesis = new GenerateParenthesis();


    @Test
    public void test_with_zero_length(){
        int target = 0;
        List<String> result = generateParenthesis.generate(target);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void test_with_zero_length_1(){
        int target = 1;
        List<String> result = generateParenthesis.generate(target);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals("()", result.get(0));
    }

    @Test
    public void test_with_zero_length_2(){
        int target = 2;
        List<String> result = generateParenthesis.generate(target);
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(1, result.stream().filter(s -> s.equalsIgnoreCase("()()")).count());
        Assert.assertEquals(1, result.stream().filter(s -> s.equalsIgnoreCase("(())")).count());
    }
}
