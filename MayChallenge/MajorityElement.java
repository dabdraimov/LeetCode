// My Solution
class Solution {
    
    boolean majority(int[] nums, int i) {
        int majority = nums[i];
        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == majority) sum++;
        }
        
        return sum > nums.length / 2;
    }
    
    public int majorityElement(int[] nums) {
        for (int i = 0; i <= nums.length / 2 + 1; i++) {
            if (majority(nums, i)) return nums[i];
        }
        return -1;
    }
}

// Best Solution
 public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }