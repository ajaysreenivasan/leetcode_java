/*
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */

import java.util.HashMap;

public class Solution169 {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        
        int majorityElement = 0;
        HashMap<Integer, Integer> elementTable = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (elementTable.containsKey(nums[i])) {
                elementTable.put(nums[i], elementTable.get(nums[i]) + 1);
            }
            else {
                elementTable.put(nums[i], 1);
            }
        }

        for (int key : elementTable.keySet()) {
            if (elementTable.get(key) >= Math.floor(nums.length / 2)) {
                majorityElement = key;
                break;
            }
        }

        return majorityElement;
    }
}
