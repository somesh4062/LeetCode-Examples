/* Two Sum Approach 1: Brute Force*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
       for (int i = 0; i< nums.length;i++)
       {
            for(int j = i+1;j< nums.length;j++)
            {
                if (nums[i] + nums[j]== target)
                {
                    return new int[]{i,j};
                }
            }
       }
       return new int[]{};
    }
}

/* Two Sum Approach 1: Hash Table */

class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> numofIndex = new HashMap<Integer,Integer>();

       for(int i = 0; i<nums.length;i++){
        int complement = target - nums[i];
        if (numofIndex.containsKey(complement)){
            return new int[]{numofIndex.get(complement),i};
        }
        numofIndex.put(nums[i],i);
       }
       return new int[]{};
    }
}
