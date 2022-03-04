package com.vivek.leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GroupAnagramsTest {

    private GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    public void testEmptyStringAnagrams() {
        String[] inputAnagrams = new String[]{""};
        List<List<String>> resultMapping = groupAnagrams.groupAnagrams(inputAnagrams);
        Assert.assertEquals(1, resultMapping.size());
    }

    @Test
    public void testOneStringAnagrams() {
        String[] inputAnagrams = new String[]{"abc"};
        List<List<String>> resultMapping = groupAnagrams.groupAnagrams(inputAnagrams);
        Assert.assertEquals(1, resultMapping.size());
    }

    @Test
    public void testTwoStringAnagrams() {
        String[] inputAnagrams = new String[]{"abc", "cba", "def"};
        List<List<String>> resultMapping = groupAnagrams.groupAnagrams(inputAnagrams);
        Assert.assertEquals(2, resultMapping.size());
    }

    @Test
    public void testMultipleStringAnagrams() {
        String[] inputAnagrams = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> resultMapping = groupAnagrams.groupAnagrams(inputAnagrams);
        Assert.assertEquals(3, resultMapping.size());
    }
}
