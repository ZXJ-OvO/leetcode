import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }

            System.out.println(


                    "hashMap: " + hashMap + " nums[i]: " + nums[i] + " target: " + target + " target - nums[i]: " + (target - nums[i]) + " i: " + i + " nums[i]: " + nums[i]
            );
            hashMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
