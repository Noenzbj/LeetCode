public class JumpGame {
  public static void main(String[] args) {
    int[]nums = {3,2,1,0,4};
    System.out.println(canJump(nums));
  }

  private static boolean canJump(int[] nums) {
//    int maxIndex = 0;
//    int maxNum=0;
//    for (int i = 0; i < nums.length; i++) {
//      if (i+nums[i]>= nums.length-1) {
//        return true;
//      } else if(nums[i] == 0){
//        return false;
//      } else if(nums[i] == 1) {
//        maxNum=1;
//        maxIndex = i;
//      }else{
//
//
//        for (int j = 0; j <= nums[i]; j++) {
//          if (nums[i + j] >= maxNum) {
//            maxNum = nums[i + j];
//            maxIndex = i+j;
//          }
//        }
//      }
//      i = i+ nums[maxIndex];
//      System.out.println(maxNum);
//    }
//

    return true;
  }
}
