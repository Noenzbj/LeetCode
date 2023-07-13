import java.util.Arrays;
import java.util.List;

public class removeDuplicates {
  /*
  Given an integer array nums sorted in non-decreasing order,
  remove the duplicates in-place such that each unique element
  appears only once. The relative order of the elements should
  be kept the same. Then return the number of unique elements in nums.

  Consider the number of unique elements of nums to be k, to get
  accepted, you need to do the following things:

  Change the array nums such that the first k elements of nums contain
  the unique elements in the order they were present in nums initially.
  The remaining elements of nums are not important as well as the size of nums.

  Return k.
    Example 1:

  Input: nums = [1,1,2]
  Output: 2, nums = [1,2,_]
   */
  public static void main(String[] args) {
    int[] nums = {0,0,2,2,2,3,3,4,5,5,5,5};
    int k = removeDuplicates(nums);
    for (int i = 0; i < k; i++) {
      System.out.print(nums[i]+ ", ");
    }

  }

  public static int removeDuplicates(int[] nums){
    int k=0;
      for (int i = 1; i < nums.length; i++) {
        if (nums[k] != nums[i]) {
          k++;
          nums[k] = nums[i];

        }
      }
    return k+1;
  }
}
