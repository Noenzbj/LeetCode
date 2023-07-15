import java.util.ArrayList;
import java.util.List;

public class majorityElement {
  /*
  Given an array nums of size n, return the majority element.

  The majority element is the element that appears more than ⌊n / 2⌋ times.
  You may assume that the majority element always exists in the array.
   */
  public static void main(String[] args) {
    int[] nums = {3,2,2,2,3};
    int major = majorityElement(nums);
    System.out.println(major);
  }
  public static int majorityElement(int[] nums){
    int maj = 0;
    int count=0;
    List<Integer> counted = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == nums[maj] && !counted.contains(nums[maj])) {
        count++;
        if (count> nums.length/2){
          break;
        }
      }
      if(i == nums.length-1 && maj < nums.length || counted.contains(nums[maj])){
        i = 0;
        if (!counted.contains(nums[maj])){
          counted.add(nums[maj]);
        }

        maj++;
        count = 0;
      }
    }
    return nums[maj];
  }
}
