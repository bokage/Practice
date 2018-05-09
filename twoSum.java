/*
LeetCode Problem #1 : Two Sum
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice. 
*/


public class twoSum{
    public int[] twoSum(int[] nums, int target) { 
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                if(i != j && nums[i] + nums[j] == target){
                    return new int[] {i,j}; 
                }
            }
        }
        return new int[] {-1, -1}; //returns this if there is no solution
    }
}
