package com.vivek.leetcode;

public class MaxContainerArea {

    //Approach 1
    public int maxArea1(int[] height) {
        //1. initiate maxArea to zero
        int maxArea = 0;
        //2. left pointer to zero
        for(int i=0; i< height.length; i++){
            //3. right pointer to left pointer plus one
            for(int j=i+1; j< height.length;j++){
                //4. take min of two heights and multiply width to get max area
                int currentArea = Math.min(height[i], height[j]) * (j - i);
                //5. compare max area and keep max out of above
                maxArea = Math.max(maxArea, currentArea);
            }
        }
        //6. return max area
        return maxArea;
    }

    //Approach 2
    public int maxArea(int[] height) {
        //1. initiate maxArea to zero
        int maxArea = 0;
        //2. left pointer to zero
        int left = 0;
        //3. right pointer to last element
        int right = height.length - 1;
        //4. iterate while left is less than right
        while(left < right){
            //5. take min of two heights and multiply width to get max area
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            //6. compare max area and keep max out of above
            maxArea = Math.max(maxArea, currentArea);
            //7. increase pointer from end whose height is less
            if(height[left] < height[right]) left++;
            else right--;
        }
        //6. return max area
        return maxArea;
    }

}
