import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class majorityElement {
  /*
  Given an array nums of size n, return the majority element.

  The majority element is the element that appears more than ⌊n / 2⌋ times.
  You may assume that the majority element always exists in the array.
   */
  public static void main(String[] args) {
    int[] nums = {3, 2, 2, 2, 3};
    int major = majorityElement(nums);
    System.out.println(major);
  }
//  public static int majorityElement(int[] nums){
//    int maj = 0;
//    int count=0;
//    List<Integer> counted = new ArrayList<>();
//
//    for (int i = 0; i < nums.length; i++) {
//      if (nums[i] == nums[maj] && !counted.contains(nums[maj])) {
//        count++;
//        if (count> nums.length/2){
//          return nums[maj];
//        }
//      }
//      if(i == nums.length-1 && maj < nums.length || counted.contains(nums[maj])){
//        i = 0;
//        if (!counted.contains(nums[maj])){
//          counted.add(nums[maj]);
//        }
//
//        maj++;
//        count = 0;
//      }

//    return nums[maj];
//  }
//}

  public int majorityElement(int[] nums) {
    // Initialize variables to keep track of the majority element and its occurrence count.
    int count = 0;
    int majority = 0;

    // Loop through the array to find the majority element using Boyer-Moore Majority Vote Algorithm.
    for (int i = 0; i < nums.length; i++) {

      // If the count is 0 and the current majority candidate is not equal to the current element,
      // update the majority candidate to the current element and set count to 1.
      if (count == 0 && majority != nums[i]) {
        majority = nums[i];
        count = 1;
      } else if (majority == nums[i]) {
        // If the current element is equal to the majority candidate, increment the count.
        count++;
      } else {
        // If the current element is not equal to the majority candidate, decrement the count.
        count--;
      }
    }

    // The majority variable will contain the element that appears more than ⌊n/2⌋ times in the array.
    return majority;
  }
}