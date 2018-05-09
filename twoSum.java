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
