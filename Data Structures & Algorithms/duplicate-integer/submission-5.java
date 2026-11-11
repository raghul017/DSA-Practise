class Solution {
    public boolean hasDuplicate(int[] nums) {
        // for(int i = 0; i< nums.length ; i ++){
        //     for(int j = i + 1; j < nums.length ; j ++)
        //         if(nums[j] == nums[i]){
        //             return true;
        //         }
        // }

        // return false;
        Set<Integer> seen = new HashSet<>();

        for (int num : nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }

        return false;
    }
}