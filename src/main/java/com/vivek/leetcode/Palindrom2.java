package com.vivek.leetcode;

public class Palindrom2 {
//    public boolean isPalindrom(String input) {
//        int oneCharRemoved = 0;
//        for(int i=0, j=input.length() -1 ; i<=j; i++, j--){
//            while(i<j && !Character.isLetterOrDigit(input.charAt(i))){
//                i++;
//            }
//            while(i<j && !Character.isLetterOrDigit(input.charAt(j))){
//                j--;
//            }
//            if(Character.toLowerCase(input.charAt(i)) != Character.toLowerCase(input.charAt(j))){
//                if((Character.toLowerCase(input.charAt(j)) == Character.toLowerCase(input.charAt(i+1)) && Character.toLowerCase(input.charAt(j-1)) == Character.toLowerCase(input.charAt(i+2)))){
//                    i++;
//                }else if(Character.toLowerCase(input.charAt(i)) == Character.toLowerCase(input.charAt(j-1)) && Character.toLowerCase(input.charAt(i+1)) == Character.toLowerCase(input.charAt(j-2))){
//                    j--;
//                }
//                oneCharRemoved++;
//            }
//            if(i == j && oneCharRemoved==1 && input.length()%2!=0 && Character.toLowerCase(input.charAt(j)) != Character.toLowerCase(input.charAt(j - 1))) return false;
//            if(oneCharRemoved == 1 && input.length()%2!=0 && (input.length() - j -i < 2)) return false;
//            if(oneCharRemoved > 1) return false;
//        }
//        return true;
//    }

    public boolean isPalindrom(String input){
        int left = 0;
        int right = input.length() - 1;
        while(left <= right){
            while(left<right && !Character.isLetterOrDigit(input.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(input.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(input.charAt(left)) == Character.toLowerCase(input.charAt(right))){
                left++;
                right--;
            }else{
                boolean leftBoolean = true;
                int i=left;
                int j=right-1;
                while(i<=j){
                    if(Character.toLowerCase(input.charAt(i)) == Character.toLowerCase(input.charAt(j))){
                        i++;j--;
                    }
                    else{
                        leftBoolean = false;
                        break;
                    }
                }
                boolean rightBoolean = true;
                i=left + 1;
                j=right;
                while(i<=j){
                    if(Character.toLowerCase(input.charAt(i)) == Character.toLowerCase(input.charAt(j))){
                        i++;j--;
                    }
                    else{
                        rightBoolean = false;
                        break;
                    }
                }
                return leftBoolean || rightBoolean;
            }
        }
        return true;
    }

    private boolean checkPalindrom(String input, int left, int right) {
        boolean removedChar;
        while(left <= right){

            if(Character.toLowerCase(input.charAt(left)) != Character.toLowerCase(input.charAt(right))){
                return false;
            }else{
                left++;
                right++;
            }
        }
        return true;
    }
}
