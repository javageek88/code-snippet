package com.vivek.strings;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class OccurenceFinder {

    @Test
    public void duplicateElelemts(){
        final int [] inputElements = new int[]{5,6,3,4,5,6,7};
        final Map<Integer, Integer> elementCounterMap = new HashMap<>();
        final List<Integer> duplicateElelemtsMap = new ArrayList<>();
        for(int i = 0 ; i < inputElements.length ; i++){
            if(elementCounterMap.containsKey(inputElements[i])){
                elementCounterMap.put(inputElements[i], elementCounterMap.get(inputElements[i]) + 1);
                duplicateElelemtsMap.add(inputElements[i]);
            }else{
                elementCounterMap.put(inputElements[i], 1);
            }
        }
        Assert.assertEquals(Arrays.asList(5,6), duplicateElelemtsMap);
    }
}
