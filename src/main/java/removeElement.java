public class removeElement {
  public static void main(String[] args) {
    int[] nums = {0,1,2,2,3,0,4,2};
    int val = 2;
    int k = removeElement(nums, val);
    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
    System.out.println(k);
  }
/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted,
you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which
are not equal to val. The remaining elements of nums are not important as well as the size of nums.

Return k.
 */
  public static int removeElement(int[] nums, int val) {
    int p1 = 0;
    int p2 = nums.length -1;
    int k = 0;
    while (p1 <= nums.length-1) {
      if (nums[p1] == val) {
        nums[p1] = nums[p2];
        nums[p2] = -99;
        k++;
        p2--;
      }else {
        p1++;

      }

    }
    k = nums.length -k;
    return k;
  }
}