package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesisTest {

    private ValidParenthesis validParenthesis = new ValidParenthesis();

    @Test
    public void testScenario_1(){
        String parenthesis = "()";
        boolean isValid = validParenthesis.isValid(parenthesis);
        Assert.assertTrue(isValid);
    }

    @Test
    public void testScenario_2(){
        String parenthesis = "()()[]{[{}]}";
        boolean isValid = validParenthesis.isValid(parenthesis);
        Assert.assertTrue(isValid);
    }

    @Test
    public void testScenario_3(){
        String parenthesis = "(()()[]{[{}]}[[[[{{{{(((())))}}}}]]]])";
        boolean isValid = validParenthesis.isValid(parenthesis);
        Assert.assertTrue(isValid);
    }

    @Test
    public void testScenarioInvalid_1(){
        String parenthesis = "((()[]{[{}]}[[[[{{{{(((())))}}}}]]]])";
        boolean isValid = validParenthesis.isValid(parenthesis);
        Assert.assertFalse(isValid);
    }

    @Test
    public void testScenarioInvalid_2(){
        String parenthesis = "((()[]{[{}]}[[[[{{{{(())))}}}}]]]])";
        boolean isValid = validParenthesis.isValid(parenthesis);
        Assert.assertFalse(isValid);
    }

    @Test
    public void testScenarioInvalid_3(){
        String parenthesis = "(]";
        boolean isValid = validParenthesis.isValid(parenthesis);
        Assert.assertFalse(isValid);
    }
}
