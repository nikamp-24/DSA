package Hashing;

import java.util.HashMap;

public class Hashing_04 {
    public static void majorityElement(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else {
                map.put(nums[i], 1);
            }
        }

        for (int key : map.keySet()){
            if (map.get(key) > n/3){
                System.out.println(key);
            }
        }
    }

    //Given an array nums of size n, return the majority element.
    public static void main(String[] args) {
        int nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
   majorityElement(nums);
    }
}
