class Solution {
    public int[] twoSum(int[] nums, int target) {

        // for(int i = 0; i < nums.length;i++){
        //     for(int j = i+1; j < nums.length;j++){
        //         if ((nums[i] + nums[j] )== target){
        //             return new int[]{i , j};
        //         }
        //     }
        // }
        // return new int[]{};
        Map<Integer , Integer> seen = new HashMap<>();

        for (int i = 0 ; i < nums.length; i ++){
            int remain = target - nums[i];

            if(seen.containsKey(remain)){
                return new int[]{seen.get(remain) , i};
            }

            seen.put(nums[i] , i);
        }

        return new int[]{};
        
    }
}