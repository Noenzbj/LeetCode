public class removeDuplicates2 {
  /*
  Given an integer array nums sorted in non-decreasing order,
  remove some duplicates in-place such that each unique element
  appears at most twice. The relative order of the elements
  should be kept the same.

  Since it is impossible to change the length of the array in some
  languages, you must instead have the result be placed in the first
  part of the array nums. More formally, if there are k elements
  after removing the duplicates, then the first k elements of nums
  should hold the final result. It does not matter what you leave
  beyond the first k elements.

  Return k after placing the final result in the first k slots of nums.

  Do not allocate extra space for another array. You must do this by
  modifying the input array in-place with O(1) extra memory.
   */
  public static void main(String[] args) {
    int[] nums = {0,0,1,1,1,1,2,3,3};
    int k = removeDuplicates(nums);
    dry.printIntArray(nums);
  }

  public static int removeDuplicates(int[] nums){
    int k = 0;
    int count = 1;

    for (int i = 1; i < nums.length; i++) {
      if (nums[k] != nums[i] || count <2) {
        k++;
        nums[k] = nums[i];
        count++;
      }else{
        count=1;
      }
    }
    return k+1;
  }
}
