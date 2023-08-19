public class RotateArray {
  public static void main(String[] args) {
    int [] nums = {1,2,3,4,5,6,7};
    int k =33;
    rotateArray(nums, k);
    dry.printIntArray(nums);
  }

  private static void rotateArray( int [] nums , int k){
    while (k > nums.length) {
      k = k - nums.length;
    }
    int[] arrayk = new int[nums.length -k];
    for (int i = 0; i < arrayk.length; i++) {
      arrayk[i] = nums[i];
    }
    for (int i = arrayk.length; i < nums.length; i++) {
      nums[i - nums.length+k]= nums[i];
    }
    dry.printIntArray(arrayk);
    for (int i = 0; i < arrayk.length; i++) {
       nums[i+(k)]=arrayk[i];
    }
//    int saveDigit;
//    int count = 0;
//    while (count != k){
//
//      for (int i = nums.length -1; i > 0 ; i--){
//
//          saveDigit = nums[i];
//          nums[i] = nums[i-1];
//          nums[i-1] = saveDigit;
//
//      }
//      count++;
//    }

  }
}
